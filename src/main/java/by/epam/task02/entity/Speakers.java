package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.SearchCriteriaConstant;

import java.util.Objects;

/**
 * Speakers class entity.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class Speakers extends Appliance {

    /**
     * powerConsumption field
     */
    private double powerConsumption;
    /**
     * numberOfSpeakers field
     */
    private int numberOfSpeakers;
    /**
     * cordLength field
     */
    private double cordLength;

    /**
     * Instantiates a new Speakers.
     */
    public Speakers() {
    }

    /**
     * Instantiates a new Speakers.
     *
     * @param price            the price
     * @param powerConsumption the power consumption
     * @param numberOfSpeakers the number of speakers
     * @param cordLength       the cord length
     */
    public Speakers(double price, double powerConsumption, int numberOfSpeakers, double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
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
                return ApplianceNameConstant.SPEAKERS.equals(value);
            case SearchCriteriaConstant.POWER_CONSUMPTION:
                return (double) value == powerConsumption;
            case SearchCriteriaConstant.NUMBER_OF_SPEAKERS:
                return (int) value == numberOfSpeakers;
            case SearchCriteriaConstant.CORD_LENGTH:
                return (double) value == cordLength;
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
     * Gets numberOfSpeakers value
     *
     * @return numberOfSpeakers number of speakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * Gets cordLength value
     *
     * @return cordLength cord length
     */
    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 && numberOfSpeakers == speakers.numberOfSpeakers && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                '}';
    }
}
