package by.epam.task02.util;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.entity.Appliance;

import java.util.List;

/**
 * Class that print info of appliances.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class PrinterAppliance {

    /**
     * Method that prints information.
     *
     * @param appliances the appliances
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_EMPTY_EXCEPTION_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}
