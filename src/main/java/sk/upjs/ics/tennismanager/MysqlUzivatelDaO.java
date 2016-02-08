package sk.upjs.ics.tennismanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlUzivatelDaO implements UzivatelDaO {
    
    private JdbcTemplate tmp;
    
    public MysqlUzivatelDaO(JdbcTemplate jdbcTemplate) {
        tmp = jdbcTemplate;
    }
    
    @Override
    public void vlozUzivatela(Uzivatel u) {
        tmp.update("insert into uzivatel values (?, ?, ?, ?, ?)",
                null, u.getMeno(), u.getHeslo(), u.isSiRozhodca(), u.getLicencnyKod());
    }
    
    @Override
    public Uzivatel getUser(String meno) {
        List<Uzivatel> uzivatel = tmp.query("select * from uzivatel where meno = ?", new UzivatelMapper(), meno);
        for (Uzivatel u : uzivatel) {
            if (u.getMeno().equals(meno)) {
                return u;
            }
        }
        return null;
    }
    
    @Override
    public List<Uzivatel> dajVsetkych() {
        return tmp.query("select * from uzivatel", new UzivatelMapper());
    }
    
    @Override
    public boolean overMeno(String meno) {
        List<Uzivatel> list = tmp.query("select * from uzivatel where meno=?", new Object[]{meno}, new UzivatelMapper());
        for (Uzivatel u : list) {
            if (u.getMeno().equals(meno)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean overUzivatela(String meno, String heslo) {
        List<Uzivatel> uzivatel = tmp.query("select * from uzivatel where meno=? and heslo=?",
                new Object[]{meno, heslo}, new UzivatelMapper());
        if (uzivatel.isEmpty()) {
            return false;
        } else {
            for (Uzivatel u : uzivatel) {
                if (u.getMeno().equals(meno) && u.getHeslo().equals(heslo)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean overLicencnyKod(String kod) {
        List<String> licencia = tmp.query("select kod from licencie where kod=?", new LicenciaMapper(), kod);
        for (String kodik : licencia) {
            if (kodik.equals(kod)) {
                return true;
            }
        }
        return false;
    }
    
    public class UzivatelMapper implements RowMapper {
        
        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Uzivatel u = new Uzivatel();
            u.setMeno(rs.getString("meno"));
            u.setHeslo(rs.getString("heslo"));
            u.setSiRozhodca(rs.getBoolean("rozhodca"));
            u.setLicencnyKod(rs.getString("licencia"));
            return u;
        }
        
    }
    
    public class LicenciaMapper implements RowMapper {
        
        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            String kod = rs.getString("kod");
            return kod;
        }
        
    }
}
