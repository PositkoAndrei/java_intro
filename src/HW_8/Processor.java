package HW_8;

public class Processor {

    public void findCarsByBrend(Auto[] cars, String brend) {
        System.out.println("CarsByBrend => " + brend);

        for (Auto car : cars) {
            if (car.brand.equals(brend)) {
                System.out.println(car);

            }
        }
    }

    public void findCarsByModel(Auto[] cars, String model, int workingYears) {
        System.out.println("CarsByModel => " + model + workingYears);

        for (Auto car : cars) {
            if (car.model.equals(model) && car.workingYears() > workingYears) {
                System.out.println(car);
            }
        }
    }

    public void findCarsByProductionYear(Auto[] cars, int year, int price) {
        System.out.println("CarsByProductionYears => " + year + " " + price);

        for (Auto car : cars) {
            if (car.year == year && car.price > price) {
                System.out.println(car);
            }
        }
    }

    public void printCar(Auto car) {
        System.out.println("Auto [id = " + car.id);
        System.out.println("Brend = " + car.brand);
        System.out.println("Model = " + car.model);
        System.out.println("Year = " + car.year);
        System.out.println("Color = " + car.color);
        System.out.println("Price = " + car.price);
        System.out.println("RegisterNumber = " + car.registerNumber);

    }
}
