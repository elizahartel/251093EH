package pl.hartel.firstapp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;



public class Test5 {

    private OdwrotnaTablica odwrotnaTablica = new OdwrotnaTablica();

    @Test
    public void SprawdzOdwrotnaTablicaPiec() {

        int[] tab1 = new int[]{
                1,2,3,4,5
        };

        int[] tabOdwrotna1 = new int[]{
                5,4,3,2,1
        };
        assertArrayEquals(odwrotnaTablica.ZwrocOdwrotna(tab1), tabOdwrotna1);
    }

    @Test
    public void SprawdzOdwrotnaTablicaDziewiec() {
        int[] tab2 = new int[]{
                1,2,3,4,5,6,7,8,9
        };

        int[] tabOdwrotna2 = new int[]{
                9,8,7,6,5,4,3,2,1
        };
        assertArrayEquals(odwrotnaTablica.ZwrocOdwrotna(tab2), tabOdwrotna2);
    }

}
