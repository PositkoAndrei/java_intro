package HomeWork_7;

public class Max_Min {
    public static void main(String[] args) {
        int mass[];
        mass = new int[]{121,20,5,45,-8,698,32,87,29,46};
        int x = mass[0];
        int y = mass[0];

        for(int i = 0;i<mass.length;i++){
            if(mass[i]>= x) {
                x = mass[i];
            }
            if(mass[i]<= y) {
                y = mass[i];
            }
        }
        System.out.println("Максимальное число: " + x);
        System.out.println("Минимальное число: " + y);
    }

}

