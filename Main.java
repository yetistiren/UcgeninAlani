package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kenar = new Scanner(System.in);

        int kenar1, kenar2, kenar3, yariCevre;

        System.out.print("1. Kenarı Giriniz :");
        kenar1 = kenar.nextInt();

        System.out.print("2. Kenarı Giriniz :");
        kenar2 = kenar.nextInt();

        System.out.print("3. Kenarı Giriniz :");
        kenar3 = kenar.nextInt();

        yariCevre = (kenar1 + kenar2 + kenar3) / 2;

        System.out.println("Üçgenin Alanı = " + Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3)));
    }
}
