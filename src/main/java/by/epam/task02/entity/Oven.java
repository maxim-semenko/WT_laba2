package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.SearchCriteriaConstant;

import java.util.Objects;

/**
 * Oven class entity.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class Oven extends Appliance {
    /**
     * Field powerConsumption of oven
     */
    private double powerConsumption;
    /**
     * Field weight of oven
     */
    private double weight;
    /**
     * Field capacity of oven
     */
    private double capacity;
    /**
     * Field depth of oven
     */
    private double depth;
    /**
     * Field height of oven
     */
    private double height;
    /**
     * Field width of oven
     */
    private double width;

    /**
     * Instantiates a new Oven.
     */
    public Oven() {
    }

    /**
     * Instantiates a new Oven.
     *
     * @param price            the price
     * @param powerConsumption the power consumption
     * @param weight           the weight
     * @param capacity         the capacity
     * @param depth            the depth
     * @param height           the height
     * @param width            the width
     */
    public Oven(double price,
                double powerConsumption,
                double weight,
                double capacity,
                double depth,
                double height,
                double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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
                return ApplianceNameConstant.OVEN.equals(value);
            case SearchCriteriaConstant.POWER_CONSUMPTION:
                return (double) value == powerConsumption;
            case SearchCriteriaConstant.WEIGHT:
                return (double) value == weight;
            case SearchCriteriaConstant.CAPACITY:
                return (double) value == capacity;
            case SearchCriteriaConstant.DEPTH:
                return (double) value == depth;
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
     * Gets capacity value
     *
     * @return capacity capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Gets depth value
     *
     * @return depth depth
     */
    public double getDepth() {
        return depth;
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
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption && Double.compare(oven.weight, weight) == 0 && capacity == oven.capacity && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
