package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl [1000];

    public Supermarket() {
        artikli=new Artikl[1000];
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        Artikl zaIzbaciti = null;
        int i;
         for (i=0; i<artikli.length; i++)
            if(artikli[i].getKod().equals(kod)) {
                 zaIzbaciti = new Artikl(artikli[i]);
                artikli[i]=null;
                return zaIzbaciti;
            }
         for( ;i<999; i++ ) {
             artikli[i]=artikli[i+1];

         }

        return zaIzbaciti;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {

        for(int i=0; i<artikli.length; i++) {
            if (artikli[i]==null) {
                artikli[i]=a;
                return true;
            }


        }
        return false;
    }


}
