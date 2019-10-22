package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl artikli[] = new Artikl[50];


    public Korpa () {}

    public boolean dodajArtikl(Artikl a) {

        for (int i=0; i<artikli.length; i++) {
            if(artikli[i]==null ) {
                artikli[i]=a;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl zaIzbaciti = null;
        for(int i=0; i<artikli.length; i++) {
            if(artikli[i].getKod().equals(kod)) {
                zaIzbaciti=new Artikl(artikli[i]);
                artikli[i]=null;
                return zaIzbaciti;
            }
        }
        return zaIzbaciti;

    }

    public int dajUkupnuCijenuArtikala() {
            int suma=0;

            for(int i=0; i<artikli.length; i++)
                if(artikli[i] != null)
                suma+=artikli[i].getCijena();
    return suma;
    }
}
