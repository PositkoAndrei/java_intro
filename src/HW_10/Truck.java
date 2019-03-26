package HW_10;

public class Truck extends Car {
    private int cargocapacity;

    Truck(String typeOfEngine, String brand, int price,
          int maksSpeed, int consumption) {

        super(typeOfEngine, brand, price, maksSpeed, consumption);
        this.cargocapacity = cargocapacity;
    }

    public int getCargocapacity() {
        return cargocapacity;
    }

    public void setCargocapacity(int cargocapacity) {
        this.cargocapacity = cargocapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", consumption=" + getConsumption() +
                ", cargocapacity =" + cargocapacity+
                '}';
    }
}
