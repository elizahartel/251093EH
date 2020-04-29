package pl.hartel.firstapp;

public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Witaj użytkowniku!");
        System.out.println("Wykonalismy dla Ciebie program porownujący dwie temperatury");
        int a = 60;
        System.out.println("Pierwsza temperatura wynosi:\n" + a);
        int b = 155;
        System.out.println("Druga temperatura wynosi:\n" +b);
        System.out.println();
        if(a>=100){
            System.out.println("Temperatura " + a + " jest wyższa od 100 stopni");
        }
        else{
            System.out.println("Temperatura " + a + " jest niższa od 100 stopni");
        }
        if(b>=100){
            System.out.println("Temperatura " + b + " jest wyższa od 100 stopni");
        }
        else{
            System.out.println("Temperatura " + b + " jest niższa od 100 stopni");
        }
        System.out.println();
        System.out.println("Zatem czy któraś z temperatur jest niższa od 100 stopni?");
        System.out.println();
        if(a<100){
            System.out.println("Tak!Temperatura " + a + " jest niższa od 100 stopni");
        }
        else{
        }
        if(b<100){
            System.out.println("Tak!Temperatura " + b + " jest niższa od 100 stopni");
        }
        else{
        }

    }
}
