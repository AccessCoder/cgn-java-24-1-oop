package de.neuefische;

public class Main2 {

    public static void main(String[] args) {
        Car newCar = new Car("BMW", "3",
                "Grün", "2005", 0);

        newCar.starts();

        Car secondCar = new Car("VW", "Golf",
                "White", "2016", 0);

        secondCar.accelerates();
        secondCar.accelerates();
        secondCar.accelerates();
        secondCar.accelerates();
        secondCar.accelerates();
        System.out.println(secondCar.speed);
        System.out.println(newCar.speed);
    }
}
