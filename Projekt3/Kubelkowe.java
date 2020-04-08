package pl.hartL.firtapp;


public class Kubelkowe implements Sortable {
    double licz_porownania;

    public int[] sort(int[] tab) {
        this.licz_porownania = 0;

        // Szukanie największej wartości tablicy
        int maksymalna_wartosc = 0;
        for (int i = 0; i < tab.length; i++)
        {
            this.licz_porownania++;

            if (tab[i] > maksymalna_wartosc)
                maksymalna_wartosc = tab[i];
        }


        // Algorytm sortowania
        int[] kubelkowe = new int[maksymalna_wartosc + 1];
        int[] sortowanie_tablicy = new int[tab.length];

        for (int i = 0; i < tab.length; i++)
        {
            this.licz_porownania++;
            kubelkowe[tab[i]]++;
        }

        int nowa_lokalizacja = 0;
        for (int i = 0; i < kubelkowe.length; i++)
        {
            for (int j = 0; j < kubelkowe[i]; j++)
            {
                this.licz_porownania++;
                sortowanie_tablicy[nowa_lokalizacja++] = i;
            }
        }

        return sortowanie_tablicy;
    }


    public double step_counting() {
        return licz_porownania;
    }

}
