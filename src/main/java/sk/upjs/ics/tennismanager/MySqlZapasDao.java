package sk.upjs.ics.tennismanager;

import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlZapasDao implements ZapasDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlZapasDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
