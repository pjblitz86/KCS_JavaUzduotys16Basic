package com.company;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis12 {
    private double svoris;
    private double ugis;
    private double kmi;

    // konstruktorius su parametrais, kad nustatytu kintamuju reiksmes kmi apskaiciavimui
    public Uzduotis12(double svoris, double ugis) {
        this.svoris = svoris;
        this.ugis = ugis;
    }

    // skaiciuojam ir isvedam KMI
    public void kmiSkaiciavimas() {
        kmi = svoris / (ugis * ugis);
        System.out.printf("KMI: %.2f\n", kmi);
    }



}
