package pl.hartel.firstapp;

public class Pracownik extends Firma{
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik(String i, String n, int w){
        imie = i;
        nazwisko = n;
        wiek = w;
    }
}