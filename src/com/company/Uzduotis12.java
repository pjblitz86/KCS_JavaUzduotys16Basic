package com.company;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis12 {
    private double svoris;
    private double ugis;
    private double kmi;

    // overloadintas konstruktorius su parametrais, iskvieciamas is Main switch
    // kad priskirtu reiksmes kintamiesiems
    public Uzduotis12(double svoris, double ugis) {
        this.svoris = svoris;
        this.ugis = ugis;
    }

    // skaiciuojam ir isvedam KMI pagal gautas reiksmes is konstruktoriaus
    public void kmiSkaiciavimas() {
        kmi = svoris / (ugis * ugis);
        System.out.printf("KMI: %.2f\n", kmi);
    }


}
