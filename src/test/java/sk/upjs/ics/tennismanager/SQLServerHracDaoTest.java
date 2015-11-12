package sk.upjs.ics.tennismanager;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SQLServerHracDaoTest {
    
    @Test
    public void testDajVsetky() {
        HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
        List<Hrac> hraci = hracDao.dajVsetky();
        
        assertEquals(2, hraci.size());
    }
    
}
