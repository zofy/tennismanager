package sk.upjs.ics.tennismanager;

import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlZapasDao implements ZapasDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlZapasDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void pridaj(Zapas zapas) {
        String sql = "INSERT INTO zapas VALUES (?, ?, ?, ?, ?, ?, ?, ?,"
                + "?, ?, ?, ?, ?, ?, ?, ?)";
        
        jdbcTemplate.update(sql, null, zapas.getHrac1().getId(), zapas.getHrac2().getId(),
                zapas.getTurnaj().getId(), zapas.getStavHrac1(), zapas.getStavHrac2(),
                zapas.getNajrychlejsiePodanie(), zapas.getNajrychlejsiePodanieHrac().getId(),
                zapas.getCas(), zapas.getEsaHrac1(), zapas.getEsaHrac2(), zapas.getOkoHrac1(),
                zapas.getOkoHrac2(), zapas.getUspesnostPodaniaHrac1(), zapas.getUspesnostPodaniaHrac2(),
                zapas.getTyp());
    }
}
