package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * IntValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class IntValidator implements CriteriaValidator {

    /**
     * Method that checks valid of int.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}
