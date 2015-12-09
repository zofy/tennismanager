package sk.upjs.ics.tennismanager;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class MainForm extends javax.swing.JFrame {
    HracTableModel hracTableModel = new HracTableModel();
    HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    TurnajTableModel turnajTableModel = new TurnajTableModel();
    TurnajDao turnajDao = DaoFactory.INSTANCE.getTurnajDao();

    public MainForm() {
        initComponents();
        refreshHraci();
        refreshTurnaje();
        
        zarovnajCislaVTabulkach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        hraciTab = new javax.swing.JPanel();
        pridatHracaButton = new javax.swing.JButton();
        upravitHracaButton = new javax.swing.JButton();
        odstranitHracaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hracTable = new javax.swing.JTable();
        turnajeTab = new javax.swing.JPanel();
        odstranitTurnajButton = new javax.swing.JButton();
        upravitTurnajButton = new javax.swing.JButton();
        pridatTurnajButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        turnajTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tennis manager");

        pridatHracaButton.setText("Pridať...");
        pridatHracaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatHracaButtonActionPerformed(evt);
            }
        });

        upravitHracaButton.setText("Upraviť...");
        upravitHracaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravitHracaButtonActionPerformed(evt);
            }
        });

        odstranitHracaButton.setText("Odstrániť");
        odstranitHracaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranitHracaButtonActionPerformed(evt);
            }
        });

        hracTable.setModel(hracTableModel);
        hracTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hracTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hracTable);

        javax.swing.GroupLayout hraciTabLayout = new javax.swing.GroupLayout(hraciTab);
        hraciTab.setLayout(hraciTabLayout);
        hraciTabLayout.setHorizontalGroup(
            hraciTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hraciTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hraciTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hraciTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hraciTabLayout.createSequentialGroup()
                        .addComponent(pridatHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upravitHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odstranitHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        hraciTabLayout.setVerticalGroup(
            hraciTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hraciTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hraciTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatHracaButton)
                    .addComponent(upravitHracaButton)
                    .addComponent(odstranitHracaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Hráči", hraciTab);

        odstranitTurnajButton.setText("Odstrániť");
        odstranitTurnajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranitTurnajButtonActionPerformed(evt);
            }
        });

        upravitTurnajButton.setText("Upraviť...");
        upravitTurnajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravitTurnajButtonActionPerformed(evt);
            }
        });

        pridatTurnajButton.setText("Pridať...");
        pridatTurnajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatTurnajButtonActionPerformed(evt);
            }
        });

        turnajTable.setModel(turnajTableModel);
        turnajTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnajTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(turnajTable);

        jButton1.setText("Nový zápas...");

        javax.swing.GroupLayout turnajeTabLayout = new javax.swing.GroupLayout(turnajeTab);
        turnajeTab.setLayout(turnajeTabLayout);
        turnajeTabLayout.setHorizontalGroup(
            turnajeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(turnajeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(turnajeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(turnajeTabLayout.createSequentialGroup()
                        .addComponent(pridatTurnajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(upravitTurnajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odstranitTurnajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        turnajeTabLayout.setVerticalGroup(
            turnajeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(turnajeTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(turnajeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(pridatTurnajButton)
                    .addComponent(upravitTurnajButton)
                    .addComponent(odstranitTurnajButton))
                .addGap(96, 96, 96))
        );

        tabbedPane.addTab("Turnaje", turnajeTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridatTurnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatTurnajButtonActionPerformed
        TurnajForm pridatTurnajForm = new TurnajForm(this, true, null);
        pridatTurnajForm.setVisible(true);
        
        refreshTurnaje();
    }//GEN-LAST:event_pridatTurnajButtonActionPerformed

    private void upravitTurnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitTurnajButtonActionPerformed
        int vybranyRiadok = turnajTable.getSelectedRow();
        Turnaj turnaj = turnajTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        TurnajForm turnajForm = new TurnajForm(this, true, turnaj);
        turnajForm.setVisible(true);

        refreshTurnaje();
    }//GEN-LAST:event_upravitTurnajButtonActionPerformed

    private void odstranitHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitHracaButtonActionPerformed
        int vybranyRiadok = hracTable.getSelectedRow();
        Hrac hrac = hracTableModel.dajPodlaCislaRiadku(vybranyRiadok);
        
        List<Turnaj> turnaje = turnajDao.dajPodlaVitaza(hrac.getId());
        for (Turnaj turnaj : turnaje) {
            turnaj.setVitaz(null);
            turnajDao.upravit(turnaj);
        }
        
        hracDao.odstranit(hrac);

        refreshHraci();
        refreshTurnaje();
    }//GEN-LAST:event_odstranitHracaButtonActionPerformed

    private void upravitHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitHracaButtonActionPerformed
        int vybranyRiadok = hracTable.getSelectedRow();
        Hrac hrac = hracTableModel.dajPodlaCislaRiadku(vybranyRiadok);

        HracForm hracForm = new HracForm(this, true, hrac);
        hracForm.setVisible(true);

        refreshHraci();
    }//GEN-LAST:event_upravitHracaButtonActionPerformed

    private void pridatHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatHracaButtonActionPerformed
        HracForm hracForm = new HracForm(this, true, null);
        hracForm.setVisible(true);

        refreshHraci();
    }//GEN-LAST:event_pridatHracaButtonActionPerformed

    private void hracTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hracTableMouseClicked
        if (evt.getClickCount() == 2) {
            int vybranyRiadok = hracTable.getSelectedRow();
            Hrac hrac = hracTableModel.dajPodlaCislaRiadku(vybranyRiadok);

            HracDetailForm hracDetailForm = new HracDetailForm(this, true, hrac);
            hracDetailForm.setVisible(true);
        }
    }//GEN-LAST:event_hracTableMouseClicked

    private void odstranitTurnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitTurnajButtonActionPerformed
        int vybranyRiadok = turnajTable.getSelectedRow();
        Turnaj turnaj = turnajTableModel.dajPodlaCislaRiadku(vybranyRiadok);
        turnajDao.odstranit(turnaj);

        refreshTurnaje();
    }//GEN-LAST:event_odstranitTurnajButtonActionPerformed

    private void turnajTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnajTableMouseClicked
        if (evt.getClickCount() == 2) {
            int vybranyRiadok = turnajTable.getSelectedRow();
            Turnaj turnaj = turnajTableModel.dajPodlaCislaRiadku(vybranyRiadok);
            
            TurnajDetailForm turnajDetailForm = new TurnajDetailForm(this, true, turnaj);
            turnajDetailForm.setVisible(true);
        }
    }//GEN-LAST:event_turnajTableMouseClicked

    private void refreshHraci() {
        hracTableModel.refresh();
    }
    
    private void refreshTurnaje() {
        turnajTableModel.refresh();
    }

    private void zarovnajCislaVTabulkach() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        hracTable.setDefaultRenderer(Integer.class, centerRenderer);
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        turnajTable.setDefaultRenderer(Integer.class, leftRenderer);
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable hracTable;
    private javax.swing.JPanel hraciTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton odstranitHracaButton;
    private javax.swing.JButton odstranitTurnajButton;
    private javax.swing.JButton pridatHracaButton;
    private javax.swing.JButton pridatTurnajButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable turnajTable;
    private javax.swing.JPanel turnajeTab;
    private javax.swing.JButton upravitHracaButton;
    private javax.swing.JButton upravitTurnajButton;
    // End of variables declaration//GEN-END:variables
}
