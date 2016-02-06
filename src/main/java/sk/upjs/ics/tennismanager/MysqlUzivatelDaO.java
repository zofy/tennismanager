package sk.upjs.ics.tennismanager;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlUzivatelDaO implements UzivatelDaO {

    private JdbcTemplate tmp;

    public MysqlUzivatelDaO(JdbcTemplate jdbcTemplate) {
        tmp = new JdbcTemplate();
    }

    @Override
    public void vlozUzivatela(Uzivatel u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long getUserId(String meno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Uzivatel> dajVsetkych() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean overMeno(String meno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean overUzivatela(String meno, String heslo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean overLicencnyKod(String kod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
