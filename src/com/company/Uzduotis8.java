package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis8 {

    // apsirasyti kintamuosius
    private double nuvaziuotiKm;
    private double kuroSanaudos;
    private double vidurkis;

    // konstruktorius
    public Uzduotis8() {
        kmIrSanaudos();
        vidurkisKuroSanaudu();
    }

    // paprasyti vartotojo ivesti km ir sanaudas ir nuskaityti
    private void kmIrSanaudos() {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km:");
        nuvaziuotiKm = skeneris.nextDouble();
        System.out.println("Iveskite kuro sanaudas litrais");
        kuroSanaudos = skeneris.nextDouble();
    }

    // vidutines kuro sanaudos ir isvedimas
    private void vidurkisKuroSanaudu() {
        vidurkis = kuroSanaudos * 100 / nuvaziuotiKm;
        System.out.printf("Vidutines kuro sanaudos = %.2f L/100km", vidurkis);
    }
}
