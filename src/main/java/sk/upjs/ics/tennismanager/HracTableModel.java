package sk.upjs.ics.tennismanager;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class HracTableModel extends AbstractTableModel {
    private static final int POCET_STLPCOV = 4;
    private static final String[] NAZVY_STLPCOV = {"Meno", "Priezvisko",
            "Počet výhier", "Počet prehier"};
    private static final Class[] TYPY_STLPCOV = {String.class, String.class,
            Integer.class, Integer.class};
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    private List<Hrac> hraci = new LinkedList<>();

    @Override
    public int getRowCount() {
        return hraci.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hrac vybranyHrac = hraci.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vybranyHrac.getMeno();
            case 1:
                return vybranyHrac.getPriezvisko();
            case 2:
                return vybranyHrac.getPocetVyhier();
            case 3:
                return vybranyHrac.getPocetPrehier();
            default:
                return "???";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return TYPY_STLPCOV[columnIndex];
    }
    
    public void refresh() {
        hraci = hracDao.dajVsetky();
        fireTableDataChanged();
    }
    
    public Hrac dajPodlaCislaRiadku(int riadok) {
        return hraci.get(riadok);
    }
}