package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    Artikl art = new Artikl("Biciklo", 200, "3");
    @Test
    void getNaziv() {
        assertEquals("Biciklo", art.getNaziv());
    }

    @Test
    void getCijena() {
        assertEquals(200,art.getCijena());
    }

    @Test
    void getKod() {
        assertEquals("3",art.getKod());
    }
}