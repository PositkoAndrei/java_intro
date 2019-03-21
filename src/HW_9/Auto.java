package HW_9;

public class Auto {

    int id;
    String brand;
    String model;
    int year;
    String color;
    int price;
    int registerNumber;

    public Auto(int id, String brand, String model,
                int year, String color, int price,
                int registerNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public int workingYears() {
        return 2019 - year;
    }
}



