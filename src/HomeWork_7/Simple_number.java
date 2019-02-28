package HomeWork_7;

public class Simple_number {
    public static void main(String[] args) {
        int mass[];
        mass = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,19,20};
        for(int i = 2; i<=mass.length; i++) {
            Integer rez = i;
            for (int j = 2; j<i; j++) {
                if(i%j == 0) {
                    rez = null;
                    break;
                }
            }
            if (rez!=null){
                System.out.println("Простое число = " + rez);
            }
        }
    }
}

