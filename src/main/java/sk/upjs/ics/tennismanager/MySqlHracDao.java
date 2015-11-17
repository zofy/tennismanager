package sk.upjs.ics.tennismanager;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlHracDao implements HracDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlHracDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<Hrac> dajVsetky() {
        String sql = "SELECT * FROM hrac";
        BeanPropertyRowMapper<Hrac> mapper = BeanPropertyRowMapper.newInstance(Hrac.class);
        
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void pridat(Hrac hrac) {
        String sql = "INSERT INTO hrac VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        jdbcTemplate.update(sql, null, hrac.getMeno(), hrac.getPriezvisko(),
                hrac.getPohlavie(), hrac.getKrajina(), 0, 0, 0);
    }
    
}
