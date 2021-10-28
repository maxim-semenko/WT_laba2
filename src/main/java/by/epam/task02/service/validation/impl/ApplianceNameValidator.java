package by.epam.task02.service.validation.impl;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * ApplianceNameValidator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class ApplianceNameValidator implements CriteriaValidator {

    /**
     * Method that checks valid of criteria name.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            switch ((String) value) {
                case ApplianceNameConstant.LAPTOP:
                case ApplianceNameConstant.OVEN:
                case ApplianceNameConstant.REFRIGERATOR:
                case ApplianceNameConstant.SPEAKERS:
                case ApplianceNameConstant.TABLET_PC:
                case ApplianceNameConstant.VACUUM_CLEANER:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
