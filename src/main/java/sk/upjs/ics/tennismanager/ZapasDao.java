package sk.upjs.ics.tennismanager;

import java.util.List;

public interface ZapasDao {
    public List<Zapas> dajPodlaTurnaja(int id);
    
    public void pridaj(Zapas zapas);
    
    public int dajPocetVsetkychZapasov();
    
    public int dajPocetZapasovZaRokPodlaHraca(int hrac);
}
