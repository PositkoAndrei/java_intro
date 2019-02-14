package HomeWork_5;

public class While_do {
        public static void main(String[] args) {
            int count = 1;
            int a = 7;
            do {
                System.out.println("Номер числа:" + count + ", число " + a+ " ");
                a+=7;
            } while (++count <= 15);
        }
    }

