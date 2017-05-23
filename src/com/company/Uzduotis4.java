package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis4 {
    // paprasyti ivesti 2 skaicius
    public int skaicius1;
    public int skaicius2;

    // konstruktorius
    public Uzduotis4(){
        ivedimas2Skaiciu();
        atspausdinimas();
    }
    public void ivedimas2Skaiciu(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a sveika skaiciu:");
        skaicius1 = skeneris.nextInt();
        System.out.println("Iveskite 2a sveika skaiciu:");
        skaicius2 = skeneris.nextInt();
    }
    // apskaiciuoti suma
    public static int sumavimas(int a, int b){
        int suma = a + b;
        return suma;
    }

    // apskaiciuoti skirtuma
    public static int atimtis (int a, int b){
        int atimtis = a - b;
        return atimtis;
    }

    // atspausdinti rezultatus
    public void atspausdinimas(){
        System.out.println("Suma: "+ sumavimas(skaicius1, skaicius2)
                + "\nSkirtumas: " + atimtis(skaicius1, skaicius2));
    }

}
