package de.neuefische;

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

    String brand;
    String model;
    String color;
    String yearOfManufacture;
    int speed;

    public Car(String brand, String model, String color, String yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public void starts(){
        System.out.println("The " + brand + " " + model + " got started");
    }

    public void accelerates(){
        speed++;
        System.out.println("The " + brand + " " + model + " travels with " + speed + " km/h");
    }
}
