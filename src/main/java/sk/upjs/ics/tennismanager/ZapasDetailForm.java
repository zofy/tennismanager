package sk.upjs.ics.tennismanager;

public class ZapasDetailForm extends javax.swing.JDialog {
    private Zapas zapas;
    
    public ZapasDetailForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ZapasDetailForm(java.awt.Dialog parent, boolean modal, Zapas zapas) {
        super(parent, modal);
        initComponents();
        this.zapas = zapas;
        
        typLabel.setText(zapas.getTyp());
        hrac1Label.setText(zapas.getHrac1().getMeno() + " " + zapas.getHrac1().getPriezvisko());
        hrac2Label.setText(zapas.getHrac2().getMeno() + " " + zapas.getHrac2().getPriezvisko());
        stavLabel.setText(zapas.getStavHrac1() + " - " + zapas.getStavHrac2());
        esaHrac1Label.setText(String.valueOf(zapas.getEsaHrac1()) + " krát");
        esaHrac2Label.setText(String.valueOf(zapas.getEsaHrac2()) + " krát");
        okoHrac1Label.setText(String.valueOf(zapas.getOkoHrac1()) + " krát");
        okoHrac2Label.setText(String.valueOf(zapas.getOkoHrac2()) + " krát");
        uspesnostPodaniaHrac1Label.setText(String.valueOf(zapas.getUspesnostPodaniaHrac1()) + " %");
        uspesnostPodaniaHrac2Label.setText(String.valueOf(zapas.getUspesnostPodaniaHrac2()) + " %");
        casLabel.setText(zapas.getCas().toString());
        setyLabel.setText(zapas.getSety());
        najrychlejsiePodanieLabel.setText(zapas.getNajrychlejsiePodanie() + "km/h  ("
                + zapas.getNajrychlejsiePodanieHrac().getMeno() + " " 
                + zapas.getNajrychlejsiePodanieHrac().getPriezvisko() + ")");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hrac1Label = new javax.swing.JLabel();
        hrac2Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        setyLabel = new javax.swing.JLabel();
        zrusitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        najrychlejsiePodanieLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        esaHrac1Label = new javax.swing.JLabel();
        esaHrac2Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        okoHrac1Label = new javax.swing.JLabel();
        okoHrac2Label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uspesnostPodaniaHrac1Label = new javax.swing.JLabel();
        uspesnostPodaniaHrac2Label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        typLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        casLabel = new javax.swing.JLabel();
        stavLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hrac1Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hrac1Label.setText(".....");

        hrac2Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hrac2Label.setText(".....");

        jLabel1.setText("Priebeh zápasu:");

        setyLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        setyLabel.setText(".....");

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Najrýchlejšie podanie:");

        najrychlejsiePodanieLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        najrychlejsiePodanieLabel.setText(".....");

        jLabel4.setText("Esá:");

        esaHrac1Label.setText(".....");

        esaHrac2Label.setText(".....");

        jLabel5.setText("Esá:");

        jLabel6.setText("Oko:");

        okoHrac1Label.setText(".....");

        okoHrac2Label.setText(".....");

        jLabel7.setText("Oko:");

        jLabel8.setText("Úspešnosť podania:");

        uspesnostPodaniaHrac1Label.setText(".....");

        uspesnostPodaniaHrac2Label.setText(".....");

        jLabel9.setText("Úspešnosť podania:");

        typLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typLabel.setText(".....");

        jLabel10.setText("Celkový čas:");

        casLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        casLabel.setText(".....");

        stavLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stavLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stavLabel.setText("..............");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zrusitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(esaHrac1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(esaHrac2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okoHrac1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okoHrac2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uspesnostPodaniaHrac1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uspesnostPodaniaHrac2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrac1Label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(najrychlejsiePodanieLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(setyLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(casLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hrac2Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typLabel)
                        .addGap(181, 181, 181)
                        .addComponent(stavLabel)
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typLabel)
                    .addComponent(stavLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac1Label)
                    .addComponent(hrac2Label))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(esaHrac1Label)
                    .addComponent(esaHrac2Label)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(okoHrac1Label)
                    .addComponent(okoHrac2Label)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(uspesnostPodaniaHrac1Label)
                    .addComponent(uspesnostPodaniaHrac2Label)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(casLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(setyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(najrychlejsiePodanieLabel))
                .addGap(15, 15, 15)
                .addComponent(zrusitButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ZapasDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZapasDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZapasDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZapasDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ZapasDetailForm dialog = new ZapasDetailForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel casLabel;
    private javax.swing.JLabel esaHrac1Label;
    private javax.swing.JLabel esaHrac2Label;
    private javax.swing.JLabel hrac1Label;
    private javax.swing.JLabel hrac2Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel najrychlejsiePodanieLabel;
    private javax.swing.JLabel okoHrac1Label;
    private javax.swing.JLabel okoHrac2Label;
    private javax.swing.JLabel setyLabel;
    private javax.swing.JLabel stavLabel;
    private javax.swing.JLabel typLabel;
    private javax.swing.JLabel uspesnostPodaniaHrac1Label;
    private javax.swing.JLabel uspesnostPodaniaHrac2Label;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
