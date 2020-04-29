package pl.hartel.firstapp;

public class SekwencjaLiczb {
    public static void main(String[] args) {
        int[] tab = new int[]{
                1, 5, 66, 44, 34, 2, 3, 4, 5, 66, 87, 43, 21, 56, 12, 4, 5, 9, 12,
                11, 34, 66, 54, 23, 4, 5, 8, 45, 85, 29, 12, 33, 4, 5, 7, 2, 1, 3,
                4, 3, 22, 44, 90, 92, 4, 6, 7, 88, 99, 56, 27, 57, 1, 1, 22, 34, 3, 4,
                3, 4, 8, 9, 77, 89, 8, 8, 8, 8, 8, 8, 9, 12, 11, 13, 14, 18, 33, 33, 3,
                3, 4, 55, 33, 44, 33, 2,1,2,3, 3, 4, 7, 6, 3222, 445, 66543, 3442, 52, 535, 65,
                456, 563, 245, 653, 653, 635, 653, 875, 787, 675, 7645, 446, 35, 75, 35,
                53, 3, 57, 555, 4, 2, 31, 42, 21, 86, 47, 54, 54, 32, 14, 35, 24, 14, 35, 57,
                240, 35, 421, 57, 75, 75, 36, 75, 35, 75, 14, 1,2,3,68, 24, 2, 4, 67, 88, 99, 56, 27, 57,
                1, 1, 22, 34, 3, 4, 3, 4, 8, 9, 1,2,3, 77, 89, 8, 8, 8, 8, 8, 8, 9, 12, 11, 13, 14,
                18, 33, 33, 3, 1,2,3, 3, 4, 55, 33, 44, 33, 2, 3, 4,
                1,2,3, 7, 43, 53, 2532, 2532, 523, 1,2,3, 424, 22, 22, 111, 33
        };
        System.out.println("Witaj uzytkowniku! Mamy tablicę liczb. Oto nasza tablica:");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        System.out.println("\n");
        System.out.println("Sprawdze dla Ciebie czy w ogole wystepuje w tablicy sekwencja liczb 1,2,3");
        System.out.println();
        int liczWystapienia = 0;
        int dlugosc=tab.length;
        for(int i=0;i<dlugosc-2; i++){
            if(tab[i]==1&&tab[i+1]==2&&tab[i+2]==3){
                liczWystapienia++;
            }
        }
        if(liczWystapienia>0) {
            System.out.println("Mamy taka sekwencje");
            System.out.println("Sekwencja liczb 1,2,3 wystąpiła w naszej tablicy" +
                    " " + String.valueOf(liczWystapienia) + " razy");
        }
        else{
            System.out.println("Sekwencja liczb 1,2,3 nie wystąpiła w tablicy. \nPrzykro mi");
        }
    }
}
