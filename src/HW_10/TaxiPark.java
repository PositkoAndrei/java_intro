package HW_10;

public class TaxiPark {
    Car[] taxiPark;

    TaxiPark (Car[] taxiPark) {
        this.taxiPark = taxiPark;
    }

    int priceOfPark() {
        int carPrice = 0;

        for (int i = 0; i < this.taxiPark.length; i++) {
            carPrice += this.taxiPark[i].price;
        }
        return carPrice;
    }

}
