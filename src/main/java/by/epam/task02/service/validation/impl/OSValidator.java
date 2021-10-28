package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.enums.OS;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * OSValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class OSValidator implements CriteriaValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
