package HW_10;

public class TaxiParkRunner {
    public static void main(String[] args) {

        Car[] listOfCars = new Car[]{
                new AmphibianCar("diesel", "Volvo", "XC", "red",
                        8000, 60, 1254, 10),
                new AmphibianCar("diesel", "Mers", "Water", "white",
                        10000, 85, 2545, 12),
                new Truck("diesel", "Scania", "Long", "black", 35000,
                        140, 8547, 45),
                new LiquidTruck("petrol", "MAZ", "Ukr", "blue", 18000,
                        120, 9745, 65),
                new RefrigiratorTruck("petrol", "Mers", "G-800P", "red",
                        14000, 155, 9632, 85)
        };
        TaxiPark taxiPark = new TaxiPark(listOfCars);

        System.out.println("Price of Taxi park is: " + taxiPark.priceOfPark() + "$");

    }
}
