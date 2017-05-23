package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis6 {
    // kintamuosius isivedam
    public double svoris;
    public double ugis;
    public double kmi;

    // paklausti ir nuskaityti mase ir ugi
    public void svorisIrUgis() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite mase, kg:");
        svoris = skeneris.nextDouble();
        System.out.println("Iveskite ugi, m:");
        ugis = skeneris.nextDouble();
    }

    // apskaiciuojam ir isvedam kmi i konsole
    public void kmiSkaiciavimas() {
        kmi = svoris / (ugis * ugis);
        System.out.printf("KMI = %.2f", kmi);
    }
}