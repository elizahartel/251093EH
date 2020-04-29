package pl.hartel.firstapp;

public class SekwencjaLiczb {


    public boolean SprawdzSekwencje(int[] tab)
    {
        boolean wystepuje = false;
        int dlugosc=tab.length;
        for(int i=0;i<dlugosc-2; i++){
            if(tab[i]==1&&tab[i+1]==2&&tab[i+2]==3){
                wystepuje = true;
            }
        }

        return wystepuje;
    }

}
