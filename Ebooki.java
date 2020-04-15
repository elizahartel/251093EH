package pl.hartL.firtapp;

public class Ebooki extends Artykul  {
    public void daneEbookow() {
        int iloscStron = 356;
        String przedmowa = "tak";

        System.out.println("Ebook ma stron:" + iloscStron);
        System.out.println("Czy dany ebook posiada przedmowe?" + przedmowa);
    }
}