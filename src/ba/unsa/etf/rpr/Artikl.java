package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv;
    private int cijena;
    private String kod ;

    public Artikl (Artikl a) {
        naziv = a.naziv;
        kod = a.kod;
        cijena = a.cijena;
    }

    Artikl(String naziv, int cijena, String kod) {
        this.naziv= naziv;
        this.cijena = cijena;
        this.kod = kod;
    }
    String getNaziv() { return naziv; }
    int getCijena() { return cijena; }
    String getKod() { return kod; }

    @Override
    public boolean equals(Object objekat) {
        return kod.equals(((Artikl) objekat).kod);

    }
}