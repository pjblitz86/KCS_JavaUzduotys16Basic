package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis5 {

    private float skaicius1;
    private float skaicius2;

    // konstruktorius
    public Uzduotis5() {
        ivedimas2Skaiciu();
        atspausdinimas();
    }

    // paprasyti ivesti 2 skaicius
    // pagal uzduoti gali vesti ir sveikus ir realius skaicius
    private void ivedimas2Skaiciu() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a skaiciu:");
        skaicius1 = skeneris.nextFloat();
        System.out.println("Iveskite 2a skaiciu:");
        skaicius2 = skeneris.nextFloat();
    }

    // apskaiciuoti suma
    private int sumavimas(int a, int b) {
        int suma = a + b;
        return suma;
    }

    // overloadinam sumavimas, kad galetu priimt parametrus su float
    private float sumavimas(float a, float b) {
        float suma = a + b;
        return suma;
    }

    // apskaiciuoti skirtuma
    private int atimtis(int a, int b) {
        int atimtis = a - b;
        return atimtis;
    }

    // overloadinam atimtis, kad galetu priimt parametrus su float
    private float atimtis(float a, float b) {
        float atimtis = a - b;
        return atimtis;
    }

    // atspausdiname iskviesdami metodus
    private void atspausdinimas() {
        System.out.println("Suma: " + sumavimas(skaicius1, skaicius2)
                + "\nSkirtumas: " + atimtis(skaicius1, skaicius2));
    }

}
