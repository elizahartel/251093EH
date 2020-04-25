package pl.hartel.firstapp;

import java.util.Scanner;

public class TrojkatProstokatny {
    public static void main(String[] args) {
        System.out.println("\nWitaj użytkowniku! " +
                "\nPrzygotowalismy dla Ciebie algorytm sprawdzajacy." +
                "\nPodaj nam dlugosci przyprostokatnych oraz przeciwprostokatnej, a powiemy Ci " +
                " czy dane dlugosci ramion tworza trojkat prostokatny. " +
                "\nPamiętaj, że wszystkie długości ramion muszą być większe od zera. " +
                "\nW przeciwnym przypadku program się nie wykona.");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj długość pierwszej przyprostokątnej");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj długość drugiej przyprostokątnej");
        int b = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj długość przeciwprostokatnej");
        int c = scanner3.nextInt();
        if(a <= 0) {
            System.out.println("Dlugosc ramienia trojkata nie moze być mniejsza od zera. To niemozliwe!!!" +
                    "\nWykonaj program od poczatku!");
        }
        else{
        }
        if(b <= 0) {
            System.out.println("Dlugosc ramienia trojkata nie moze być mniejsza od zera. To niemozliwe!!!" +
                    "\nWykonaj program od poczatku!");
        }
        else{
        }
        if(c <= 0) {
            System.out.println("Dlugosc ramienia trojkata nie moze być mniejsza od zera. To niemozliwe!!!" +
                    "\nWykonaj program od poczatku!");
        }
        else{
        }
        int przyprostokatne = a*a+b*b;
        int przeciwprostokatna = c*c;
        if(przyprostokatne > przyprostokatne ){
            System.out.println("Niestety nie utworzyles trojkata prostokatnego");
        }
        else if(przyprostokatne < przyprostokatne ){
            System.out.println("Niestety nie utworzyles trojkata prostokatnego");
        }
        else{
            System.out.println("Udalo Ci sie stworzyc trojkat prostokatny");
        }
        System.out.println("Pole owego trojkata wynosi:" + a*b);
    }
}
