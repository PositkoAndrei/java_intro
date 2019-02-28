package HomeWork_7;

public class Fibonachi {
    public static void main(String[] args) {
        int[]arr;
        arr = new int [20];
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(i + " ");
//        }
        for(int i = 0;i<arr.length; i++){
            if(i < 2) {
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i-2] + arr[i-1];
            }
            System.out.println("Число Фибоначи - " + arr[i] + " ");
        }
    }
}

