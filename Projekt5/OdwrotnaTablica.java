package pl.hartel.firstapp;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class OdwrotnaTablica{

    public int[] ZwrocOdwrotna(int[] tab)
    {
        for(int i = 0; i < tab.length/2 ; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length -i -1];
            tab[tab.length -i -1] = temp;
        }

        return tab;
    }

}