package pl.hartel.firstapp;

import org.junit.Test;
import static org.junit.Assert.*;


public class Test2 {

    private PolowaZnakow polowaZnakow = new PolowaZnakow();

    @Test
    public void SprawdzDwaZnaki() {

        assertEquals(polowaZnakow.LiczPoloweZnakow("slon"), 2);
    }

    @Test
    public void SprawdzTrzyZnaki() {

        assertEquals(polowaZnakow.LiczPoloweZnakow("zyrafa"), 3);
    }

}
