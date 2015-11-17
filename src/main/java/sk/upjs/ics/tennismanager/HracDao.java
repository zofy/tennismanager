package sk.upjs.ics.tennismanager;

import java.util.List;

public interface HracDao {
    public List<Hrac> dajVsetky();
    
    public void pridat(Hrac hrac);
}
