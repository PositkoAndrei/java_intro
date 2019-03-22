package HW_10;

public class AmphibianCar extends Car {
    int propeller;

    AmphibianCar(String typeOfEngine, String brand, String model, String color, int price,
                 int maksSpeed, int registerNumber, double consumption) {

        super(typeOfEngine, brand, model, color, price, maksSpeed, registerNumber, consumption);
        this.propeller = propeller;

    }

    public String toString() {
        return super.toString();
    }
}
