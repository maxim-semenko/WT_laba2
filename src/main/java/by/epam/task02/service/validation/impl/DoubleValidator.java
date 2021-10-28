package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * DoubleValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class DoubleValidator implements CriteriaValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
