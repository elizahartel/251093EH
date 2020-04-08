package pl.hartL.firtapp;

import java.util.Arrays;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Scanner;

public class glownaKlasa {
    public static void main(String args[]) {


        // Utworzenie tablicy z elementami nieposortowanymi
        int[] tab = new int[]{
                1, 5, 66, 44, 34, 2, 3, 4, 5, 66, 87, 43, 21, 56, 12, 4, 5, 9, 12,
                11, 34, 66, 54, 23, 4, 5, 8, 45, 85, 29, 12, 33, 4, 5, 7, 2, 1, 3,
                4, 3, 22, 44, 90, 92, 4, 6, 7, 88, 99, 56, 27, 57, 1, 1, 22, 34, 3, 4,
                3, 4, 8, 9, 77, 89, 8, 8, 8, 8, 8, 8, 9, 12, 11, 13, 14, 18, 33, 33, 3,
                3, 4, 55, 33, 44, 33, 2, 3, 4, 7, 6, 3222, 445, 66543, 3442, 52, 535, 65,
                456, 563, 245, 653, 653, 635, 653, 875, 787, 675, 7645, 446, 35, 75, 35,
                53, 3, 57, 555, 4, 2, 31, 42, 21, 86, 47, 54, 54, 32, 14, 35, 24, 14, 35, 57,
                240, 35, 421, 57, 75, 75, 36, 75, 35, 75, 14, 68, 24, 2, 4, 67, 88, 99, 56, 27, 57, 1, 1, 22, 34, 3, 4,
                3, 4, 8, 9, 77, 89, 8, 8, 8, 8, 8, 8, 9, 12, 11, 13, 14, 18, 33, 33, 3,
                3, 4, 55, 33, 44, 33, 2, 3, 4, 7, 43, 53, 2532, 2532, 523, 424, 22, 22, 111, 33
        };


        // Wczytywanie wyboru uzytkownika

        System.out.println("Witaj uzytkowniku!");
        System.out.println("Posiadamy zbior dwustu liczb ustawionych w przypadkowej kolejnosci\n");

                System.out.println("To nasz tablica: ");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        System.out.println("\n");

        System.out.println("Spokojnie, nie jest to problemem... dzieki mozliwosci sortowania ułożymy je w rosnacej " +
                "kolejnosci.\nPotrafię sortować zbiory stosując sortowanie bąbelkowe lub kubełkowe.\n" +
                "Sam wybierz, które sortowanie wykorzystamy do ułożenia liczb we właściwej rosnącej kolejności. " +
                "\n\nWpisz odpowieni znak do konsoli, jeśli chcesz wykorzystać" +
                " sortowanie\n1 - bąbelkowe \n2 - kubełkowe");


        // wybor uzytkownika
        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();


        switch (wybor) {
            case 1:
                // Sortowanie bąbelkowe
                Babelkowe babelkowe = new Babelkowe();
                tab = babelkowe.sort(tab);
                System.out.println("Ilość porównań: ");
                System.out.println(String.valueOf(babelkowe.step_counting()));

                break;
            case 2:
                // Sortowanie kubełkowe
                Kubelkowe kubelkowe = new Kubelkowe();
                tab = kubelkowe.sort(tab);
                System.out.println("Ilość porównań: ");
                System.out.println(String.valueOf(kubelkowe.step_counting()));

                break;
            default:
                System.out.println("Wpisana przez Ciebie liczba nie wynosi ani 1 ani 2");
        }

        // Wyświetlenie posortowanej tablicy
        System.out.println();
        System.out.println("Posortowana tablica: ");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        System.out.println("\n");
    }

    double step_counting() {
        double licz_porownania = 0;

        return licz_porownania;
    }
}



