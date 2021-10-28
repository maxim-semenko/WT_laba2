package by.epam.task02.dao;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.ResourceException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances by given criteria.
     *
     * @param criteria {@link Criteria}
     * @return list of appliance
     * @throws ResourceException exception
     */
    List<Appliance> find(Criteria criteria) throws ResourceException;
}
