package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis2 {
    private String vardas;
    public void pasisveikinimas(){
        // pasisveikinimas
        System.out.println("Iveskite zodi:");
    }
    // nusiskaitymas
    public void nuskaitymas(){
        Scanner skeneris = new Scanner(System.in);
        vardas = skeneris.nextLine();
    }
    // atspausdinimas simboliu
    public void koksIlgis(){
        System.out.println(vardas.length());
    }
}
