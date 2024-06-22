package com.victorcm.yearbisiesto;

import java.util.Scanner;

public class Yearbisiesto_bool {

    public static void main(String[] args) {
        int year;
        boolean bisiesto;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un año: ");
        year = sc.nextInt();
        
        if (year % 4 == 0 || (year % 100 != 0 && year % 400 == 0)) {
            bisiesto = true;
        } else {
            bisiesto = false;
        }
        
        System.out.println("¿" + year + " es bisiesto? " + bisiesto);
    }
    
}
