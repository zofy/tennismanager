package sk.upjs.ics.tennismanager;

import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MysqlUzivatelDaoTest {

    private UzivatelDaO uzivatelDao = DaoFactory.INSTANCE.getUzivatelDaO();

    @Test
    public void dajVsetkyTest() {
        List<Uzivatel> users = uzivatelDao.dajVsetkych();
        Assert.assertTrue(!users.isEmpty());
    }

    @Test
    public void vlozUzivatelaTest() {
        List<Uzivatel> staryZoznamUzivatelov = uzivatelDao.dajVsetkych();

        Uzivatel u = new Uzivatel();
        u.setMeno("Meno");
        u.setHeslo("Heslo");
        u.setSiRozhodca(false);
        uzivatelDao.vlozUzivatela(u);

        List<Uzivatel> novyZoznamUzivatelov = uzivatelDao.dajVsetkych();

        Assert.assertEquals(staryZoznamUzivatelov.size() + 1, novyZoznamUzivatelov.size());
    }

    @Test
    public void getUserTest() {
        List<Uzivatel> vsetci = uzivatelDao.dajVsetkych();
        Uzivatel u = vsetci.get(0);
        String meno = u.getMeno();
        Assert.assertTrue(meno.equals(uzivatelDao.getUser(meno).getMeno()));
    }

    @Test
    public void overMenoTest() {
        List<Uzivatel> vsetci = uzivatelDao.dajVsetkych();
        String meno = vsetci.get(0).getMeno();
        assertTrue(!uzivatelDao.overMeno(meno));
    }

    @Test
    public void overUzivatelaTest() {
        List<Uzivatel> vsetci = uzivatelDao.dajVsetkych();
        String meno = vsetci.get(0).getMeno();
        String heslo = vsetci.get(0).getHeslo();
        assertTrue(uzivatelDao.overUzivatela(meno, heslo));
    }

    @Test
    public void overLicencnyKodTest() {
        List<Uzivatel> vsetci = uzivatelDao.dajVsetkych();
        String kod = null;
        for (Uzivatel u : vsetci) {
            if (u.isSiRozhodca()) {
                kod = u.getLicencnyKod();
                break;
            }
        }
        assertTrue(uzivatelDao.overLicencnyKod(kod));
    }

    public static void main(String[] args) {
        MysqlUzivatelDaoTest tester = new MysqlUzivatelDaoTest();
        tester.getUserTest();
    }
}
