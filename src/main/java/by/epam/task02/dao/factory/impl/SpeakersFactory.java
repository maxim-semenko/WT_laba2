package by.epam.task02.dao.factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Speakers;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * SpeakersFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class SpeakersFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Number of speakers field.
     */
    int numberOfSpeakers;
    /**
     * The Cord length field.
     */
    double cordLength;
    /**
     * The Power consumption field.
     */
    double powerConsumption;

    /**
     * Method that create appliance
     *
     * @param nodeList the node list
     * @return appliance {@link Appliance}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.Speakers speakersSearchCriteria
                        = SearchCriteria.Speakers.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (speakersSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER_CONSUMPTION:
                        powerConsumption = Double.parseDouble(value);
                        break;
                    case NUMBER_OF_SPEAKERS:
                        numberOfSpeakers = Integer.parseInt(value);
                        break;
                    case CORD_LENGTH:
                        cordLength = Double.parseDouble(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new Speakers(price, powerConsumption, numberOfSpeakers, cordLength);
    }

}
