package com.company;

import java.util.Scanner;

public class Uzduotis1{
    private String vardas;
    // 1 paprasyti vartotojo ivesti varda
    public void pasisveikinimas() {
        System.out.println("Iveskite vartotojo varda");
    }
    //
    public void nuskaitymas() {
        Scanner skeneris = new Scanner(System.in);
        vardas = skeneris.nextLine();
    }
    public void spausdinimas()
    {
        for (int i = 0; i < 5; i++){
            System.out.println("Jusu vardas: " + vardas);
        }

    }
}
