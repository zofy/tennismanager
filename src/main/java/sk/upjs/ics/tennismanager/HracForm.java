package sk.upjs.ics.tennismanager;

import javax.swing.ButtonGroup;

public class HracForm extends javax.swing.JDialog {
    private HracDao hracDao = DaoFactory.INSTANCE.getHracDao();
    private Hrac hrac;
    
    public HracForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public HracForm(java.awt.Frame parent, boolean modal, Hrac hrac) {
        super(parent, modal);
        initComponents();
        groupButton();
        
        if (hrac != null) {
            this.hrac = hrac;
            menoTextField.setText(hrac.getMeno());
            priezviskoTextField.setText(hrac.getPriezvisko());
            krajinaTextField.setText(hrac.getKrajina());
            if ("muž".equals(hrac.getPohlavie()))
                muzRadioButton.setSelected(true);
            else
                zenaRadioButton.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        priezviskoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        krajinaTextField = new javax.swing.JTextField();
        zrusitButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        muzRadioButton = new javax.swing.JRadioButton();
        zenaRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        menoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pridať hráča");

        jLabel2.setText("Priezvisko:");

        jLabel3.setText("Krajina:");

        zrusitButton.setText("Zrušiť");
        zrusitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrusitButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Pohlavie:");

        muzRadioButton.setText("Muž");
        muzRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muzRadioButtonActionPerformed(evt);
            }
        });

        zenaRadioButton.setText("Žena");

        jLabel1.setText("Meno:");

        menoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoTextFieldActionPerformed(evt);
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
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muzRadioButton)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zenaRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(krajinaTextField)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zrusitButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(menoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(krajinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(muzRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zenaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zrusitButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_zrusitButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (hrac == null) {
            hrac = new Hrac();
            hrac.setMeno(menoTextField.getText());
            hrac.setPriezvisko(priezviskoTextField.getText());
            hrac.setKrajina(krajinaTextField.getText());
            if (muzRadioButton.isSelected()) {
                hrac.setPohlavie("muž");
            } else {
                hrac.setPohlavie("žena");
            }
            hracDao.pridat(hrac);
        } else {
            hrac.setMeno(menoTextField.getText());
            hrac.setPriezvisko(priezviskoTextField.getText());
            hrac.setKrajina(krajinaTextField.getText());
            if (muzRadioButton.isSelected()) {
                hrac.setPohlavie("muž");
            } else {
                hrac.setPohlavie("žena");
            }
            hracDao.upravit(hrac);
        }
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void menoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menoTextFieldActionPerformed

    private void muzRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muzRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muzRadioButtonActionPerformed

    private void groupButton() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(muzRadioButton);
        bg.add(zenaRadioButton);
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
            java.util.logging.Logger.getLogger(HracForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HracForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HracForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HracForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HracForm dialog = new HracForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField krajinaTextField;
    private javax.swing.JTextField menoTextField;
    private javax.swing.JRadioButton muzRadioButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JRadioButton zenaRadioButton;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
