package sk.upjs.ics.tennismanager;

import java.sql.Time;

public class Zapas {
    private int id;
    private Hrac hrac1;
    private Hrac hrac2;
    private Turnaj turnaj;
    private int stavHrac1;
    private int stavHrac2;
    private String setyHrac1;
    private String setyHrac2;
    private int najrychlejsiePodanie;
    private Hrac najrychlejsiePodanieHrac;
    private Time cas;
    private int esaHrac1;
    private int esaHrac2;
    private int okoHrac1;
    private int okoHrac2;
    private int uspesnostPodaniaHrac1;
    private int uspesnostPodaniaHrac2;
    private String typ;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hrac getHrac1() {
        return hrac1;
    }

    public void setHrac1(Hrac hrac1) {
        this.hrac1 = hrac1;
    }

    public Hrac getHrac2() {
        return hrac2;
    }

    public void setHrac2(Hrac hrac2) {
        this.hrac2 = hrac2;
    }

    public Turnaj getTurnaj() {
        return turnaj;
    }

    public void setTurnaj(Turnaj turnaj) {
        this.turnaj = turnaj;
    }

    public int getStavHrac1() {
        return stavHrac1;
    }

    public void setStavHrac1(int stavHrac1) {
        this.stavHrac1 = stavHrac1;
    }

    public int getStavHrac2() {
        return stavHrac2;
    }

    public void setStavHrac2(int stavHrac2) {
        this.stavHrac2 = stavHrac2;
    }

    public String getSetyHrac1() {
        return setyHrac1;
    }

    public void setSetyHrac1(String setyHrac1) {
        this.setyHrac1 = setyHrac1;
    }

    public String getSetyHrac2() {
        return setyHrac2;
    }

    public void setSetyHrac2(String setyHrac2) {
        this.setyHrac2 = setyHrac2;
    }

    public int getNajrychlejsiePodanie() {
        return najrychlejsiePodanie;
    }

    public void setNajrychlejsiePodanie(int najrychlejsiePodanie) {
        this.najrychlejsiePodanie = najrychlejsiePodanie;
    }

    public Hrac getNajrychlejsiePodanieHrac() {
        return najrychlejsiePodanieHrac;
    }

    public void setNajrychlejsiePodanieHrac(Hrac najrychlejsiePodanieHrac) {
        this.najrychlejsiePodanieHrac = najrychlejsiePodanieHrac;
    }
    
    public Time getCas() {
        return cas;
    }

    public void setCas(Time cas) {
        this.cas = cas;
    }

    public int getEsaHrac1() {
        return esaHrac1;
    }

    public void setEsaHrac1(int esaHrac1) {
        this.esaHrac1 = esaHrac1;
    }

    public int getEsaHrac2() {
        return esaHrac2;
    }

    public void setEsaHrac2(int esaHrac2) {
        this.esaHrac2 = esaHrac2;
    }

    public int getOkoHrac1() {
        return okoHrac1;
    }

    public void setOkoHrac1(int okoHrac1) {
        this.okoHrac1 = okoHrac1;
    }

    public int getOkoHrac2() {
        return okoHrac2;
    }

    public void setOkoHrac2(int okoHrac2) {
        this.okoHrac2 = okoHrac2;
    }

    public int getUspesnostPodaniaHrac1() {
        return uspesnostPodaniaHrac1;
    }

    public void setUspesnostPodaniaHrac1(int uspesnostPodaniaHrac1) {
        this.uspesnostPodaniaHrac1 = uspesnostPodaniaHrac1;
    }

    public int getUspesnostPodaniaHrac2() {
        return uspesnostPodaniaHrac2;
    }

    public void setUspesnostPodaniaHrac2(int uspesnostPodaniaHrac2) {
        this.uspesnostPodaniaHrac2 = uspesnostPodaniaHrac2;
    }
    
    
}
