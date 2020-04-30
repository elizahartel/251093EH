package pl.hartel.firstapp;

public class Temperatura {


    public boolean PorownajTemperatury(int pierwsza, int druga)
    {
        boolean wynik = false;

        if(pierwsza < 100 || druga < 100)
        {
            wynik = true;
        }

        return wynik;
    }

}
