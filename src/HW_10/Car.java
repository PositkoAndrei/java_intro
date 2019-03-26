package HW_10;

public class Car {

    String typeOfEngine;
    String brand;
    private int price;
    private int maxSpeed;
    private int consumption;

    Car(String typeOfEngine, String brand, int price,
        int maxSpeed, int consumption) {
        this.typeOfEngine = typeOfEngine;
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

//    public Car (int price, int maxSpeed) {
//        this (price, 0, maxSpeed);
//    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
     public int getConsumption() {
        return consumption;
     }
      public void setConsumption(int consumption) {
        this.consumption = consumption;
      }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", consumption=" + consumption +
                '}';
    }
}
