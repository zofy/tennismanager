package sk.upjs.ics.tennismanager;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.activation.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {

    INSTANCE;

    private HracDao hracDao;
    private ZapasDao zapasDao;
    private TurnajDao turnajDao;
    private JdbcTemplate jdbcTemplate;
    private SQLServerDataSource dataSource;

    public HracDao getHracDao() {
        if (this.hracDao == null) {
            this.hracDao = new SQLServerHracDao(getJdbcTemplate());
        }
        return this.hracDao;
    }

    public ZapasDao getZapasDao() {
        if (this.zapasDao == null) {
            this.zapasDao = new SQLServerZapasDao(getJdbcTemplate());
        }
        return this.zapasDao;
    }

    public TurnajDao getTurnajDao() {
        if (this.turnajDao == null) {
            this.turnajDao = new SQLServerTurnajDao(getJdbcTemplate());
        }
        return this.turnajDao;
    }

    public JdbcTemplate getJdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(getDataSource());
        }
        return this.jdbcTemplate;
    }
    
    public SQLServerDataSource getDataSource() {
        if (this.dataSource == null) {
            SQLServerDataSource dataSource = new SQLServerDataSource();
            dataSource.setURL("jdbc:sqlserver://localhost:1433;databaseName=tennismanager");
            dataSource.setUser("paz1c");
            dataSource.setPassword("paz1c");
            this.dataSource = dataSource;
        }
        return this.dataSource;
    }
}
