package pl.hartL.firtapp;


public class Ksiazki {


    Artykul artukul;

    // Konstruktor z parametrami
    public Ksiazki(String name, int nrWewnetrznyArtykulu, String dataWydania, String autor, String wydawnictwo, int cena) {

        // Utworzenie nowego obiektu klasy artykul
        artukul = new Artykul();

        // Przypisanie przekazanych parametrów
        artukul.name = name;
        artukul.nrWewnetrznyArtykulu = nrWewnetrznyArtykulu;
        artukul.dataWydania = dataWydania;
        artukul.autor = autor;
        artukul.wydawnictwo = wydawnictwo;
        artukul.cena = cena;
    }

    // Metoda wypisyjaca dane artukulu
    public void danenrWewnetrznychArtykulu(){
        artukul.danenrWewnetrznychArtykulu();
    }

    public void daneKsiazek() {
        int iloscStron = 438;
        String przeklad = "Warszawa";
        System.out.println("Ilosc stron wynosi:" + iloscStron);
        System.out.println("Przeklad ksiazki z jezyka angielskiego wykoanany w:" + przeklad);
    }
}

