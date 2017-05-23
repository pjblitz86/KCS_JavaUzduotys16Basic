package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite kuria uzduoti nuo 1 iki 16 norite pasirinkti");
        int pasirinkimas = skeneris.nextInt();
        switch (pasirinkimas){
            case 1:
                Uzduotis1 uzduotis1 = new Uzduotis1();
                uzduotis1.pasisveikinimas();
                uzduotis1.nuskaitymas();
                uzduotis1.spausdinimas();
                break;
            case 2:
                Uzduotis2 uzduotis2  = new Uzduotis2();
                uzduotis2.pasisveikinimas();
                uzduotis2.nuskaitymas();
                uzduotis2.koksIlgis();
                break;
            case 3:
                Uzduotis3 uzduotis3 = new Uzduotis3();
                uzduotis3.ivedimas2Skaiciu();
                uzduotis3.atspausdinimas();
                break;
            case 4:
                Uzduotis4 uzduotis4 = new Uzduotis4();
                uzduotis4.ivedimas2Skaiciu();
                uzduotis4.atspausdinimas();
                break;
            case 5:
                Uzduotis5 uzduotis5 = new Uzduotis5();
                uzduotis5.ivedimas2Skaiciu();
                uzduotis5.atspausdinimas();
                break;
            case 6:
                Uzduotis6 uzduotis6 = new Uzduotis6();
                uzduotis6.svorisIrUgis();
                uzduotis6.kmiSkaiciavimas();
            case 7:
                Uzduotis7 uzduotis7 = new Uzduotis7();
                uzduotis7.svorisIrUgis();
                uzduotis7.kmiSkaiciavimas(uzduotis7.svoris, uzduotis7.ugis);
                uzduotis7.atspausdinimas();
                break;
            case 8:
                Uzduotis8 uzduotis8 = new Uzduotis8();
                uzduotis8.kmIrSanaudos();
                uzduotis8.vidurkisKuroSanaudu();
                break;
            case 9:
                Uzduotis9 uzduotis9 = new Uzduotis9();
                uzduotis9.kmIrSanaudos();
                uzduotis9.vidurkisKuroSanaudu();
                uzduotis9.atspausdinimas();
                break;
            case 10:
                new Uzduotis10();
                break;
            case 11:
                new Uzduotis11();
                break;
            case 12:
                new Uzduotis12(90, 1.75);
                break;
            case 13:
                new Uzduotis13();
                break;
            case 14:
                new Uzduotis14();
            case 15:





        }

    }
}
