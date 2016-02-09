package sk.upjs.ics.tennismanager;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlHracDao implements HracDao {

    private JdbcTemplate jdbcTemplate;

    public MySqlHracDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Hrac> dajVsetky() {
        String sql = "SELECT * FROM hrac order by uspesnost desc";
        BeanPropertyRowMapper<Hrac> mapper = BeanPropertyRowMapper.newInstance(Hrac.class);

        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Hrac> dajVsetkyOkrem(int id) {
        String sql = "SELECT * FROM hrac WHERE id <> ?";
        BeanPropertyRowMapper<Hrac> mapper = BeanPropertyRowMapper.newInstance(Hrac.class);

        return jdbcTemplate.query(sql, mapper, id);
    }

    @Override
    public List<Hrac> dajPodlaId(int id) {
        String sql = "SELECT * FROM hrac WHERE id = ?";
        BeanPropertyRowMapper<Hrac> mapper = BeanPropertyRowMapper.newInstance(Hrac.class);

        return jdbcTemplate.query(sql, mapper, id);
    }

    @Override
    public void pridat(Hrac hrac) {
        String sql = "INSERT INTO hrac VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql, null, hrac.getMeno(), hrac.getPriezvisko(),
                hrac.getPohlavie(), hrac.getKrajina(), 0, 0, 0);
    }

    @Override
    public void upravit(Hrac hrac) {
        String sql = "UPDATE hrac SET"
                + " meno = ?,"
                + " priezvisko = ?,"
                + " krajina = ?,"
                + " pohlavie = ?,"
                + " pocetVyhier = ?,"
                + " pocetPrehier = ?,"
                + " najrychlejsiePodanie = ?"
                + " uspesnost = ?"
                + " kondicia = ?"
                + " WHERE id = ?;";
        jdbcTemplate.update(sql, hrac.getMeno(), hrac.getPriezvisko(),
                hrac.getKrajina(), hrac.getPohlavie(), hrac.getPocetVyhier(),
                hrac.getPocetPrehier(), hrac.getNajrychlejsiePodanie(), hrac.getUspesnost(), hrac.getKondicia(), hrac.getId());
    }

    @Override
    public void odstranit(Hrac hrac) {
        String sql = "DELETE FROM hrac WHERE id = ?";

        jdbcTemplate.update(sql, hrac.getId());
    }

}
