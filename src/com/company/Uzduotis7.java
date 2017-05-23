package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis7 {
    public double svoris;
    public double ugis;
    private double kmi;

    // paklausti ir nuskaityti mase ir ugi
    public void svorisIrUgis() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite mase, kg:");
        svoris = skeneris.nextDouble();
        System.out.println("Iveskite ugi, m:");
        ugis = skeneris.nextDouble();
    }

    // konstruktorius su parametrais, kad nustatytu kintamuju reiksmes kmi apskaiciavimui
    /*public Uzduotis7(double svoris, double ugis) {
        this.svoris = svoris;
        this.ugis = ugis;
    }*/

    // kmi skaiciavimas ir metodas su return
    public double kmiSkaiciavimas(double sv, double ug){
        kmi = sv / (ug * ug);
        return kmi;
    }

    // atspausdiname rezultata
    public void atspausdinimas() {
        System.out.printf("KMI = %.2f", kmi);
    }

}