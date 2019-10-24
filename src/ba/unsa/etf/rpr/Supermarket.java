package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl [1000];

    public Supermarket() {
        artikli=new Artikl[1000];
    }

    public Artikl izbaciArtiklSaKodom (String kod) {


         for (int i=0; i<artikli.length; i++)
            if(artikli[i].getKod().equals(kod)) {
                Artikl zaIzbaciti = artikli[i];
                artikli[i]=null;
                for(i=0 ;i<artikli.length-1; i++ ) {
                    artikli[i]=artikli[i+1];

                }
                return  zaIzbaciti;
            }


        return null;
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
