package pl.hartL.firtapp;

public class Artykul {
    String name;
    int nrWewnetrznyArtykulu;
    String dataWydania;
    String autor;
    String wydawnictwo;
    int cena;
    public void danenrWewnetrznychArtykulu(){

        System.out.println("Dane artykułu:   " );
        System.out.println(name);
        System.out.println("Numer Artykulu wynosi:   " + nrWewnetrznyArtykulu);
        System.out.println("Data wydania Artykulu to:   " + dataWydania);
        System.out.println("Autor to:   " + autor);
        System.out.println("Wydawnictwo to:   " + wydawnictwo);
        System.out.println("Cena Artykulu wynosi:   " + cena);

    }
}
