package pl.hartel.firstapp;


import org.junit.Test;
import static org.junit.Assert.*;


public class TestTemperatura {
    private Temperatura temperatura = new Temperatura();

    @Test
    public void SprawdzFalsz() {
        assertFalse(temperatura.PorownajTemperatury(112, 997));
    }

    @Test
    public void SprawdzPrawde() {
        assertTrue(temperatura.PorownajTemperatury(11, 91));
    }

}