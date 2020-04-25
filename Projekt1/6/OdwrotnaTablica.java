package pl.hartel.firstapp;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class OdwrotnaTablica{
    public static void main(String[]args){
        System.out.println("\nWitaj uzytkowniku!\nMamy w posiadaniu tablicę z liczbami:");
        int[] tab= new int[]{1,2,3};
        System.out.println("To nasz tablica: ");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + "  ");
        System.out.println("\n");
        System.out.println("Sprawię, że liczby zostaną zwrócone w odwrotnej kolejności");
        for (int j = tab.length-1; j >= 0; --j)System.out.print(tab[j] + "  ");
    }
}
