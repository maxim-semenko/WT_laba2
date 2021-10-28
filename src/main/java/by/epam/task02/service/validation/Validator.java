package by.epam.task02.service.validation;

import by.epam.task02.entity.criteria.Criteria;

/**
 * Validator class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class Validator {

    /**
     * Validates criteria by its SearchCriteria.
     *
     * @param criteria - criteria to validate
     * @return true if criteria is valid. Otherwise, false.
     */
    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}