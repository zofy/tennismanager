package sk.upjs.ics.tennismanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

public class HracDetailForm extends javax.swing.JDialog {

    private Hrac hrac;
    private TurnajDao turnajDao = DaoFactory.INSTANCE.getTurnajDao();
    private ZapasDao zapasDao = DaoFactory.INSTANCE.getZapasDao();

    public HracDetailForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public HracDetailForm(java.awt.Frame parent, boolean modal, Hrac hrac) {
        super(parent, modal);
        initComponents();
        this.hrac = hrac;

        nastavLabely();
        nastavVyhrateTurnaje();

        Color color = new Color(204, 255, 204);
        this.getContentPane().setBackground(color);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - this.getSize().width) / 2, (dim.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menoLabel = new javax.swing.JLabel();
        priezviskoLabel = new javax.swing.JLabel();
        pohlavieLabel = new javax.swing.JLabel();
        krajinaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pocetVyhierLabel = new javax.swing.JLabel();
        pocetPrehierLabel = new javax.swing.JLabel();
        najrychlejsiePodanieLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        zrusitButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        uspesnostNaVyhruLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vyhrateTurnajeList = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        pocetZapasovZaRokLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail hráča");

        jLabel1.setText("Meno:");

        jLabel2.setText("Priezvisko:");

        jLabel3.setText("Pohlavie:");

        jLabel4.setText("Krajina:");

        menoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        menoLabel.setText("......................................");

        priezviskoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        priezviskoLabel.setText("................................");

        pohlavieLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pohlavieLabel.setText(".................................");

        krajinaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        krajinaLabel.setText(".................................");

        jLabel5.setText("Počet výhier:");

        jLabel6.setText("Počet prehier:");

        jLabel7.setText("Najrýchlejšie podanie:");

        pocetVyhierLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pocetVyhierLabel.setText(".....");

        pocetPrehierLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pocetPrehierLabel.setText(".....");

        najrychlejsiePodanieLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        najrychlejsiePodanieLabel.setText(".....");

        jLabel9.setText("Vyhraté turnaje:");

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Úspešnosť na výhru:");

        uspesnostNaVyhruLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uspesnostNaVyhruLabel.setText(".....");

        jScrollPane2.setViewportView(vyhrateTurnajeList);

        jLabel8.setText("Počet zápasov za rok:");

        pocetZapasovZaRokLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pocetZapasovZaRokLabel.setText(".....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zrusitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(menoLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pohlavieLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(krajinaLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(priezviskoLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pocetPrehierLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pocetVyhierLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uspesnostNaVyhruLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(najrychlejsiePodanieLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pocetZapasovZaRokLabel))))
                            .addComponent(jLabel9))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(menoLabel)
                        .addComponent(pocetVyhierLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priezviskoLabel)
                    .addComponent(jLabel6)
                    .addComponent(pocetPrehierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pohlavieLabel)
                    .addComponent(jLabel10)
                    .addComponent(uspesnostNaVyhruLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(krajinaLabel)
                    .addComponent(jLabel7)
                    .addComponent(najrychlejsiePodanieLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pocetZapasovZaRokLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zrusitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nastavLabely() {
        menoLabel.setText(hrac.getMeno());
        priezviskoLabel.setText(hrac.getPriezvisko());
        pohlavieLabel.setText(hrac.getPohlavie());
        krajinaLabel.setText(hrac.getKrajina());
        pocetVyhierLabel.setText(String.valueOf(hrac.getPocetVyhier()));
        pocetPrehierLabel.setText(String.valueOf(hrac.getPocetPrehier()));

        double uspesnost = hrac.getUspesnost();
        uspesnostNaVyhruLabel.setText(String.valueOf((double) uspesnost) + " %");

//        if (hrac.getPocetVyhier() + hrac.getPocetPrehier() == 0) {
//            uspesnostNaVyhruLabel.setText("0 %");
//        } else {
//            double uspesnost = (hrac.getPocetVyhier() * 1.0) / (hrac.getPocetPrehier() + hrac.getPocetVyhier()) * 100;
//            uspesnostNaVyhruLabel.setText(String.valueOf((double) uspesnost) + " %");
//        }
        najrychlejsiePodanieLabel.setText(String.valueOf(hrac.getNajrychlejsiePodanie()) + " km/h");
        pocetZapasovZaRokLabel.setText(String.valueOf(zapasDao.dajPocetZapasovZaRokPodlaHraca(hrac.getId())));
    }

    private void nastavVyhrateTurnaje() {
        List<Turnaj> turnaje = turnajDao.dajPodlaVitaza(hrac.getId());
        vyhrateTurnajeList.setListData(turnaje.toArray());
    }

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_zrusitButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HracDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HracDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HracDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HracDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HracDetailForm dialog = new HracDetailForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel krajinaLabel;
    private javax.swing.JLabel menoLabel;
    private javax.swing.JLabel najrychlejsiePodanieLabel;
    private javax.swing.JLabel pocetPrehierLabel;
    private javax.swing.JLabel pocetVyhierLabel;
    private javax.swing.JLabel pocetZapasovZaRokLabel;
    private javax.swing.JLabel pohlavieLabel;
    private javax.swing.JLabel priezviskoLabel;
    private javax.swing.JLabel uspesnostNaVyhruLabel;
    private javax.swing.JList vyhrateTurnajeList;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
