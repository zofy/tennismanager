package sk.upjs.ics.tennismanager;

public class Hrac {

    private int id;
    private String meno;
    private String priezvisko;
    private String pohlavie;
    private String krajina;
    private int pocetVyhier;
    private int pocetPrehier;
    private double uspesnost;
    private int najrychlejsiePodanie;

    public double getUspesnost() {
        return uspesnost;
    }

    public void setUspesnost(double uspesnost) {
        this.uspesnost = uspesnost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }

    public int getPocetVyhier() {
        return pocetVyhier;
    }

    public void setPocetVyhier(int pocetVyhier) {
        this.pocetVyhier = pocetVyhier;
    }

    public int getPocetPrehier() {
        return pocetPrehier;
    }

    public void setPocetPrehier(int pocetPrehier) {
        this.pocetPrehier = pocetPrehier;
    }

    public int getNajrychlejsiePodanie() {
        return najrychlejsiePodanie;
    }

    public void setNajrychlejsiePodanie(int najrychlejsiePodanie) {
        this.najrychlejsiePodanie = najrychlejsiePodanie;
    }

    @Override
    public String toString() {
        return this.meno + " " + this.priezvisko;
    }
}
