package com.victorcm.yearbisiesto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Yearbisiesto_fw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, count = 0, num;
        String ruta = "./years.txt";
        File f = new File (ruta);
        try (FileWriter fw = new FileWriter(f, false)) {
            System.out.println("Introduce un año: ");
            year = sc.nextInt();
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            System.out.println("Próximos " + num + " años bisiestos desde " + year + ": ");
            fw.write(Integer.toString(year));
            fw.write(System.lineSeparator());
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("Archivo creado en: " + f.getAbsolutePath());
            }
            while (count != num) {
                year = year + 4;
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    fw.write(System.lineSeparator());
                    fw.write(Integer.toString(year));
                }
                count++;
            }
            System.out.println("Archivo escrito en: " + f.getAbsolutePath());
        } catch (IOException ex) {
            Logger.getLogger(Yearbisiesto_fw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}