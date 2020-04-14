package pl.hartL.firtapp;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[]args){
        int[] tab = new int[]{ 1,6,8,20,80,3,8,2,16,4};
        System.out.println("Witaj uzytkowniku. Mamy dla Ciebie zbior liczb");
        System.out.println("Nasz zbiór posiada " + tab.length + " liczb\n");
        System.out.println("To nasza tablica: ");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        System.out.println("\n");
        System.out.println("Mamy więc " + tab.length + " elementów tablicy- podaj który z nich mamy wyświetlić");
        System.out.println("Wpisz numer od 1 do " + tab.length);
        Scanner scanner = new Scanner(System.in);
        int wpisana = scanner.nextInt();
        if(wpisana<=tab.length){
            System.out.println("Poprosiłeś mnie o " + wpisana + "-ty element tablicy");
        }
        else{
            System.out.println("Wpisana przez Ciebie liczba wybiega poza zakres ilsci elementow tablicy.\n" +
                    "Spróbuj od początku ");
        }
        System.out.println(wpisana + "-ty element tablicy to: " + tab[wpisana-1]);
    }
}
