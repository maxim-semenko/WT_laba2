package by.epam.task02.entity.criteria;

/**
 * SearchCriteria class.
 * Contains all search criteria.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public final class SearchCriteria {

    /**
     * Contains General search criteria
     */
    public enum General {
        NAME, PRICE
    }

    /**
     * Contains Oven search criteria
     */
    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Contains Laptop search criteria
     */
    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    /**
     * Contains Refrigerator search criteria
     */
    public enum Refrigerator {
        PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Contains VacuumCleaner search criteria
     */
    public enum VacuumCleaner {
        PRICE, POWER_CONSUMPTION, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Contains TabletPC search criteria
     */
    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Contains Speakers search criteria
     */
    public enum Speakers {
        PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH
    }

    /**
     * Contains PriceFilter search criteria
     */
    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }

    /**
     * Private constructor.
     */
    private SearchCriteria() {
    }
}

