package HomeWork_5;

import java.util.Scanner;

public class if_else {
    public static void main (String[] args){
        final int NumberOfMonth=12;
        System.out.println("If ПРИМЕР:");
//        Scanner s = new Scanner(System.in);
//        System.out.println("Введите месяц");
//        int NumberOfMonth = s.nextInt();

                if (NumberOfMonth == 1) {
                System.out.println("Январь");
                if (NumberOfMonth == 2) {
                    System.out.println("Февраль");
                }else if (NumberOfMonth == 3) {
                    System.out.println("Март");
                }else if (NumberOfMonth == 4) {
                    System.out.println("Апрель");
                }else if (NumberOfMonth == 5) {
                    System.out.println("Май");
                }else if (NumberOfMonth == 6) {
                    System.out.println("Июнь");
                }else if (NumberOfMonth == 7) {
                    System.out.println("Июль");
                }else if (NumberOfMonth == 8) {
                    System.out.println("Август");
                }else if (NumberOfMonth == 9) {
                    System.out.println("Сентябрь");
                }else if (NumberOfMonth == 10) {
                    System.out.println("Октябрь");
                }else if (NumberOfMonth == 11) {
                    System.out.println("Ноябрь");
                }else if (NumberOfMonth == 12) {
                    System.out.println("Декабрь");
                }else if (NumberOfMonth <=1) {
                    System.out.println("Такого месяца не существует");
                }else if (NumberOfMonth >=12) {
                    System.out.println("Такого месяца не существует");
                }
            }
        }
    }

