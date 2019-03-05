package HW_8;

public class Runner {
    public static void main(String[] args) {
        Auto[] cars = new Auto[]{
                new Auto(1, "VW", "Passat", 2000, "Red", 3000, 1234),
                new Auto(2, "Audi", "Q7", 2017, "White", 70000, 5875),
                new Auto(3, "Mercedes", "S-500", 2010,"Black", 15000, 5897),
                new Auto(4, "ВАЗ", "2105", 1990, "White", 1000, 7895),
                new Auto(5, "ВАЗ", "21099", 2005, "Green", 2500, 4125),
                new Auto(6, "Toyota", "Avensis", 2010, "Grey", 12000, 8521),
                new Auto(7, "Lexus", "RX 350", 2013, "Black", 45000, 7456),
                new Auto(8, "Shkoda", "Octavia", 2009, "White", 8000, 9654),
                new Auto(9, "Daewoo", "Sens", 2005, "Blue", 3400, 5874)};

        Processor processor = new Processor();

        processor.findCarsByBrend(cars, "Toyota");
        processor.findCarsByModel(cars, "Avensis", 2010);
        processor.findCarsByProductionYear(cars, 2010, 12000);
    }
}
