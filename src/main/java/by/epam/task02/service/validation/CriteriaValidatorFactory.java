package by.epam.task02.service.validation;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.entity.criteria.SearchCriteria;
import by.epam.task02.service.validation.impl.ApplianceNameValidator;
import by.epam.task02.service.validation.impl.CPUValidator;
import by.epam.task02.service.validation.impl.ColorValidator;
import by.epam.task02.service.validation.impl.DoubleValidator;
import by.epam.task02.service.validation.impl.IntValidator;
import by.epam.task02.service.validation.impl.OSValidator;

import java.util.HashMap;
import java.util.Map;

/**
 * CriteriaValidatorFactory class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class CriteriaValidatorFactory {

    private static final CriteriaValidatorFactory instance = new CriteriaValidatorFactory();
    private final Map<String, CriteriaValidator> validators = new HashMap<>();

    {
        validators.put(SearchCriteria.General.NAME.name(), new ApplianceNameValidator());
        validators.put(SearchCriteria.General.PRICE.name(), new DoubleValidator());
        validators.put(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), new DoubleValidator());
        validators.put(SearchCriteria.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), new DoubleValidator());
        validators.put(SearchCriteria.PriceFilter.EQUAL_CURRENT_PRICE.name(), new DoubleValidator());

        validators.put(SearchCriteria.Laptop.BATTERY_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.Laptop.OS.name(), new OSValidator());
        validators.put(SearchCriteria.Laptop.MEMORY_ROM.name(), new DoubleValidator());
        validators.put(SearchCriteria.Laptop.CPU.name(), new CPUValidator());
        validators.put(SearchCriteria.Laptop.DISPLAY_INCHES.name(), new DoubleValidator());

        validators.put(SearchCriteria.Oven.POWER_CONSUMPTION.name(), new DoubleValidator());
        validators.put(SearchCriteria.Oven.WEIGHT.name(), new DoubleValidator());
        validators.put(SearchCriteria.Oven.CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.Oven.DEPTH.name(), new DoubleValidator());
        validators.put(SearchCriteria.Oven.HEIGHT.name(), new DoubleValidator());
        validators.put(SearchCriteria.Oven.WIDTH.name(), new DoubleValidator());

        validators.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(), new DoubleValidator());
        validators.put(SearchCriteria.Refrigerator.WEIGHT.name(), new DoubleValidator());
        validators.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.Refrigerator.HEIGHT.name(), new DoubleValidator());
        validators.put(SearchCriteria.Refrigerator.WIDTH.name(), new DoubleValidator());

        validators.put(SearchCriteria.Speakers.POWER_CONSUMPTION.name(), new DoubleValidator());
        validators.put(SearchCriteria.Speakers.POWER_CONSUMPTION.name(), new DoubleValidator());
        validators.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), new IntValidator());
        validators.put(SearchCriteria.Speakers.CORD_LENGTH.name(), new DoubleValidator());

        validators.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.TabletPC.DISPLAY_INCHES.name(), new DoubleValidator());
        validators.put(SearchCriteria.TabletPC.MEMORY_ROM.name(), new DoubleValidator());
        validators.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchCriteria.TabletPC.COLOR.name(), new ColorValidator());

        validators.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(), new DoubleValidator());
        validators.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(), new DoubleValidator());
        validators.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name(), new DoubleValidator());
    }

    /**
     * private constructor
     */
    private CriteriaValidatorFactory() {
    }

    /**
     * Gets instance of CriteriaValidatorFactory
     *
     * @return instance instance
     */
    public static CriteriaValidatorFactory getInstance() {
        return instance;
    }


    /**
     * Method that gets needed validator.
     *
     * @param criteriaName name
     * @return validator validator
     */
    public CriteriaValidator getValidator(String criteriaName) {
        if (validators.containsKey(criteriaName)) {
            return validators.get(criteriaName);
        }
        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
    }

}
