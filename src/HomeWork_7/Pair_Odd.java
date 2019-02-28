package HomeWork_7;

public class Pair_Odd {
    public static void main(String[] args) {
        int mass1[];
        mass1 = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 - 1 == 0) {
                System.out.println("Нечетное число = " + mass1[i]);
            } else {
                System.out.println("Четное число = " + mass1[i]);
            }

        }
    }
}