package sk.upjs.ics.tennismanager;

public class Turnaj {
    private int id;
    private String nazov;
    private int rok;
    private Hrac vitaz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public Hrac getVitaz() {
        return vitaz;
    }

    public void setVitaz(Hrac vitaz) {
        this.vitaz = vitaz;
    }

    @Override
    public String toString() {
        return this.nazov + " " + this.rok + this.getVitaz();
    }
}
