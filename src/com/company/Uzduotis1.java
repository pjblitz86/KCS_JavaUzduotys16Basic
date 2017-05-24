package com.company;

import java.util.Scanner;

public class Uzduotis1 {
    private String vardas;

    // paprasome vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("Iveskite vartotojo varda");
    }

    // nuskaitom varda i deklaruota kintamaji
    public void nuskaitymas() {
        Scanner skeneris = new Scanner(System.in);
        vardas = skeneris.nextLine();
    }

    // atspausdinam ka ivede 5 kartus naudodami for
    public void spausdinimas() {
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }

    }
}
