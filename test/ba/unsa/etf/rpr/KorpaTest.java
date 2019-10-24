package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodavanje1 () {
        Korpa korpa = new Korpa();
        assertEquals(true, korpa.dodajArtikl(new Artikl("Biciklo", 123, "5")));

    }

    @Test
    void izbaciArtiklSaKodom () {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 123, "5"));

        assertEquals(new Artikl("Biciklo", 123, "5") ,korpa.izbaciArtiklSaKodom("5"));
    }


    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 123, "5"));
        korpa.dodajArtikl(new Artikl("Biciklo", 456, "6"));
        assertEquals(579, korpa.dajUkupnuCijenuArtikala());


    }



}