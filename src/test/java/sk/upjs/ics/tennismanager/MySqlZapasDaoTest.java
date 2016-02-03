package sk.upjs.ics.tennismanager;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MySqlZapasDaoTest {
    private ZapasDao zapasDao = DaoFactory.INSTANCE.getZapasDao();
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    private TurnajDao turnajDao = DaoFactory.INSTANCE.getTurnajDao();
    
    @Test
    public void dajPocetVsetkychZapasovTest() {
        int pocetZapasov = zapasDao.dajPocetVsetkychZapasov();
        Assert.assertEquals(12, pocetZapasov);
    }
    
    @Test
    public void pridatTest() {
        int staryPocetZapasov = zapasDao.dajPocetVsetkychZapasov();
        
        Hrac hrac1 = hracDao.dajVsetky().get(0);
        Hrac hrac2 = hracDao.dajVsetky().get(1);
        Turnaj turnaj = turnajDao.dajVsetky().get(0);
        
        Zapas zapas = new Zapas();
        zapas.setEsaHrac1(1111111);
        zapas.setEsaHrac2(2222222);
        zapas.setOkoHrac1(3333333);
        zapas.setOkoHrac2(4444444);
        zapas.setStavHrac1(5555555);
        zapas.setHrac1(hrac1);
        zapas.setHrac2(hrac2);
        zapas.setTurnaj(turnaj);
        zapas.setNajrychlejsiePodanieHrac(hrac2);
        zapasDao.pridaj(zapas);
        
        int novyPocetZapasov = zapasDao.dajPocetVsetkychZapasov();
        
        Assert.assertEquals(staryPocetZapasov + 1, novyPocetZapasov);
    }
    
    @Test
    public void dajPodlaTurnajaTest() {
        List<Turnaj> turnaje = turnajDao.dajVsetky();
        int idPrveho = turnaje.get(1).getId();
        List<Zapas> zapasy = zapasDao.dajPodlaTurnaja(idPrveho);
        
        Assert.assertEquals(3, zapasy.size());
    }
    
    @Test
    public void dajPocetZapasovZaRokPodlaHracaTest() {
        int pocetZapasovZaRok = zapasDao.dajPocetZapasovZaRokPodlaHraca(7);
        
        Assert.assertEquals(4, pocetZapasovZaRok);
    }
}
