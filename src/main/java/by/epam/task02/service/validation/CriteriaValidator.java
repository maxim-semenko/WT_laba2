package by.epam.task02.service.validation;

/**
 * CriteriaValidator interface.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public interface CriteriaValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
