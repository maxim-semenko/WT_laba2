package by.epam.task02.dao.impl;

import by.epam.task02.constant.FilenameConstant;
import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.ResourceException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplianceDAOImpl class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ApplianceDAOImpl implements ApplianceDAO {

    /**
     * Method that reads the information from xml file
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ResourceException {
        List<Appliance> appliances = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document
                    = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(FilenameConstant.APPLIANCES_XML)).getFile());
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(node.getNodeName());

                    if (criteria.getGroupSearchName().equals(node.getNodeName())) {
                        Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());

                        if (criteria.getCriteriaMap()
                                .entrySet()
                                .stream()
                                .allMatch(entry -> appliance.isMatchesCriteria(entry.getKey(), entry.getValue()))) {
                            appliances.add(appliance);
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new ResourceException(e);
        }
        return appliances;
    }

}