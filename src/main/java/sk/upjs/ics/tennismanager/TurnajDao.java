package sk.upjs.ics.tennismanager;

import java.util.List;

public interface TurnajDao {
    public List<Turnaj> dajVsetky();
    
    public List<Turnaj> dajPodlaVitaza(int id);
    
    public void pridat(Turnaj turnaj);
    
    public void upravit(Turnaj turnaj);
    
    public void odstranit(Turnaj turnaj); 
}
