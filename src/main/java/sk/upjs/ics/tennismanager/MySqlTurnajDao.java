package sk.upjs.ics.tennismanager;

import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlTurnajDao implements TurnajDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlTurnajDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
