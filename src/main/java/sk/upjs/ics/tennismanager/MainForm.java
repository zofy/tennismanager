package sk.upjs.ics.tennismanager;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class MainForm extends javax.swing.JFrame {
    HracTableModel hracTableModel = new HracTableModel();
    HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    
    public MainForm() {
        initComponents();
        refresh();
        zarovnajCislaVTabulke();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pridatHracaButton = new javax.swing.JButton();
        upravitHracaButton = new javax.swing.JButton();
        odstranitHracaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hracTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        zapasTable = new javax.swing.JTable();
        novyZapasButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        odstranitTurnajButton = new javax.swing.JButton();
        upravitTurnajButton = new javax.swing.JButton();
        pridatTurnajButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        turnajTable = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(hracTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pridatHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upravitHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odstranitHracaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatHracaButton)
                    .addComponent(upravitHracaButton)
                    .addComponent(odstranitHracaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hráči", jPanel1);

        zapasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(zapasTable);

        novyZapasButton.setText("Nový zápas...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novyZapasButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(novyZapasButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Zápasy", jPanel2);

        odstranitTurnajButton.setText("Odstrániť");

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

        turnajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(turnajTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pridatTurnajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upravitTurnajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odstranitTurnajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatTurnajButton)
                    .addComponent(upravitTurnajButton)
                    .addComponent(odstranitTurnajButton))
                .addGap(99, 99, 99))
        );

        jTabbedPane1.addTab("Turnaje", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh() {
        hracTableModel.refresh();
    }
    
    private void zarovnajCislaVTabulke() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        hracTable.setDefaultRenderer(Integer.class, centerRenderer);
    }
    
    private void upravitTurnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitTurnajButtonActionPerformed

    }//GEN-LAST:event_upravitTurnajButtonActionPerformed

    private void pridatHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatHracaButtonActionPerformed
        HracForm hracForm = new HracForm(this, true, null);
        hracForm.setVisible(true);
        
        refresh();
    }//GEN-LAST:event_pridatHracaButtonActionPerformed

    private void pridatTurnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatTurnajButtonActionPerformed
        PridatTurnajForm pridatTurnajForm = new PridatTurnajForm();
        pridatTurnajForm.setVisible(true);
    }//GEN-LAST:event_pridatTurnajButtonActionPerformed

    private void odstranitHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitHracaButtonActionPerformed
        int vybranyRiadok = hracTable.getSelectedRow();
        Hrac hrac = hracTableModel.dajPodlaCislaRiadku(vybranyRiadok);
        hracDao.odstranit(hrac);
        
        refresh();
    }//GEN-LAST:event_odstranitHracaButtonActionPerformed

    private void upravitHracaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitHracaButtonActionPerformed
        int vybranyRiadok = hracTable.getSelectedRow();
        Hrac hrac = hracTableModel.dajPodlaCislaRiadku(vybranyRiadok);
        
        HracForm hracForm = new HracForm(this, true, hrac);
        hracForm.setVisible(true);
        
        refresh();
    }//GEN-LAST:event_upravitHracaButtonActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton novyZapasButton;
    private javax.swing.JButton odstranitHracaButton;
    private javax.swing.JButton odstranitTurnajButton;
    private javax.swing.JButton pridatHracaButton;
    private javax.swing.JButton pridatTurnajButton;
    private javax.swing.JTable turnajTable;
    private javax.swing.JButton upravitHracaButton;
    private javax.swing.JButton upravitTurnajButton;
    private javax.swing.JTable zapasTable;
    // End of variables declaration//GEN-END:variables
}
