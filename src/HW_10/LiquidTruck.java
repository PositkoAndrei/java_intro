package HW_10;

public class LiquidTruck extends Truck {
    int typeOfOil;

    LiquidTruck (String typeOfEngine, String brand, int price,
                 int maksSpeed, int consumption) {

        super(typeOfEngine, brand, price, maksSpeed, consumption);
        this.typeOfOil = typeOfOil;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", consumption=" + getConsumption() +
                ", typeOfOil =" + typeOfOil +
                '}';
    }
}
