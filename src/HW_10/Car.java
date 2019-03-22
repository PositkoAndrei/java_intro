package HW_10;

public class Car {

    String typeOfEngine;
    String brand;
    String model;
    String color;
    int price;
    int maxSpeed;
    int registerNumber;
    double consumption;

    Car(String typeOfEngine, String brand, String model, String color, int price,
        int maxSpeed, int registerNumber, double consumption) {
        this.typeOfEngine = typeOfEngine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.registerNumber = registerNumber;
        this.consumption = consumption;
    }

    public String toString() {
        return "Type of Engine: " + this.typeOfEngine + "Brand: " + this.brand +
                "Model: " + model + "Color: " + color + "Price: " + price + "Maks Speed: "
                + maxSpeed + "Register Number: " + registerNumber + "Consumption: "
                + consumption;

    }
}
