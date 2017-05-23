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
                new Uzduotis2();
                break;
            case 3:
                new Uzduotis3();
                break;
            case 4:
                new Uzduotis4();
                break;
            case 5:
                new Uzduotis5();
                break;
            case 6:
                new Uzduotis6();
                break;
            case 7:
                new Uzduotis7();
                break;
            case 8:
                new Uzduotis8();
                break;
            case 9:
                new Uzduotis9();
                break;
            case 10:
                new Uzduotis10();
                break;
            case 11:
                new Uzduotis11();
                break;
            case 12:
                Uzduotis12 uzduotis12 = new Uzduotis12(90, 1.75);
                uzduotis12.kmiSkaiciavimas();
                break;
            case 13:
                new Uzduotis13();
                break;
            case 14:
                new Uzduotis14();
                break;
            case 15:
                new Uzduotis15();
                break;
            case 16:
                new Uzduotis16();
                break;
        }

    }
}
