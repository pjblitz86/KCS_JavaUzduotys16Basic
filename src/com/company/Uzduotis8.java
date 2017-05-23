package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis8 {
    // apsirasyti kintamuosius
    public double nuvaziuotiKm;
    public double kuroSanaudos;
    public double vidurkis;

    // konstruktorius
    public Uzduotis8(){
        kmIrSanaudos();
        vidurkisKuroSanaudu();
    }

    // paprasyti vartotojo ivesti km ir sanaudas ir nuskaityti
    public void kmIrSanaudos(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km:");
        nuvaziuotiKm = skeneris.nextDouble();
        System.out.println("Iveskite kuro sanaudas litrais");
        kuroSanaudos = skeneris.nextDouble();
    }
    // vidutines kuro sanaudos ir isvedimas
    public void vidurkisKuroSanaudu(){
        vidurkis = kuroSanaudos * 100 / nuvaziuotiKm;
        System.out.printf("Vidutines kuro sanaudos = %.2f L/100km", vidurkis);
    }
}
