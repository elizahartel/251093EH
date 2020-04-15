package pl.hartL.firtapp;

public class PlytyMuzyczne {

    Artykul artykul;

    // Konstruktor z parametrami
    public PlytyMuzyczne(String name, int nrWewnetrznyArtykulu, String dataWydania, String autor, String wydawnictwo, int cena) {

        // Utworzenie nowego obiektu klasy artykul
        artykul = new Artykul();

        // Przypisanie przekazanych parametrów
        artykul.name = name;
        artykul.nrWewnetrznyArtykulu = nrWewnetrznyArtykulu;
        artykul.dataWydania = dataWydania;
        artykul.autor = autor;
        artykul.wydawnictwo = wydawnictwo;
        artykul.cena = cena;
    }
}