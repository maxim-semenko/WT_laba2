package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.SearchCriteriaConstant;

import java.util.Objects;

/**
 * VacuumCleaner class entity.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class VacuumCleaner extends Appliance {
    /**
     * Field powerConsumption of vacuumCleaner
     */
    private double powerConsumption;
    /**
     * Field motorSpeedRegulation of vacuumCleaner
     */
    private double motorSpeedRegulation;
    /**
     * Field cleaningWidth of laptop
     */
    private double cleaningWidth;

    /**
     * Instantiates a new Vacuum cleaner.
     */
    public VacuumCleaner() {
    }

    /**
     * Instantiates a new Vacuum cleaner.
     *
     * @param price                the price
     * @param powerConsumption     the power consumption
     * @param motorSpeedRegulation the motor speed regulation
     * @param cleaningWidth        the cleaning width
     */
    public VacuumCleaner(double price,
                         double powerConsumption,
                         double motorSpeedRegulation,
                         double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        switch (criteriaName) {
            case SearchCriteriaConstant.PRICE:
            case SearchCriteriaConstant.MORE_THAN_CURRENT_PRICE:
            case SearchCriteriaConstant.LESS_THAN_CURRENT_PRICE:
            case SearchCriteriaConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(criteriaName, value);
            case SearchCriteriaConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.VACUUM_CLEANER.equals(value);
            case SearchCriteriaConstant.POWER_CONSUMPTION:
                return (double) value == powerConsumption;
            case SearchCriteriaConstant.MOTOR_SPEED_REGULATION:
                return (double) value == motorSpeedRegulation;
            case SearchCriteriaConstant.CLEANING_WIDTH:
                return (double) value == cleaningWidth;
            default:
                return false;
        }
    }

    /**
     * Gets powerConsumption value
     *
     * @return powerConsumption power consumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Gets motorSpeedRegulation value
     *
     * @return motorSpeedRegulation motor speed regulation
     */
    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Gets cleaningWidth value
     *
     * @return cleaningWidth cleaning width
     */
    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption
                && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(that.cleaningWidth, cleaningWidth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
