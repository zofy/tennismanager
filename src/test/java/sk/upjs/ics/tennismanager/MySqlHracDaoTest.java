package sk.upjs.ics.tennismanager;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MySqlHracDaoTest {
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    @Test
    public void dajVsetkyTest() {
        List<Hrac> hraci = hracDao.dajVsetky();
        Assert.assertTrue(!hraci.isEmpty()); 
    }
    
    @Test
    public void dajVsetkyOkremTest() {
        List<Hrac> vsetciHraci = hracDao.dajVsetky();
        int idPrveho = vsetciHraci.get(0).getId();
        
        List<Hrac> hraciOkremJedneho = hracDao.dajVsetkyOkrem(idPrveho);
        
        Assert.assertEquals(vsetciHraci.size(), hraciOkremJedneho.size()+1);
    }
    
    @Test
    public void dajPodlaIdTest() {
        List<Hrac> vsetciHraci = hracDao.dajVsetky();
        int idPrveho = vsetciHraci.get(0).getId();
        
        List<Hrac> hrac = hracDao.dajPodlaId(idPrveho);
        
        Assert.assertEquals(hrac.get(0).getId(), idPrveho);
    }
    
    @Test
    public void pridatTest() {
        List<Hrac> staryZoznamHracov = hracDao.dajVsetky();
        
        Hrac hrac = new Hrac();
        hrac.setMeno("Meno");
        hrac.setPriezvisko("Priezvisko");
        hrac.setPohlavie("Pohlavie");
        hrac.setKrajina("Krajina");
        hrac.setPocetVyhier(111111);
        hrac.setPocetPrehier(222222);
        hrac.setNajrychlejsiePodanie(3333333);
        hracDao.pridat(hrac);
        
        List<Hrac> novyZoznamHracov = hracDao.dajVsetky();
        
        Assert.assertEquals(staryZoznamHracov.size() + 1, novyZoznamHracov.size());
    }
    
    @Test
    public void upravitTest() {
        List<Hrac> hraci = hracDao.dajVsetky();
        Hrac hrac = hraci.get(hraci.size() -1);
        hrac.setMeno("mmm");
        hrac.setPriezvisko("ppp");
        hrac.setPohlavie("ppp");
        hrac.setKrajina("kkk");
        hrac.setPocetVyhier(1111111);
        hrac.setPocetPrehier(2222222);
        hrac.setNajrychlejsiePodanie(3333333);
        hracDao.upravit(hrac);
        
        hraci = hracDao.dajVsetky();
        hrac = hraci.get(hraci.size() -1);
        
        Assert.assertEquals("mmm", hrac.getMeno());
        Assert.assertEquals("ppp", hrac.getPriezvisko());
        Assert.assertEquals("ppp", hrac.getPohlavie());
        Assert.assertEquals("kkk", hrac.getKrajina());
        Assert.assertEquals(1111111, hrac.getPocetVyhier());
        Assert.assertEquals(2222222, hrac.getPocetPrehier());
        Assert.assertEquals(3333333, hrac.getNajrychlejsiePodanie());
    }
    
    @Test
    public void odstranitTest() {
        List<Hrac> staryZoznamHracov = hracDao.dajVsetky();
        Hrac hrac = staryZoznamHracov.get(staryZoznamHracov.size() - 1);
        hracDao.odstranit(hrac);
 
        List<Hrac> novyZoznamHracov = hracDao.dajVsetky();
        
        Assert.assertEquals(staryZoznamHracov.size(), novyZoznamHracov.size() + 1);
    }
}
