package sk.upjs.ics.tennismanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MySqlZapasDao implements ZapasDao {

    private JdbcTemplate jdbcTemplate;

    public MySqlZapasDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Zapas> dajPodlaTurnaja(int id) {
        String sql = "SELECT * FROM zapas JOIN hrac h1 ON hrac1 = h1.id JOIN hrac h2 ON hrac2 = h2.id"
                + " JOIN turnaj ON turnaj = turnaj.id WHERE turnaj = ?";
        ZapasRowCallbackHandler handler = new ZapasRowCallbackHandler();
        jdbcTemplate.query(sql, handler, id);

        return handler.getZapasy();
    }

    @Override
    public void pridaj(Zapas zapas) {
        String sql = "INSERT INTO zapas VALUES (?, ?, ?, ?, ?, ?, ?, ?,"
                + "?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql, null, zapas.getHrac1().getId(), zapas.getHrac2().getId(),
                zapas.getTurnaj().getId(), zapas.getStavHrac1(), zapas.getStavHrac2(),
                zapas.getNajrychlejsiePodanie(), zapas.getNajrychlejsiePodanieHrac().getId(),
                zapas.getCas(), zapas.getEsaHrac1(), zapas.getEsaHrac2(), zapas.getOkoHrac1(),
                zapas.getOkoHrac2(), zapas.getUspesnostPodaniaHrac1(), zapas.getUspesnostPodaniaHrac2(),
                zapas.getTyp(), zapas.getSety());
    }

    @Override
    public int dajPocetVsetkychZapasov() {
        String sql = "SELECT COUNT(*) FROM zapas";

        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int dajPocetZapasovZaRokPodlaHraca(int hrac) {
        String sql = "SELECT COUNT(*) FROM zapas JOIN hrac h1 ON hrac1 = h1.id"
                + " JOIN hrac h2 ON hrac2 = h2.id JOIN turnaj t ON turnaj = t.id"
                + " WHERE (t.rok = YEAR(CURDATE())) AND (h1.id = ? OR h2.id = ?)";

        return jdbcTemplate.queryForObject(sql, Integer.class, hrac, hrac);
    }

    @Override
    public List<List<Integer>> dajZapasyPodlaHraca(int id) {
        return jdbcTemplate.query("select * from zapas where hrac1=? or hrac2=? order by id desc limit 0,5", new ZapasMapper(), id, id);
    }

    public class ZapasMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Integer> result = new ArrayList<Integer>();
            result.add(rs.getInt("hrac1"));
            result.add(rs.getInt("hrac2"));
            result.add(rs.getInt("stavHrac1"));
            result.add(rs.getInt("stavHrac2"));
            return result;
        }

    }
}
