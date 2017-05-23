package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis5 {
    // paprasyti ivesti 2 skaicius
    public float skaicius1;
    public float skaicius2;

    // konstruktorius
    public Uzduotis5(){
        ivedimas2Skaiciu();
        atspausdinimas();
    }

    public void ivedimas2Skaiciu(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a skaiciu:");
        skaicius1 = skeneris.nextFloat();
        System.out.println("Iveskite 2a skaiciu:");
        skaicius2 = skeneris.nextFloat();
    }
    // atspausdinti suma
    public static int sumavimas(int a, int b){
        int suma = a + b;
        return suma;
    }
    // overloadinam float
    public static float sumavimas(float a, float b){
        float suma = a + b;
        return suma;
    }
    // atspausdinti skirtuma
    public static int atimtis (int a, int b){
        int atimtis = a - b;
        return atimtis;
    }
    // overloadinam float
    public static float atimtis (float a, float b){
        float atimtis = a - b;
        return atimtis;
    }
    public void atspausdinimas(){
        System.out.println("Suma: "+ sumavimas(skaicius1, skaicius2)
                + "\nSkirtumas: " + atimtis(skaicius1, skaicius2));
    }

}
