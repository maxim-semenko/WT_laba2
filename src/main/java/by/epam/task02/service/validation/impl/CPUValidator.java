package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.enums.CPU;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * CPUValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class CPUValidator implements CriteriaValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
