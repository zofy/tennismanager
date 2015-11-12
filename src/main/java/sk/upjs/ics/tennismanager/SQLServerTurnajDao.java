package sk.upjs.ics.tennismanager;

import org.springframework.jdbc.core.JdbcTemplate;

public class SQLServerTurnajDao implements TurnajDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLServerTurnajDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
