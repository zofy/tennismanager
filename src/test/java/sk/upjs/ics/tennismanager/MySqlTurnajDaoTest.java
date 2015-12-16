package sk.upjs.ics.tennismanager;

import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

public class MySqlTurnajDaoTest {
    private TurnajDao turnajDao = DaoFactory.INSTANCE.getTurnajDao();
    
    @Test
    public void dajVsetkyTest() {
        List<Turnaj> turnaje = turnajDao.dajVsetky();
        Assert.assertTrue(!turnaje.isEmpty());
    }
    
    @Test
    public void dajPodlaVitazaTest() {
        List<Turnaj> vsetkyTurnaje = turnajDao.dajVsetky();
        int idVitaza = vsetkyTurnaje.get(0).getId();
        
        List<Turnaj> turnaj = turnajDao.dajPodlaVitaza(idVitaza);
        
        Assert.assertEquals(idVitaza, turnaj.get(0).getId());
    }
    
    @Test
    public void pridatTest() {
        List<Turnaj> staryZoznamTurnajov = turnajDao.dajVsetky();
        
        Turnaj turnaj = new Turnaj();
        turnaj.setNazov("nnn");
        turnaj.setRok(1111111);
        turnaj.setVitaz(null);
        turnajDao.pridat(turnaj);
        
        List<Turnaj> novyZoznamTurnajov = turnajDao.dajVsetky();
        
        Assert.assertEquals(staryZoznamTurnajov.size() + 1, novyZoznamTurnajov.size());
    }
    
    @Test
    public void upravitTest() {
        List<Turnaj> turnaje = turnajDao.dajVsetky();
        
        Turnaj turnaj = turnaje.get(turnaje.size() - 1);
        turnaj.setNazov("nnn");
        turnaj.setRok(1111111);
        turnaj.setVitaz(null);
        turnajDao.upravit(turnaj);
        
        turnaje = turnajDao.dajVsetky();
        turnaj = turnaje.get(turnaje.size() - 1);
        
        Assert.assertEquals("nnn", turnaj.getNazov());
        Assert.assertEquals(1111111, turnaj.getRok());
        Assert.assertEquals(null, turnaj.getVitaz());
    }
    
    @Test
    public void odstranitTest() {
        List<Turnaj> staryZoznamTurnajov = turnajDao.dajVsetky();
        
        Turnaj turnaj = staryZoznamTurnajov.get(staryZoznamTurnajov.size() - 1);
        turnajDao.odstranit(turnaj);
        
        List<Turnaj> novyZoznamTurnajov = turnajDao.dajVsetky();
        
        Assert.assertEquals(staryZoznamTurnajov.size(), novyZoznamTurnajov.size() + 1);
     }
}
