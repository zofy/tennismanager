package sk.upjs.ics.tennismanager;

public class Uzivatel {

    private long id;

    private String meno;

    private String heslo;

    private boolean siRozhodca;

    private String licencnyKod;

    public void setId(long id) {
        this.id = id;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public void setSiRozhodca(boolean siRozhodca) {
        this.siRozhodca = siRozhodca;
    }

    public void setLicencnyKod(String licencnyKod) {
        this.licencnyKod = licencnyKod;
    }

    public long getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public String getHeslo() {
        return heslo;
    }

    public boolean isSiRozhodca() {
        return siRozhodca;
    }

    public String getLicencnyKod() {
        return licencnyKod;
    }
}
