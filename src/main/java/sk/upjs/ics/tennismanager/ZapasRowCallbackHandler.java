package sk.upjs.ics.tennismanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.jdbc.core.RowCallbackHandler;


public class ZapasRowCallbackHandler implements RowCallbackHandler {
    private List<Zapas> zapasy = new LinkedList<>();
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    @Override
    public void processRow(ResultSet rs) throws SQLException {
        Hrac hrac1 = new Hrac();
        hrac1.setId(rs.getInt(18));
        hrac1.setMeno(rs.getString(19));
        hrac1.setPriezvisko(rs.getString(20));
        hrac1.setPohlavie(rs.getString(21));
        hrac1.setKrajina(rs.getString(22));
        hrac1.setPocetVyhier(rs.getInt(23));
        hrac1.setPocetPrehier(rs.getInt(24));
        hrac1.setNajrychlejsiePodanie(rs.getInt(25));
        hrac1.setUspesnost(rs.getDouble(26)); // tu som pridal
        
        Hrac hrac2 = new Hrac();
        hrac2.setId(rs.getInt(27));
        hrac2.setMeno(rs.getString(28));
        hrac2.setPriezvisko(rs.getString(29));
        hrac2.setPohlavie(rs.getString(30));
        hrac2.setKrajina(rs.getString(31));
        hrac2.setPocetVyhier(rs.getInt(32));
        hrac2.setPocetPrehier(rs.getInt(33));
        hrac2.setNajrychlejsiePodanie(rs.getInt(34));
        hrac2.setUspesnost(rs.getDouble(35));
        
        Turnaj turnaj = new Turnaj();
        turnaj.setId(rs.getInt(36));
        turnaj.setNazov(rs.getString(37));
        turnaj.setRok(rs.getInt(38));
        List<Hrac> poleVitazov = hracDao.dajPodlaId(rs.getInt(39));
        if (poleVitazov.isEmpty()) {
            turnaj.setVitaz(null);
        } else {
            turnaj.setVitaz(poleVitazov.get(0));
        }
        Zapas zapas = new Zapas();
        zapas.setId(rs.getInt(1));
        zapas.setHrac1(hrac1);
        zapas.setHrac2(hrac2);
        zapas.setTurnaj(turnaj);
        zapas.setStavHrac1(rs.getInt(5));
        zapas.setStavHrac2(rs.getInt(6));
        zapas.setNajrychlejsiePodanie(rs.getInt(7));
        if (rs.getInt(8) == hrac1.getId()) {
            zapas.setNajrychlejsiePodanieHrac(hrac1);
        } else {
            zapas.setNajrychlejsiePodanieHrac(hrac2);
        }
        zapas.setCas(rs.getTime(9));
        zapas.setEsaHrac1(rs.getInt(10));
        zapas.setEsaHrac2(rs.getInt(11));
        zapas.setOkoHrac1(rs.getInt(12));
        zapas.setOkoHrac2(rs.getInt(13));
        zapas.setUspesnostPodaniaHrac1(rs.getInt(14));
        zapas.setUspesnostPodaniaHrac2(rs.getInt(15));
        zapas.setTyp(rs.getString(16));
        zapas.setSety(rs.getString(17));
        
        zapasy.add(zapas);
    }

    public List<Zapas> getZapasy() {
        return zapasy;
    }
}
