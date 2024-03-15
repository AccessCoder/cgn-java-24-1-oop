package de.neuefische.car;

import java.util.Objects;

/**
 * Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc. V
 *
 * Step 2: Implement a method that "starts" the car and outputs a message. V
 *
 * Step 3: Create an object of the class 'Car' and call the method to start it. V
 *
 * Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed. V
 *
 * Step 5: Create a second object of the class 'Car', accelerate it, and display the speed. V
 */
public class Car {
    //Information Hiding -> Encapsulation
    private String brand;
    private String model;
    private String color;
    private String yearOfManufacture;
    private int speed;
    private int percentOfGas = 10;

    public Car(String brand, String model, String color, String yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    // GETTER -> Lesezugriff
    public String getBrand(){
        return brand;
    }

    // SETTER -> Schreibzugriff
    public void setBrand(String brand){
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


    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPercentOfGas() {
        return percentOfGas;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", speed=" + speed +
                ", percentOfGas=" + percentOfGas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && percentOfGas == car.percentOfGas && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(yearOfManufacture, car.yearOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfManufacture, speed, percentOfGas);
    }

    public void fillGasTank(int fillAmount){
        percentOfGas += fillAmount;
        System.out.println("The new percentage of gas in the tank is: " + percentOfGas);
    }
    public void starts(){
        System.out.println("The " + brand + " " + model + " got started");
    }

    public void accelerates(){
        speed++;
        System.out.println("The " + brand + " " + model + " travels with " + speed + " km/h");
    }
}
