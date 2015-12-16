package sk.upjs.ics.tennismanager;

import java.awt.Color;

public class TurnajDetailForm extends javax.swing.JDialog {
    private Turnaj turnaj;
    private ZapasDao zapasDao = DaoFactory.INSTANCE.getZapasDao();
    
    public TurnajDetailForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TurnajDetailForm(java.awt.Frame parent, boolean modal, Turnaj turnaj) {
        super(parent, modal);
        initComponents();
        this.turnaj = turnaj;
        
        nazovLabel.setText(turnaj.getNazov());
        rokLabel.setText(String.valueOf(turnaj.getRok()));
        Hrac vitaz = turnaj.getVitaz();
        if (vitaz == null)
            vitazLabel.setText("-");
        else
            vitazLabel.setText(vitaz.getMeno() + " " + vitaz.getPriezvisko());
        
        zapasyList.setListData(zapasDao.dajPodlaTurnaja(turnaj.getId()).toArray());
        
        Color color = new Color(204, 255, 204);
        this.getContentPane().setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nazovLabel = new javax.swing.JLabel();
        rokLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vitazLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        zapasyList = new javax.swing.JList();
        zrusitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail turnaja");
        setPreferredSize(new java.awt.Dimension(395, 380));

        nazovLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nazovLabel.setText("....");

        rokLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rokLabel.setText(".....");

        jLabel1.setText("Víťaz:");

        vitazLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vitazLabel.setText("....");

        zapasyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zapasyListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(zapasyList);

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vitazLabel))
                            .addComponent(nazovLabel)
                            .addComponent(rokLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zrusitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(nazovLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rokLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vitazLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zrusitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_zrusitButtonActionPerformed

    private void zapasyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zapasyListMouseClicked
        if (evt.getClickCount() == 2) {
            Zapas vybranyZapas = (Zapas) zapasyList.getSelectedValue();

            ZapasDetailForm zapasDetailForm = new ZapasDetailForm(this, true, vybranyZapas);
            zapasDetailForm.setVisible(true);
        }
    }//GEN-LAST:event_zapasyListMouseClicked

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
            java.util.logging.Logger.getLogger(TurnajDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurnajDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurnajDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurnajDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TurnajDetailForm dialog = new TurnajDetailForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nazovLabel;
    private javax.swing.JLabel rokLabel;
    private javax.swing.JLabel vitazLabel;
    private javax.swing.JList zapasyList;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
