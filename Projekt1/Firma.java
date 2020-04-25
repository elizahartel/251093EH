package pl.hartel.firstapp;

public class Firma{

    public static void main(String args[]){
        System.out.println("Witaj użytkowniku!\nPosiadamy bazę pracowników naszej firmy!\n");

        Pracownik prac = new Pracownik("Wlodek", "Zięba", 45);
        System.out.println("Imię: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wiek: "+prac.wiek+"\n");
    }
}
