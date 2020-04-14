package pl.hartL.firtapp;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        System.out.println("Podaj tekst do konwersji");
        Scanner scanner = new Scanner(System.in);
        String wpisana = scanner.nextLine();
        boolean powiodlo = false;


        try {

            for (int i = 0; i < wpisana.length(); i++) {
                int liczba = Character.getNumericValue(wpisana.charAt(i));
                System.out.print(liczba);
            }
            powiodlo = true;
        } catch (Exception exception) {
            System.out.println("Błąd podczas konwersji liczby. Spróbuj ponownie.");
        } finally {
            if (powiodlo == true) System.out.println("\nKonwersja zakończona pomyślnie.");
            else System.out.println("Wystąpił błąd podczas konwersji.");
        }
    }
}
