package sk.upjs.ics.tennismanager;

import java.util.List;

public interface HracDao {

    public List<Hrac> dajVsetky();

    public List<Hrac> dajVsetkyOkrem(int id);

    public List<Hrac> dajPodlaId(int id);

    public void pridat(Hrac hrac);

    public void upravit(Hrac hrac);

    public void odstranit(Hrac hrac);
}
