package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.SearchCriteriaConstant;

import java.util.Objects;

/**
 * Refrigerator class entity.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class Refrigerator extends Appliance {
    /**
     * Field powerConsumption of refrigerator
     */
    private double powerConsumption;
    /**
     * Field weight of refrigerator
     */
    private double weight;
    /**
     * Field freezerCapacity of refrigerator
     */
    private double freezerCapacity;
    /**
     * Field overallCapacity of refrigerator
     */
    private double overallCapacity;
    /**
     * Field height of refrigerator
     */
    private double height;
    /**
     * Field width of refrigerator
     */
    private double width;

    /**
     * Parameterless Refrigerator constructor - creating a new Refrigerator object
     */
    public Refrigerator() {
    }

    /**
     * Refrigerator constructor - creating a new Refrigerator object with parameters
     *
     * @param price            - price
     * @param powerConsumption - power consumption
     * @param weight           - weight
     * @param freezerCapacity  - freezer capacity
     * @param overallCapacity  - overall capacity
     * @param height           - height
     * @param width            - width
     */
    public Refrigerator(double price,
                        double powerConsumption,
                        double weight,
                        double freezerCapacity,
                        double overallCapacity,
                        double height,
                        double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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
                return ApplianceNameConstant.REFRIGERATOR.equals(value);
            case SearchCriteriaConstant.POWER_CONSUMPTION:
                return (double) value == powerConsumption;
            case SearchCriteriaConstant.WEIGHT:
                return (double) value == weight;
            case SearchCriteriaConstant.FREEZER_CAPACITY:
                return (double) value == freezerCapacity;
            case SearchCriteriaConstant.OVERALL_CAPACITY:
                return (double) value == overallCapacity;
            case SearchCriteriaConstant.HEIGHT:
                return (double) value == height;
            case SearchCriteriaConstant.WIDTH:
                return (double) value == width;
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
     * Gets weight value
     *
     * @return weight weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets freezerCapacity value
     *
     * @return freezerCapacity freezer capacity
     */
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Gets overallCapacity value
     *
     * @return overallCapacity overall capacity
     */
    public double getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Gets height value
     *
     * @return height height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets width value
     *
     * @return width width
     */
    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 && Double.compare(that.weight, weight) == 0 && Double.compare(that.freezerCapacity, freezerCapacity) == 0 && Double.compare(that.overallCapacity, overallCapacity) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
