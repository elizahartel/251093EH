package pl.hartL.firtapp;

public class Babelkowe implements Sortable {

    double licz_porownania;

    public int[] sort(int[] tab) {
        this.licz_porownania = 0;

        // Sortujemy tablice
        int i, j, liczba;

        System.out.println();
        for (i = 0; i < tab.length - 1; i++) {
            for (j = 0; j < tab.length - 1; j++) {
                this.licz_porownania++;
                if (tab[j] > tab[j + 1]) {

                    liczba = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = liczba;
                }
            }
        }
        return tab;

    }

    public double step_counting() {
        return licz_porownania;
    }
}
