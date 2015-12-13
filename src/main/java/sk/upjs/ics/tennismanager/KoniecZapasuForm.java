package sk.upjs.ics.tennismanager;

public class KoniecZapasuForm extends javax.swing.JDialog {
    private Zapas zapas;
    private ZapasDao zapasDao = DaoFactory.INSTANCE.getZapasDao();
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    public KoniecZapasuForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public KoniecZapasuForm(java.awt.Frame parent, boolean modal, Zapas zapas) {
        super(parent, modal);
        initComponents();
        this.zapas = zapas;
        
        Hrac hrac1 = zapas.getHrac1();
        Hrac hrac2 = zapas.getHrac2();
        hraciLabel.setText(hrac1.getMeno() + " " + hrac1.getPriezvisko() + "  vs  "
            + hrac2.getMeno() + " " + hrac2.getPriezvisko());
        if (zapas.getStavHrac1() > zapas.getStavHrac2()) {
            vitazLabel.setText(hrac1.getMeno() + " " + hrac1.getPriezvisko());
        } else {
            vitazLabel.setText(hrac2.getMeno() + " " + hrac2.getPriezvisko());
        }
        priebehLabel.setText(zapas.getSety());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hraciLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vitazLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priebehLabel = new javax.swing.JLabel();
        ulozitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setText("Koniec zápasu.");

        jLabel2.setText("Hráči:");

        hraciLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hraciLabel.setText(".....");

        jLabel4.setText("Víťaz:");

        vitazLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vitazLabel.setText(".....");

        jLabel3.setText("Priebeh zápasu:");

        priebehLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        priebehLabel.setText(".....");

        ulozitButton.setText("Uložiť");
        ulozitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hraciLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vitazLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priebehLabel)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ulozitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(hraciLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vitazLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priebehLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ulozitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ulozitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozitButtonActionPerformed
        zapasDao.pridaj(zapas);
        this.setVisible(false);
    }//GEN-LAST:event_ulozitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KoniecZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KoniecZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KoniecZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KoniecZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KoniecZapasuForm dialog = new KoniecZapasuForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel hraciLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel priebehLabel;
    private javax.swing.JButton ulozitButton;
    private javax.swing.JLabel vitazLabel;
    // End of variables declaration//GEN-END:variables
}
