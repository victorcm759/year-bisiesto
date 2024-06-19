package com.victorcm.yearbisiesto;

import java.util.Scanner;

public class Yearbisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, count = 0, num;
        System.out.println("Introduce un año: ");
        year = sc.nextInt();
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        System.out.println("Próximos " + num + " años bisiestos a partir de " + year + ": ");
        while (count != num) {
            year = year + 4;
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(year);
            }
            count++;
        }

    }
}
