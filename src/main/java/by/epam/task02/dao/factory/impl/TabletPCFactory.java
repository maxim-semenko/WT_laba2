package by.epam.task02.dao.factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.TabletPC;
import by.epam.task02.entity.criteria.SearchCriteria;
import by.epam.task02.entity.enums.Color;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TabletPCFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class TabletPCFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Memory rom field.
     */
    int memoryRom;
    /**
     * The Flash memory capacity field.
     */
    int flashMemoryCapacity;
    /**
     * The Battery capacity field.
     */
    double batteryCapacity;
    /**
     * The Display inches field.
     */
    double displayInches;
    /**
     * The Color field.
     */
    Color color;

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

                SearchCriteria.TabletPC tabletPCSearchCriteria = SearchCriteria.TabletPC.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case BATTERY_CAPACITY:
                        batteryCapacity = Double.parseDouble(value);
                        break;
                    case DISPLAY_INCHES:
                        displayInches = Double.parseDouble(value);
                        break;
                    case MEMORY_ROM:
                        memoryRom = Integer.parseInt(value);
                        break;
                    case FLASH_MEMORY_CAPACITY:
                        flashMemoryCapacity = Integer.parseInt(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new TabletPC(price, batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

}
