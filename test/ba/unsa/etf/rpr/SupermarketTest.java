package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket art = new Supermarket();
        art.dodajArtikl(new Artikl("Biciklo", 123, "5"));
        assertEquals(new Artikl("Biciklo", 123, "5"),art.izbaciArtiklSaKodom("5"));
    }

    @Test
    void dodajArtikl() {
        Supermarket art = new Supermarket();
        assertEquals(true, art.dodajArtikl(new Artikl("Biciklo", 123, "5")));

    }




}