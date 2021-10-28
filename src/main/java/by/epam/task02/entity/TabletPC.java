package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.SearchCriteriaConstant;
import by.epam.task02.entity.enums.Color;

import java.util.Objects;

/**
 * TabletPC class entity.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class TabletPC extends Appliance {
    /**
     * Field batteryCapacity of tabletPC
     */
    private double batteryCapacity;
    /**
     * Field displayInches of tabletPC
     */
    private double displayInches;
    /**
     * Field memoryRom of tabletPC
     */
    private double memoryRom;
    /**
     * Field flashMemoryCapacity of tabletPC
     */
    private double flashMemoryCapacity;
    /**
     * Field color of tabletPC
     */
    private Color color;

    /**
     * Instantiates a new Tablet pc.
     */
    public TabletPC() {
    }

    /**
     * Instantiates a new Tablet pc.
     *
     * @param price               the price
     * @param batteryCapacity     the battery capacity
     * @param displayInches       the display inches
     * @param memoryRom           the memory rom
     * @param flashMemoryCapacity the flash memory capacity
     * @param color               the color
     */
    public TabletPC(double price,
                    double batteryCapacity,
                    double displayInches,
                    double memoryRom,
                    double flashMemoryCapacity,
                    Color color) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
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
                return ApplianceNameConstant.TABLET_PC.equals(value);
            case SearchCriteriaConstant.BATTERY_CAPACITY:
                return (double) value == batteryCapacity;
            case SearchCriteriaConstant.DISPLAY_INCHES:
                return (double) value == displayInches;
            case SearchCriteriaConstant.MEMORY_ROM:
                return (double) value == memoryRom;
            case SearchCriteriaConstant.FLASH_MEMORY_CAPACITY:
                return (double) value == flashMemoryCapacity;
            case SearchCriteriaConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            default:
                return false;
        }
    }

    /**
     * Gets batteryCapacity value
     *
     * @return batteryCapacity battery capacity
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Gets displayInches value
     *
     * @return displayInches display inches
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * Gets memoryRom value
     *
     * @return memoryRom memory rom
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * Gets flashMemoryCapacity value
     *
     * @return flashMemoryCapacity flash memory capacity
     */
    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * Gets color value
     *
     * @return color color
     */
    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && Double.compare(tabletPC.displayInches, displayInches) == 0 && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "price=" + super.getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
