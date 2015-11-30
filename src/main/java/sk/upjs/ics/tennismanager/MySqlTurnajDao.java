package sk.upjs.ics.tennismanager;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlTurnajDao implements TurnajDao {

    private JdbcTemplate jdbcTemplate;

    public MySqlTurnajDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Turnaj> dajVsetky() {
        String sql = "SELECT * FROM turnaj";
        BeanPropertyRowMapper<Turnaj> mapper = BeanPropertyRowMapper.newInstance(Turnaj.class);

        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void pridat(Turnaj turnaj) {
        String sql = "INSERT INTO turnaj VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, null, turnaj.getNazov(), turnaj.getRok(), turnaj.getVitaz());
    }

    @Override
    public void upravit(Turnaj turnaj) {
        String sql = "UPDATE turnaj SET"
                + " nazov = ?,"
                + " rok = ?,"
                + " vitaz = ?,"
                + " WHERE id = ?;";
        jdbcTemplate.update(sql, turnaj.getNazov(), turnaj.getRok(), turnaj.getVitaz(), turnaj.getId());
    }

    @Override
    public void odstranit(Turnaj turnaj) {
        String sql = "DELETE * FROM turnaj WHERE id = ? ";
        jdbcTemplate.update(sql, turnaj.getId());
    }
}
