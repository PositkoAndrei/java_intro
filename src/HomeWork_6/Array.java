package HomeWork_6;


import java.sql.SQLOutput;

//Найти индекс элемента, значение которого равно 15.
public class Array {
    public static void main(String[] args) {
        int[] MyArray = new int[]{1, 12, 13, 15, 20};
      FindindexArray(MyArray);
//        printArray(MyArray);
    }
    public static double FindindexArray(int[] arr) {
        int n = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                System.out.println("Индекс элемента:" + 1 + "Значение " + arr[i]);

        }
        return n;
    }
}

//Задание 2.
//Найти индекс элемента, значение которого равно 15,но чтобы 15 не было
//в массиве, т.е пройтись по всем элементам, ничего не найти и вывести в консоль
//что ничего не нашли. Сделать с помощью For&While

//    public static double FindindexArray(int[] arr) {
//        int n = 15;
//        int a = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == n) {
//                System.out.println("Индекс элемента - " + i + " Значение " + arr[i]);
//                return n;
//            }
//        }
//        System.out.println("Ничего не найдено!");
//        return a;
//    }
//}

//Задание 3.
//Пройтись по массиву и напечатать каждый 2й элемент в консоль.

//    public static void FindindexArray(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if ((i % 2) != 0) {
//                System.out.println("Индекс элемента:" + i + "Значение " + arr[i]);
//                break;
//            }
//        }
//    }
//}

//Задание 4.
//Найти максимальный элемент
//        public static void FindindexArray(int[] arr) {
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                System.out.println("Максимальное значение - " + max);
//                break;
//            }
//        }
//    }
//}

//Задание 5.
//Вывести все элементы в консоль по порядку в формате [1,2,3,4,5]

//    public static void printArray(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i<arr.length; i++){
//
//            if (i == arr.length - 1)
//                System.out.print(arr[i] + "]");
//            else
//                System.out.print(arr[i] + ",");
//        }
//
//    }
//
//}

//Задание 6.
//Вывести все элементы на консоль по порядку в формате [20,15,13,12,1]

//    public static void printArray(int[] arr) {
//        System.out.print("[");
//        for (int i = arr.length - 1;i !=-1; i--){
//
//            if (i == 0)
//                System.out.print(arr[i] + "]");
//            else
//                System.out.print(arr[i] + ",");
//        }
//
//    }
//
//}




//public class Array {
//    public static void main(String[] args) {
//        int[] myArray = new int[]{1, 2, 3, 4, 5};
//        double averageValue = findArrayAverage(myArray);
//        System.out.println("Average is:" + averageValue);
//    }
//    public static double findArrayAverage ( int[] arr){
//        double result = 0.0;
//        for (int i = 0; i < arr.length; i++) {
//            result = result + arr[i];
//        }
//        return result / arr.length;