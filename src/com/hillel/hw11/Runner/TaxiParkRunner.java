package com.hillel.hw11.Runner;
import com.hillel.hw11.Car.CarInter;
import com.hillel.hw11.TaxiPark.TaxiParkInter;

import java.util.Arrays;


    public class TaxiParkRunner {
        public static void main(String[] args) {

            CarInter[] cars = new CarInter[]{
                    new AmphibianCar("diesel", "Volvo", 8000, 110, 10),
                    new AmphibianCar("diesel", "Mers", 10000, 120, 12),
                    new Truck("diesel", "Scania",14000, 200, 45),
                    new LiquidTruck("petrol", "MAZ",12000, 80, 65),
                    new RefrigiratorTruck("petrol", "Mers",16000, 155,
                            85)};

            TaxiParkInter Park = new TaxiParkInter(cars);

            System.out.println(Park.priceOfPark());
            System.out.println();

            System.out.println(Park);
            System.out.println();

            Park.sortCarsByFuelConsumption();
            System.out.println(Park);

            System.out.println(Arrays.toString(Park.findCarsBySpeedRange(60, 200)));
            System.out.println(Park.findCarsBySpeedRange(60, 200));


            System.out.println("Price of Taxi park is: " + Park.priceOfPark() + "$");

        }
}
