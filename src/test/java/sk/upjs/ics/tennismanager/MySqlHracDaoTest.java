package sk.upjs.ics.tennismanager;

import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MySqlHracDaoTest {
    HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    @Test
    public void dajVsetkyTest() {
       List<Hrac> hraci = hracDao.dajVsetky();
       
       assertEquals(2, hraci.size());
    }
    
    @Test
    public void pridatTest() {
        Hrac hrac = new Hrac();
        hrac.setMeno("meno");
        hrac.setPriezvisko("priezvisko");
        hrac.setPohlavie("muz");
        hrac.setKrajina("krajina");
        hracDao.pridat(hrac);
        
        List<Hrac> hraci = hracDao.dajVsetky();
        
        assertEquals(3, hraci.size());
    }
}
