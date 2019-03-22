package HW_10;

public class RefrigiratorTruck extends Truck {
    int coldTemperature;
    int hotTemperature;

    RefrigiratorTruck (String typeOfEngine, String brand, String model, String color, int price,
                       int maksSpeed, int registerNumber, double consumption) {

        super(typeOfEngine, brand, model, color, price, maksSpeed, registerNumber, consumption);
        this.coldTemperature = coldTemperature;
        this.hotTemperature = hotTemperature;
    }

    public String toString() {
        return super.toString();
    }
}
