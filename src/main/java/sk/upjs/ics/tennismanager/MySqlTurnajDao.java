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
}
