package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis11 {

    // kintamieji double kad galetu ivesti ir sveikus ir realius skaicius
    private static double skaicius1;
    private static double skaicius2;
    private static double suma;
    private static double skirtumas;
    private static double sandauga;

    // konstruktorius paleidimui per switch
    public Uzduotis11() {
        uzklausimas();
        atspausdinti();
    }

    // uzklausti vartotojo 2 skaiciu ir juos issaugoti kintamuosiuose
    private static void uzklausimas() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a skaiciu");
        skaicius1 = skeneris.nextDouble();
        System.out.println("Iveskite 2a skaiciu");
        skaicius2 = skeneris.nextDouble();
    }

    // statinis metodas sumai
    private static double sumavimas(int a, int b) {
        suma = a + b;
        return suma;
    }

    // sumos overloadingas jei parametrai double
    private static double sumavimas(double a, double b) {
        suma = a + b;
        return suma;
    }


    // statinis metodas skirtumui
    private static double atimtis(int a, int b) {
        skirtumas = a - b;
        return skirtumas;
    }

    // skirtumo overloading double parametrais
    private static double atimtis(double a, double b) {
        skirtumas = a - b;
        return skirtumas;
    }

    // statinis metodas sandaugai
    private static double daugyba(int a, int b) {
        sandauga = a * b;
        return sandauga;
    }

    // sandaugos overloading double
    private static double daugyba(double a, double b) {
        sandauga = a * b;
        return sandauga;
    }

    // atspausdinti rezultatus is metodu
    public static void atspausdinti() {
        System.out.print("Suma: " + sumavimas(skaicius1, skaicius2));
        System.out.println();
        System.out.print("Skirtumas: " + atimtis(skaicius1, skaicius2));
        System.out.println();
        System.out.print("Sandauga: " + daugyba(skaicius1, skaicius2));
    }
}