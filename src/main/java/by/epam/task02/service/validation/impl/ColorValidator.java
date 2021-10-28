package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.enums.Color;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * ColorValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ColorValidator implements CriteriaValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
