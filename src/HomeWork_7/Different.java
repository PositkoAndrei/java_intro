package HomeWork_7;

public class Different {
    public static void main(String[] args) {
        int k = 25;
        int n = 1;
         while ((n * n) < k) {
//             Math.pow(n, 2
             n++;
         }
         int currentNumber = 1;
         for (int i = 0; i < n; i++){
             for (int j = 0; j < n; j++) {
                 if (currentNumber <= k) {
                     System.out.print((currentNumber++) + "\t");
                 }
             }
            System.out.println();
        }
    }

}
