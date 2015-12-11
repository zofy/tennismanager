package sk.upjs.ics.tennismanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;

public class NovyZapasForm extends javax.swing.JDialog {
    private Turnaj turnaj;
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    //private Hrac vybranyHrac1;
    //private Hrac vybranyHrac2;

    public NovyZapasForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public NovyZapasForm(java.awt.Frame parent, boolean modal, Turnaj turnaj) {
        super(parent, modal);
        initComponents();
        this.turnaj = turnaj;
        
        groupButton();
        naplnTypComboBox();
        naplnHraciComboBox();
        
//        hrac1ComboBox.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                vybranyHrac1 = (Hrac) hrac1ComboBox.getSelectedItem();
//                hrac2ComboBox.removeAllItems();
//                hrac2ComboBox.setSelectedItem(vybranyHrac2);
//                for (Hrac hrac : hracDao.dajVsetkyOkrem(vybranyHrac1.getId())) {
//                    hrac2ComboBox.addItem(hrac);
//                }
//            }
//        });
//        
//        hrac2ComboBox.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                vybranyHrac2 = (Hrac) hrac2ComboBox.getSelectedItem();
//                hrac1ComboBox.removeAllItems();
//                hrac1ComboBox.setSelectedItem(vybranyHrac1);
//                for (Hrac hrac : hracDao.dajVsetkyOkrem(vybranyHrac2.getId())) {
//                    hrac1ComboBox.addItem(hrac);
//                }
//            }
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sety3RadioButton = new javax.swing.JRadioButton();
        sety4RadioButton = new javax.swing.JRadioButton();
        zrusitButton = new javax.swing.JButton();
        hrac1ComboBox = new javax.swing.JComboBox();
        hrac2ComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        typComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        sety2RadioButton = new javax.swing.JRadioButton();
        zacatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sety3RadioButton.setText("3");

        sety4RadioButton.setText("4");

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("vs");

        jLabel3.setText("Typ:");

        jLabel4.setText("Počet víťazných setov:");

        sety2RadioButton.setText("2");

        zacatButton.setText("Začať...");
        zacatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zacatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hrac1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hrac2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sety2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sety3RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sety4RadioButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(zacatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zrusitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(hrac2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sety2RadioButton)
                    .addComponent(sety3RadioButton)
                    .addComponent(sety4RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zrusitButton)
                    .addComponent(zacatButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_zrusitButtonActionPerformed

    private void zacatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zacatButtonActionPerformed
        this.setVisible(false);
        
        Hrac hrac1 = (Hrac) hrac1ComboBox.getSelectedItem();
        Hrac hrac2 = (Hrac) hrac2ComboBox.getSelectedItem();
        String typ = (String) typComboBox.getSelectedItem();
        int pocetVitazychSetov;
        if (sety2RadioButton.isSelected()) {
            pocetVitazychSetov = 2;
        } else if (sety3RadioButton.isSelected()) {
            pocetVitazychSetov = 3;
        } else {
            pocetVitazychSetov = 4;
        }
        PriebehZapasuForm priebehZapasuForm = new PriebehZapasuForm(hrac1, hrac2,
                turnaj, typ, pocetVitazychSetov);
        priebehZapasuForm.setVisible(true);
    }//GEN-LAST:event_zacatButtonActionPerformed

    private void groupButton() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(sety2RadioButton);
        bg.add(sety3RadioButton);
        bg.add(sety4RadioButton);
    }
    
    private void naplnTypComboBox() {
        typComboBox.addItem("1. kolo");
        typComboBox.addItem("2. kolo");
        typComboBox.addItem("3. kolo");
        typComboBox.addItem("Štvrťfinále");
        typComboBox.addItem("Semifinále");
        typComboBox.addItem("Finále");
    }
    
    private void naplnHraciComboBox() {
        for (Hrac hrac : hracDao.dajVsetky()) {
            hrac1ComboBox.addItem(hrac);
            hrac2ComboBox.addItem(hrac);
        }
        hrac1ComboBox.setSelectedItem(null);
        hrac2ComboBox.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(NovyZapasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovyZapasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovyZapasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovyZapasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NovyZapasForm dialog = new NovyZapasForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox hrac1ComboBox;
    private javax.swing.JComboBox hrac2ComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton sety2RadioButton;
    private javax.swing.JRadioButton sety3RadioButton;
    private javax.swing.JRadioButton sety4RadioButton;
    private javax.swing.JComboBox typComboBox;
    private javax.swing.JButton zacatButton;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
