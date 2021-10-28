package by.epam.task02.dao.factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Oven;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * OvenFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class OvenFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Power consumption field.
     */
    double powerConsumption;
    /**
     * The Weight field.
     */
    double weight;
    /**
     * The Capacity field.
     */
    double capacity;
    /**
     * The Depth field.
     */
    double depth;
    /**
     * The Height field.
     */
    double height;
    /**
     * The Width field.
     */
    double width;

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

                SearchCriteria.Oven ovenSearchCriteria
                        = SearchCriteria.Oven.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (ovenSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER_CONSUMPTION:
                        powerConsumption = Double.parseDouble(value);
                        break;
                    case WEIGHT:
                        weight = Double.parseDouble(value);
                        break;
                    case CAPACITY:
                        capacity = Double.parseDouble(value);
                        break;
                    case DEPTH:
                        depth = Double.parseDouble(value);
                        break;
                    case HEIGHT:
                        height = Double.parseDouble(value);
                        break;
                    case WIDTH:
                        width = Double.parseDouble(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }

            }
        }
        return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
    }

}
