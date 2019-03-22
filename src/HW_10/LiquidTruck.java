package HW_10;

public class LiquidTruck extends Truck {
    int typeOfOil;

    LiquidTruck (String typeOfEngine, String brand, String model, String color, int price,
                 int maksSpeed, int registerNumber, double consumption) {

        super(typeOfEngine, brand, model, color, price, maksSpeed, registerNumber, consumption);
        this.typeOfOil = typeOfOil;
    }

    public String toString() {
        return super.toString();
    }
}
