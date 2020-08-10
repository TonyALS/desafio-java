package exercise3.models;

import java.time.Year;

public class Car {

    private Brand brand;
    private String model;
    private String color;
    private Year year;
    private String chassis;
    private Owner owner;
    private double maximumSpeed;
    private double currentSpeed;
    private int numberOfDoors;
    private boolean hasASunroof;
    private int numberOfMarches;
    private int currentGear;
    private boolean automaticGearbox;
    private double fuelVolume;

    public Car (Owner owner) {
        this.owner = owner;
    }

    public Car(Brand brand, String model, Year year, Owner owner, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.numberOfDoors = numberOfDoors;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isHasASunroof() {
        return hasASunroof;
    }

    public void setHasASunroof(boolean hasASunroof) {
        this.hasASunroof = hasASunroof;
    }

    public int getNumberOfMarches() {
        return numberOfMarches;
    }

    public void setNumberOfMarches(Integer numberOfMarches) {
        this.numberOfMarches = numberOfMarches;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public boolean isAutomaticGearbox() {
        return automaticGearbox;
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public boolean speedUp() {
        if (this.currentSpeed >= this.maximumSpeed) {
            return false;
        }
        this.currentSpeed += 1;
        return true;
    }

    public void brake() {
        this.currentSpeed = 0;
    }

    public void downshift() {
        if (this.currentGear > 0) {
            this.currentGear -= 1;
        }
    }

    public boolean reverseGear() {
        if (this.currentSpeed > 0) {
            return false;
        }
        this.currentGear = -1;
        return true;
    }

    public double autonomy(double averageConsumption) {
        double autonomy = this.fuelVolume * averageConsumption;
        return autonomy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!brand.equals(car.brand)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "{ " +
                "Marca: " + brand +
                ", Modelo: " + model +
                ", Ano: " + year +
                ", Proprietário: " + owner +
                " }";
    }
}
