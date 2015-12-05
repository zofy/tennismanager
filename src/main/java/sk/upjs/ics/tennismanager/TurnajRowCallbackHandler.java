package sk.upjs.ics.tennismanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.jdbc.core.RowCallbackHandler;

public class TurnajRowCallbackHandler implements RowCallbackHandler{
    private List<Turnaj> turnaje = new LinkedList<>();
    
    @Override
    public void processRow(ResultSet rs) throws SQLException {
        Hrac vitaz = new Hrac();
        vitaz.setId(rs.getInt(5));
        vitaz.setMeno(rs.getString(6));
        vitaz.setPriezvisko(rs.getString(7));
        vitaz.setPohlavie(rs.getString(8));
        vitaz.setKrajina(rs.getString(9));
        vitaz.setPocetVyhier(rs.getInt(10));
        vitaz.setPocetPrehier(rs.getInt(11));
        vitaz.setNajrychlejsiePodanie(rs.getDouble(12));
        
        Turnaj turnaj = new Turnaj();
        turnaj.setId(rs.getInt(1));
        turnaj.setNazov(rs.getString(2));
        turnaj.setRok(rs.getInt(3));
        turnaj.setVitaz(vitaz);
        
        turnaje.add(turnaj);
    }

    public List<Turnaj> getTurnaje() {
        return turnaje;
    }
}
