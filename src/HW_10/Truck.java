package HW_10;

public class Truck extends Car {
    int cargocapacity;

    Truck(String typeOfEngine, String brand, String model, String color, int price,
          int maksSpeed, int registerNumber, double consumption) {

        super(typeOfEngine, brand, model, color, price, maksSpeed, registerNumber, consumption);
        this.cargocapacity = cargocapacity;
    }

    public String toString() {
        return super.toString();
    }
}
