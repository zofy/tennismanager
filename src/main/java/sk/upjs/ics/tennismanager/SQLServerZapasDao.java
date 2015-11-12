package sk.upjs.ics.tennismanager;

import org.springframework.jdbc.core.JdbcTemplate;

public class SQLServerZapasDao implements ZapasDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLServerZapasDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
