package sk.upjs.ics.tennismanager;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SQLServerHracDao implements HracDao {
    private JdbcTemplate jdbcTemplate;
    private BeanPropertyRowMapper<Hrac> mapovac = new BeanPropertyRowMapper<Hrac>(Hrac.class);
    
    public SQLServerHracDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<Hrac> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM hrac", mapovac);
    }

    @Override
    public void pridat(Hrac hrac) {

    }
}
