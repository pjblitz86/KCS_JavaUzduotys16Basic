package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis13 {

    // konstruktorius paleidziam visus metodus
    public Uzduotis13(){
        uzklausimas();
        rezultatuAtspausdinimas();
    }

    private double skaicius;

    // paprasom vartotojo ivesti krastine kvadrato skaiciavimui
    // ir issaugom i kintamaji
    public void uzklausimas(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a krastine");
        skaicius = skeneris.nextDouble();
    }
    // atliekame kvadrato skaiciavima metode su return
    public double kvadratoSkaiciavimas(double a){
        double rezultatas = Math.pow(a, 2);
        return rezultatas;
    }

    // rezultatu isvedimas
    public void rezultatuAtspausdinimas(){
        System.out.printf("Kvadrato plotas = %.2f", kvadratoSkaiciavimas(skaicius));
    }
}
