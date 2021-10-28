package by.epam.task02.service;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.ResourceException;
import by.epam.task02.exception.ServiceException;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param criteria the criteria
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Criteria criteria) throws ResourceException, ServiceException;

}
