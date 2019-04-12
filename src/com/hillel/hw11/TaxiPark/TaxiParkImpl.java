package com.hillel.hw11.TaxiPark;

import com.hillel.hw11.Car.Implementation.Car;
import com.hillel.hw11.TaxiPark.TaxiParkInter;

import java.util.Arrays;

abstract class TaxiParkImpl implements TaxiParkInter {
    public Car[] taxiPark;

    public TaxiParkImpl(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int costOfCars() {
        int carParkCost = 0;

        for (Car car : taxiPark) {
            carParkCost += car.getPrice();
        }
        return carParkCost;
    }

    public void sortCarsByFuelConsumption() {
        for (int i = taxiPark.length - 1; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (taxiPark[j].getConsumption() > taxiPark[j + 1].getConsumption()) {
                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[j + 1];
                    taxiPark[j + 1] = temp;
                }
            }
        }
    }

    public Car[] findCarsBySpeeed(int minSpeed, int maxSpeed) {
        Car[] carsBySpeed = null;

        for (Car car : taxiPark) {
            if (car.getMaxSpeed() <= maxSpeed & car.getMaxSpeed() >= minSpeed) {
                if (carsBySpeed == null) {
                    carsBySpeed = new Car[1];
                    carsBySpeed[0] = car;
                } else {
                    Car[] tempCars = new Car[carsBySpeed.length + 1];

                    for (int i = 0; i < carsBySpeed.length; i++) {
                        tempCars[i] = carsBySpeed[i];
                    }
                    tempCars[tempCars.length - 1] = car;
                    carsBySpeed = tempCars;
                }
            }
        }
        return carsBySpeed;
    }

    @Override
    public String toString() {
        return "TaxiParkImpl{" +
                "taxiPark=" + Arrays.toString(taxiPark) +
                '}';
    }
}


