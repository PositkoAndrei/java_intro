package HW_9;

public class Processor {

    Auto[] arrOfCars; //Новый массив обьектов Auto
    // Этот массив как то связан с массивом Auto[] cars который в Runner?
    //Нужно в этот массив добавлять машины как это сделано в Auto[] cars?

    Processor(Auto[] arrOfCars) { //Конструктор, который принимает массив обьектов Auto
        this.arrOfCars = arrOfCars; //Устанавливаем его в поле
    }

    Processor() {               //Перегруженный конструктор
        this.arrOfCars = new Auto[0]; // Созаем в нем новый массив
    }                                   //Устанавливает новый массив в поле Auto[] arrOfCars


    public void findCarsByBrend(Auto[] cars, String brend) { //метод, который ищет марку в старом массиве.
        System.out.println("CarsByBrend => " + brend);

        for (Auto car : cars) {
            if (car.brand.equals(brend)) {
                System.out.println(car);

            }
        }
    }

    public void findCarsByBrend(String brend) { // Перегруженный метод. Ищет машины уже в новом массиве, если она там будет
        if (this.arrOfCars != null) {           //По условию - если в новом масиве будет хотябы одна машина
            findCarsByBrend(this.arrOfCars, brend); // то этот метод ищет машину с помощью функционала верхнего метода?
        }
    }


    public void findCarsByModel(Auto[] arrOfCars, String model, int workingYears) { //метод, который ищет модель в старом массиве.
        System.out.println("CarsByModel => " + model + workingYears);

        for (Auto car : arrOfCars) {
            if (car.model.equals(model) && car.workingYears() > workingYears) {
                System.out.println(car);
            }
        }
    }

    public void findCarsByModel(String model, int workingYears) { //Перегруженный метод.
        if (this.arrOfCars != null) {                              //Ищет машины уже в новом массиве, если она там будет
            findCarsByModel(this.arrOfCars, model, workingYears);
        }
    }


    public void findCarsByProductionYear(Auto[] cars, int year, int price) { //метод, который ищет машины по году выпуска в старом массиве.
        System.out.println("CarsByProductionYears => " + year + " " + price);

        for (Auto car : cars) {
            if (car.year == year && car.price > price) {
                System.out.println(car);
            }
        }
    }

    public void findCarsByProductionYear(int year, int price) { //Перегруженный метод.
        if (this.arrOfCars != null) {                           //Ищет машины уже в новом массиве, если она там будет
            findCarsByProductionYear(this.arrOfCars, year, price);
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


