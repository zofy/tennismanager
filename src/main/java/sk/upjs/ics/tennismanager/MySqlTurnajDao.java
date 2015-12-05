package sk.upjs.ics.tennismanager;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlTurnajDao implements TurnajDao {

    private JdbcTemplate jdbcTemplate;

    public MySqlTurnajDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Turnaj> dajVsetky() {
        String sql = "SELECT * FROM turnaj LEFT OUTER JOIN hrac ON vitaz = hrac.id";
        TurnajRowCallbackHandler handler = new TurnajRowCallbackHandler();
        jdbcTemplate.query(sql, handler);
        
        return handler.getTurnaje();
    }

    @Override
    public void pridat(Turnaj turnaj) {
        String sql = "INSERT INTO turnaj VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, null, turnaj.getNazov(), turnaj.getRok(), null);
    }

    @Override
    public void upravit(Turnaj turnaj) {
        String sql = "UPDATE turnaj SET"
                + " nazov = ?,"
                + " rok = ?"
                + " WHERE id = ?;";
        jdbcTemplate.update(sql, turnaj.getNazov(), turnaj.getRok(), turnaj.getId());
    }

    @Override
    public void odstranit(Turnaj turnaj) {
        String sql = "DELETE FROM turnaj WHERE id = ? ";
        jdbcTemplate.update(sql, turnaj.getId());
    }
}
