package by.epam.task02.dao.factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.VacuumCleaner;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * VacuumCleanerFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class VacuumCleanerFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Power consumption field.
     */
    int powerConsumption;
    /**
     * The Motor speed regulation field.
     */
    double motorSpeedRegulation;
    /**
     * The Cleaning width field.
     */
    double cleaningWidth;

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

                SearchCriteria.VacuumCleaner vacuumCleanerSearchCriteria
                        = SearchCriteria.VacuumCleaner.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (vacuumCleanerSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER_CONSUMPTION:
                        powerConsumption = Integer.parseInt(value);
                        break;
                    case MOTOR_SPEED_REGULATION:
                        motorSpeedRegulation = Double.parseDouble(value);
                        break;
                    case CLEANING_WIDTH:
                        cleaningWidth = Double.parseDouble(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new VacuumCleaner(price, powerConsumption, motorSpeedRegulation, cleaningWidth);
    }

}
