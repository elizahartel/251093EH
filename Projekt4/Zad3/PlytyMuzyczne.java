package pl.hartL.firtapp;

public class PlytyMuzyczne {

    Artykul artykul;
    
    public PlytyMuzyczne(String name, int nrWewnetrznyArtykulu, String dataWydania, String autor, String wydawnictwo, int cena) {

        artykul = new Artykul();

        artykul.name = name;
        artykul.nrWewnetrznyArtykulu = nrWewnetrznyArtykulu;
        artykul.dataWydania = dataWydania;
        artykul.autor = autor;
        artykul.wydawnictwo = wydawnictwo;
        artykul.cena = cena;
    }
}
