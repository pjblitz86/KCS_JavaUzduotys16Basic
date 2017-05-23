package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis3 {
    // paprasyti ivesti 2 skaicius
    public int skaicius1;
    public int skaicius2;
    public int suma;
    public int skirtumas;

    // konstruktorius
    public Uzduotis3(){
        ivedimas2Skaiciu();
        SumaIrSkirtumas(skaicius1, skaicius2);
        atspausdinimas();
    }

    public void ivedimas2Skaiciu(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a sveika skaiciu:");
        skaicius1 = skeneris.nextInt();
        System.out.println("Iveskite 2a sveika skaiciu:");
        skaicius2 = skeneris.nextInt();
    }
    // metodas kuris skaiciuoja suma ir skirtuma
    public void SumaIrSkirtumas(int a, int b){
        suma = a + b;
        skirtumas = a - b;
    }

    // atspausdinti suma ir skirtuma
    public void atspausdinimas(){
        System.out.println("Suma: "+ suma + "\nSkirtumas: " + skirtumas);
    }

}