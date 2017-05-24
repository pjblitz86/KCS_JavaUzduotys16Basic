package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis10 {

    // naudojame static kintamiesiems ir metodams
    private static int skaicius1;
    private static int skaicius2;
    private static int suma;
    private static int skirtumas;
    private static int sandauga;

    // konstruktorius paleidimui per switch
    public Uzduotis10() {
        uzklausimas();
        atspausdinti();
    }

    // uzklausti vartotojo 2 sveiku skaiciu ir juos issaugoti kintamuosiuose
    private static void uzklausimas() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a sveika skaiciu");
        skaicius1 = skeneris.nextInt();
        System.out.println("Iveskite 2a sveika skaiciu");
        skaicius2 = skeneris.nextInt();
    }

    // statinis metodas sumai
    private static int sumavimas(int a, int b) {
        suma = a + b;
        return suma;
    }

    // statinis metodas skirtumui
    private static int atimtis(int a, int b) {
        skirtumas = a - b;
        return skirtumas;
    }

    // statinis metodas sandaugai
    private static int daugyba(int a, int b) {
        sandauga = a * b;
        return sandauga;
    }

    // atspausdinti rezultatus is metodu
    private static void atspausdinti() {
        System.out.print("Suma: " + sumavimas(skaicius1, skaicius2));
        System.out.println();
        System.out.print("Skirtumas: " + atimtis(skaicius1, skaicius2));
        System.out.println();
        System.out.print("Sandauga: " + daugyba(skaicius1, skaicius2));
    }
}
