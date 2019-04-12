package com.hillel.hw11.Car.Implementation;

abstract class RefrigiratorTruck extends Truck {
    private int coldTemperature;
    private int hotTemperature;

    RefrigiratorTruck (String typeOfEngine, String brand, int price,
                       int maksSpeed, int consumption) {

        super(typeOfEngine, brand, price, maksSpeed, consumption);
        this.coldTemperature = coldTemperature;
        this.hotTemperature = hotTemperature;
    }
    public int getColdTemperature() {
        return coldTemperature;
    }
    public void setColdTemperature(int coldTemperature) {
        this.coldTemperature = coldTemperature;
    }
    public int getHotTemperature() {
        return hotTemperature;
    }
    public void setHotTemperature(int hotTemperature) {
        this.hotTemperature = hotTemperature;
    }
    @Override
    public String toString() {
        return "Car {" +
                "typeOfEngine=' " + typeOfEngine + '\'' +
                "brand=' " + brand + '\'' +
                "price=' " + getPrice() +
                "maxSpeed=' " + getMaxSpeed() +
                "consumption=' " + getConsumption() +
                "coldTemperature=' " + getColdTemperature() +
                "hotTemperature=' " + getHotTemperature() +
                '}';



    }
}
