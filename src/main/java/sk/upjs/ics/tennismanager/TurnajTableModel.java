package sk.upjs.ics.tennismanager;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TurnajTableModel extends AbstractTableModel {
    private static final int POCET_STLPCOV = 3;
    private static final String[] NAZVY_STLPCOV = {"Názov", "Rok",
            "Víťaz"};
    private static final Class[] TYPY_STLPCOV = {String.class, Integer.class,
            String.class};
    private TurnajDao turnajDao = DaoFactory.INSTANCE.getTurnajDao();
    private List<Turnaj> turnaje = new LinkedList<>();
    
    @Override
    public int getRowCount() {
        return turnaje.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Turnaj vybranyTurnaj = turnaje.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vybranyTurnaj.getNazov();
            case 1:
                return vybranyTurnaj.getRok();
            case 2:
                if (vybranyTurnaj.getVitaz() == null)
                    return "-";
                else {
                    String menoVitaza = vybranyTurnaj.getVitaz().getMeno();
                    String priezviskoVitaza = vybranyTurnaj.getVitaz().getPriezvisko();
                    return menoVitaza + " " + priezviskoVitaza;
                }
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
        turnaje = turnajDao.dajVsetky();
        fireTableDataChanged();
    }
    
    public Turnaj dajPodlaCislaRiadku(int riadok) {
        return turnaje.get(riadok);
    }
    
}
