package sk.upjs.ics.tennismanager;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {

    INSTANCE;

    private HracDao hracDao;
    private ZapasDao zapasDao;
    private TurnajDao turnajDao;
    private JdbcTemplate jdbcTemplate;
    private MysqlDataSource dataSource;

    public HracDao getHracDao() {
        if (this.hracDao == null) {
            this.hracDao = new MySqlHracDao(getJdbcTemplate());
        }
        return this.hracDao;
    }

    public ZapasDao getZapasDao() {
        if (this.zapasDao == null) {
            this.zapasDao = new MySqlZapasDao(getJdbcTemplate());
        }
        return this.zapasDao;
    }

    public TurnajDao getTurnajDao() {
        if (this.turnajDao == null) {
            this.turnajDao = new MySqlTurnajDao(getJdbcTemplate());
        }
        return this.turnajDao;
    }

    public JdbcTemplate getJdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(getDataSource());
        }
        return this.jdbcTemplate;
    }
    
    public MysqlDataSource getDataSource() {
        if (this.dataSource == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/paz1c");
            dataSource.setUser("paz1c");
            dataSource.setPassword("paz1c");
            this.dataSource = dataSource;
        }
        return this.dataSource;
    }
}
