package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis13 {

    private double skaicius;

    // konstruktorius paleidziam metodus
    public Uzduotis13() {
        uzklausimas();
        rezultatuAtspausdinimas();
    }

    // paprasom vartotojo ivesti krastine kvadrato skaiciavimui
    // ir issaugom i kintamaji
    private void uzklausimas() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a krastine");
        skaicius = skeneris.nextDouble();
    }

    // atliekame kvadrato skaiciavima metode su return
    private double kvadratoSkaiciavimas(double a) {
        double rezultatas = Math.pow(a, 2);
        return rezultatas;
    }

    // rezultatu isvedimas
    private void rezultatuAtspausdinimas() {
        System.out.printf("Kvadrato plotas = %.2f", kvadratoSkaiciavimas(skaicius));
    }
}
