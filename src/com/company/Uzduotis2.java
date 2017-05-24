package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis2 {
    private String vardas;

    // konstruktorius metodu paleidimui is switch
    public Uzduotis2() {
        pasisveikinimas();
        nuskaitymas();
        koksIlgis();
    }

    // paprasome vartotojo ivesti zodi
    private void pasisveikinimas() {
        // pasisveikinimas
        System.out.println("Iveskite zodi:");
    }

    // nusiskaitymas ivesto String i kintamaji
    private void nuskaitymas() {
        Scanner skeneris = new Scanner(System.in);
        vardas = skeneris.nextLine();
    }

    // atspausdinimas simboliu kieki naudodami length funkcija
    private void koksIlgis() {
        System.out.print("Ivesto zodzio ilgis: " + vardas.length());
    }
}
