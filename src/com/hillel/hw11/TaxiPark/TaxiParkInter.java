package com.hillel.hw11.TaxiPark;

import com.hillel.hw11.Car.Implementation.Car;

public interface TaxiParkInter {
    int costOfCars();

    void sortCarsByFuelConsumption();

    Car[] findCarsBySpeed(int minSpeed, int maxSpeed);


}
