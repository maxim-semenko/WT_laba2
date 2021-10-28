package by.epam.task02.dao;

import by.epam.task02.dao.impl.ApplianceDAOImpl;

/**
 * DAOFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * private constructor
     */
    private DAOFactory() {
    }

    /**
     * Gets appliance dao.
     *
     * @return the appliance dao
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
