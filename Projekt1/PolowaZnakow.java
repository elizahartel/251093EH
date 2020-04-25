package pl.hartel.firstapp;

import java.util.Scanner;

public class PolowaZnakow{
    public static void main(String[]args){
        System.out.println("Witaj uzytkowniku!\nWpisz słowo, a zwrócę Ci połowe znaków z tego słowa." +
                "\nWpisz słowo:");
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();
        int a = slowo.length();
        System.out.println("Wpisane przez Ciebie słowo liczy " + a + " liter" );
        int b = a/2;
        System.out.println("Połowa liter w Twoim słowie to w zaokragledniu w dol " + b + " liter" );
        System.out.println("Polowa Twojego slowa to:");
        System.out.println(slowo.substring(0,b));
    }
}