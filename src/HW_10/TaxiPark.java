package HW_10;

public class TaxiPark {
    private Car[] taxiPark;

    public TaxiPark (Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    public int priceOfPark() {
        int carPrice = 0;

        for (int i = 0; i < this.taxiPark.length; i++) {
            carPrice += this.taxiPark[i].getPrice();
        }
        return carPrice;
    }
    public void sortCarsByFuelConsumption() {
        for (int i = 0; i < taxiPark.length; i++) {
            for (int j = i + 1; j < taxiPark.length; j++) {
                if (taxiPark[j].getConsumption() < taxiPark[i].getConsumption()) {
                    Car temp = taxiPark[j];
                    taxiPark[j] = taxiPark[i];
                    taxiPark[i] = temp;
                }
            }
        }
    }
    public Car[] findCarsBySpeedRange(int minSpeegd, int maxSpeed) {
        Car[] res = {};

        for (Car car : getCars()) {
            if (car.getMaxSpeed() >= minSpeegd && car.getMaxSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }
        return res;
    }
    private Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] taxiPark) {
        if (taxiPark.length == 0) {
            return new Car[]{carToAdd};
        }else {
            Car[] newCarsArr = new Car[taxiPark.length + 1];

            for (int i = 0; i < taxiPark.length; i++) {
                newCarsArr[i] = taxiPark[i];
            }
            newCarsArr[taxiPark.length] = carToAdd;
            return newCarsArr;
        }
    }
    public Car[] getCars() {
        return taxiPark;
    }
    public void setTaxiPark(Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }
    @Override
    public String toString() {
        String result = "";

        for (Car car : taxiPark) {
            result += (car.toString() + "\n");
        }
        return result;
    }
}
