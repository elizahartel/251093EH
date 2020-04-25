package pl.hartel.firstapp;

import java.util.Scanner;

public class Gwiazdki {
    public static void main(String[] args) {
        System.out.println("Witaj uzytkowniku.\nPrzygotowalismy dla Ciebie algorytm wyswietlający następujący wzór:" +
                "\n*" +
                "\n**" +
                "\n***");
        System.out.println(" ");

        Scanner wersy = new Scanner(System.in);
        System.out.println("Ile wersów ma liczyć Twój wzrór? \n \nPodaj liczbę wersów:");
        int height = wersy.nextInt();
        for (int i = 1; i < height+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
