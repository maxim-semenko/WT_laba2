package by.epam.task02.dao.factory;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.factory.impl.LaptopFactory;
import by.epam.task02.dao.factory.impl.OvenFactory;
import by.epam.task02.dao.factory.impl.RefrigeratorFactory;
import by.epam.task02.dao.factory.impl.SpeakersFactory;
import by.epam.task02.dao.factory.impl.TabletPCFactory;
import by.epam.task02.dao.factory.impl.VacuumCleanerFactory;
import by.epam.task02.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * ApplianceFactory abstract class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public abstract class ApplianceFactory {

    /**
     * Create appliance appliance.
     *
     * @param nodeList the node list
     * @return the appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets appliance factory.
     *
     * @param applianceName the appliance name
     * @return the appliance factory
     */
    public static ApplianceFactory getApplianceFactory(String applianceName) {
        switch (applianceName) {
            case ApplianceNameConstant.LAPTOP:
                return new LaptopFactory();
            case ApplianceNameConstant.OVEN:
                return new OvenFactory();
            case ApplianceNameConstant.REFRIGERATOR:
                return new RefrigeratorFactory();
            case ApplianceNameConstant.SPEAKERS:
                return new SpeakersFactory();
            case ApplianceNameConstant.TABLET_PC:
                return new TabletPCFactory();
            case ApplianceNameConstant.VACUUM_CLEANER:
                return new VacuumCleanerFactory();
            default:
                throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        }
    }

}
