package by.epam.task02.service.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.DAOFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.ResourceException;
import by.epam.task02.exception.ServiceException;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.validation.Validator;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param criteria the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
