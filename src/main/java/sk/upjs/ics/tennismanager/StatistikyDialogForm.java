package sk.upjs.ics.tennismanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class StatistikyDialogForm extends javax.swing.JDialog {

    public StatistikyDialogForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public StatistikyDialogForm(java.awt.Frame parent, boolean modal, Hrac hrac1,
            Hrac hrac2, String typStatistiky, int hodnotaHrac1, int hodnotaHrac2, String nazovOkna) {
        super(parent, modal);
        initComponents();
        
        String jednotka;
        if (typStatistiky.equals("Esá") || typStatistiky.equals("Oko"))
            jednotka = " krát";
        else if (typStatistiky.equals("Najrýchlejšie podanie"))
            jednotka = " km/h";
        else
            jednotka = " %";

        hrac1MenoLabel.setText(hrac1.getMeno() + " " + hrac1.getPriezvisko() + ": ");
        hodnotaHrac1Label.setText(String.valueOf(hodnotaHrac1) + jednotka);
        if (hrac2 != null) {
            hrac2MenoLabel.setText(hrac2.getMeno() + " " + hrac2.getPriezvisko() + ": ");
            hodnotaHrac2Label.setText(String.valueOf(hodnotaHrac2) + jednotka);
        }
        this.setTitle(nazovOkna);
        
        this.setLocationRelativeTo(parent);
        this.setLocationByPlatform(true);
        
        Color color = new Color(204, 255, 204);
        this.getContentPane().setBackground(color);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - this.getSize().width) / 2, (dim.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hrac1MenoLabel = new javax.swing.JLabel();
        hrac2MenoLabel = new javax.swing.JLabel();
        hodnotaHrac1Label = new javax.swing.JLabel();
        hodnotaHrac2Label = new javax.swing.JLabel();
        zrusitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hrac1MenoLabel.setText(".....");

        hrac2MenoLabel.setText(".....");

        hodnotaHrac1Label.setText(".....");

        hodnotaHrac2Label.setText(".....");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hrac1MenoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(hodnotaHrac1Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hrac2MenoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(hodnotaHrac2Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(zrusitButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac1MenoLabel)
                    .addComponent(hodnotaHrac1Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac2MenoLabel)
                    .addComponent(hodnotaHrac2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zrusitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zrusitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrusitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_zrusitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StatistikyDialogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatistikyDialogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatistikyDialogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatistikyDialogForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatistikyDialogForm dialog = new StatistikyDialogForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel hodnotaHrac1Label;
    private javax.swing.JLabel hodnotaHrac2Label;
    private javax.swing.JLabel hrac1MenoLabel;
    private javax.swing.JLabel hrac2MenoLabel;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
