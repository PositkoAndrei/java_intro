package HW_10;

public class AmphibianCar extends Car {
    private int propeller;

    AmphibianCar(String typeOfEngine, String brand, int price,
                 int maksSpeed, int consumption) {

        super(typeOfEngine, brand, price, maksSpeed, consumption);
        this.propeller = propeller;
    }
    public int getPropeller() {
        return propeller;
    }
    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }
    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", consumption=" + getConsumption() +
                ", propeller =" + propeller +
                '}';
    }
}
