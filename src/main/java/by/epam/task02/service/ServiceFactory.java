package by.epam.task02.service;

import by.epam.task02.service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Gets appliance service.
     *
     * @return the appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
