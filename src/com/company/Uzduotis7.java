package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis7 {

    private double svoris;
    private double ugis;
    private double kmi;

    // konstruktorius
    public Uzduotis7(){
        svorisIrUgis();
        kmiSkaiciavimas(svoris, ugis);
        atspausdinimas();
    }

    // paklausti ir nuskaityti mase ir ugi i kintamuosius
    private void svorisIrUgis() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite mase, kg:");
        svoris = skeneris.nextDouble();
        System.out.println("Iveskite ugi, m:");
        ugis = skeneris.nextDouble();
    }

    // kmi skaiciavimo metodas su parametrais ir return
    private double kmiSkaiciavimas(double sv, double ug){
        kmi = sv / (ug * ug);
        return kmi;
    }

    // atspausdiname rezultata
    private void atspausdinimas() {
        System.out.printf("KMI = %.2f", kmi);
    }

}