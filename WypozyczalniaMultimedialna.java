package pl.hartL.firtapp;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Scanner;

public class WypozyczalniaMultimedialna {
    public static void main(String[] args) {
        Ksiazki ksiazki = new Ksiazki();
        System.out.println();
        ksiazki.name = "Kategoria zbioru- Ksiazki";
        ksiazki.nrWewnetrznyArtykulu = 553434;
        ksiazki.dataWydania = "20.04.2020";
        ksiazki.autor = "Stephen King";
        ksiazki.wydawnictwo = "WSN";
        ksiazki.cena = 40;
        ksiazki.danenrWewnetrznychArtykulu();
        ksiazki.daneKsiazek();
        System.out.println();


        PlytyMuzyczne plytyMuzyczne = new PlytyMuzyczne();
        plytyMuzyczne.name = "Kategoria zbioru- Plyty muzyczne";
        plytyMuzyczne.nrWewnetrznyArtykulu = 283434;
        plytyMuzyczne.dataWydania = "04.05.1990";
        plytyMuzyczne.autor = "Michael Jackson";
        plytyMuzyczne.wydawnictwo = "Sony music";
        plytyMuzyczne.cena = 28;
        plytyMuzyczne.danenrWewnetrznychArtykulu();
        plytyMuzyczne.danePlytMuzycznych();
        System.out.println();

        Audiobooki audiobooki = new Audiobooki();
        audiobooki.name = "Kategoria zbioru- Audiobooki";
        audiobooki.nrWewnetrznyArtykulu = 4636636;
        audiobooki.dataWydania = "05.09.1999";
        audiobooki.autor = "Disney";
        audiobooki.wydawnictwo = "Sony music";
        audiobooki.cena = 15;
        audiobooki.danenrWewnetrznychArtykulu();
        audiobooki.daneAudiobookow();
        System.out.println();

        Ebooki ebooki = new Ebooki();
        ebooki.name = "Kategoria zbioru- Ebooki";
        ebooki.nrWewnetrznyArtykulu = 4366454;
        ebooki.dataWydania = "04.05.2015";
        ebooki.autor = "Marcin Myszka";
        ebooki.wydawnictwo = "Marcin Myszka- prywatnie";
        ebooki.cena = 3;
        ebooki.danenrWewnetrznychArtykulu();
        ebooki.daneEbookow();
        System.out.println();

        Filmy filmy = new Filmy();
        filmy.name = "Kategoria zbioru - Filmy";
        filmy.nrWewnetrznyArtykulu = 6363536;
        filmy.dataWydania = "02.08.2019";
        filmy.autor = "Quentin Tarantino";
        filmy.wydawnictwo = "Miramax Films";
        filmy.cena = 20;
        filmy.danenrWewnetrznychArtykulu();
        filmy.daneFilmow();
        System.out.println();
        System.out.println("********************");
        System.out.println("!!!warning/uwaga!!!\nDowolny dostepny produkt w naszej wypozyczalni mozesz wypozyczyc " +
                "na maksymalnie 14 dni. \nJesli nie zrezygnujesz z uzytku wypozyczonego produktu po 14 dniach, \n" +
                "bedziesz musial uiscic dodatkowa oplate(kara) ");
        System.out.println("********************");

        System.out.println("CENNIK OPLAT DODATKOWYCH");
        System.out.println("Za każdy dzien zwłoki (powyżej 14 dni od wypozyczenia produktu) \nuzytkownikowi " +
                "naszej wypozyczalni multimedialnej naliczana jest oplata w wysokości 47gr za 1 dzień");
        System.out.println("********************");
        System.out.println("Zachecamy do sprawdzenia stanu wypozyczonych produktów \n(Czy powinienes zaplacic kare...)");

        System.out.println("Ponizej znajduje sie dzisiejsza data:");
        Date dzis = new Date();
        System.out.println(dzis);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile dni temu wypozyczyles produkt w naszej wypozyczalni?\n" +
                "Jesli nie posiadasz jeszcze konta bibliotecznego wpisz w konsoli 0");
        int dni = scanner.nextInt();
        System.out.println("Wypozyczyles produkt naszej marki " + dni + " dni temu");
        int zwloka;
        zwloka = dni - 14;
        if (zwloka > 0) {
            System.out.println("Niestety masz dług wobec naszej firmy. \nTwoja zwłoka trwa od " + zwloka + " dni");
            System.out.println("Musisz zaplacic kare w wysokosci:" + zwloka * 0.47 + "zł");
        } else {
            System.out.println("Nie masz wobec nas długów.\nPozdrawiamy, zespol Wypoyczalnia-Multimedialna ;)");
        }
        System.out.println("******************************");
        System.out.println("Witaj w Wypozyczalni-Mutimedialnej\nKliknij");
        System.out.println("1 - Aby zalogowac sie do wypozyczalni\n2 - Aby zalozyc konto");

        Scanner scanner1 = new Scanner(System.in);
        int wprowadzona = scanner1.nextInt();
        System.out.println(wprowadzona);
        if (wprowadzona == 1) {
            System.out.println("Dane do logowania:");
        } else if (wprowadzona == 2) {
            System.out.println("Zakladanie konta:");
        } else {
            System.out.println("Nie wprowadziłes ani liczby 1 ani 2 - sprobuj jeszcze raz");
        }
        if (wprowadzona == 1)
        {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Podaj login:");
           String login = scanner2.nextLine();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Podaj haslo:");
            String haslo = scanner3.nextLine();
           System.out.println(" Gratulacje; Zalogowano pomyslnie ");
           if(zwloka>0){
               System.out.println("Musisz natychmiast opłacic kare za nieuregulowane zwroty naszych produktow");
               System.out.println("Należy niezwlocznie wpłacić kwotę w wysokości:" + zwloka*0.47 + "zł " +
                       "na numer konta 23 2344 0001 9930 0023. \nW tutyle przelewu nalezy wpisac KARA_login." +
                       "\nDodatkowo informujemy o zawieszeniu mozliwosci wypozyczenia " +
                       "jakiegokolwiek produktu z naszych zbiorow do czasu uregulowania naleznosci" +
                       "\nZespol Wypozyczalnia-Multimedialna.");

           }
           else{
               System.out.println("Jest okej. Wygląda na to, ze nie masz wobec nas zadnych dlugow ;)");
           }

        }
        else if (wprowadzona == 2){
            System.out.println("Aby zalozyc konto w multimedialnej wypozyczalni podaj ponizsze dane.");
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Login:");
            String login1 = scanner4.nextLine();
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Imie:");
            String imieL = scanner5.nextLine();
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Nazwisko:");
            String nazwiskoL = scanner6.nextLine();
            Scanner scanner7 = new Scanner(System.in);
            System.out.println("Ulica:");
            String ulicaL = scanner7.nextLine();
            Scanner scanner8 = new Scanner(System.in);
            System.out.println("Numer domu:");
            int nrDomuL = scanner8.nextInt();
            Scanner scanner9 = new Scanner(System.in);
            System.out.println("Rok urodzenia:");
            int rokUro = scanner9.nextInt();
            Scanner scanner10 = new Scanner(System.in);
            System.out.println("Miesiac urodzenia(w formacie 1-12)");
            int miesiacUro = scanner10.nextInt();
            Scanner scanner11 = new Scanner(System.in);
            System.out.println("Dzien urodzenia:");
            int dzienUro = scanner11.nextInt();
            System.out.println("Data zapisu do portalu");
            Date dzis1 = new Date();
            System.out.println(dzis1);
            System.out.println("\n!!!Witaj w wypozyczalni!!!");
        }
        else{
            System.out.println("Nie wprowadziłes ani liczby 1 ani 2 - sprobuj jeszcze raz");
        }
        }
}