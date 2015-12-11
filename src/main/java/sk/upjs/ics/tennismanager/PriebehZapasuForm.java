package sk.upjs.ics.tennismanager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import javax.swing.Timer;

public class PriebehZapasuForm extends javax.swing.JFrame {
    private Time cas = new Time(0, 0, 0);
    private Hrac hrac1;
    private Hrac hrac2;
    private Turnaj turnaj;
    private String typ;
    private int pocetVitaznychSetov;
    private int bodyHrac1;
    private int bodyHrac2;
    private int gemyHrac1;
    private int gemyHrac2;
    private int setyHrac1;
    private int setyHrac2;
    
    private static final int ADVANTAGE = 50;
    
    public PriebehZapasuForm() {
        initComponents();
    }
    
    public PriebehZapasuForm(Hrac hrac1, Hrac hrac2, Turnaj turnaj, String typ, int pocetVitaznychSetov) {
        initComponents();
        this.hrac1 = hrac1;
        this.hrac2 = hrac2;
        this.turnaj = turnaj;
        this.typ = typ;
        this.pocetVitaznychSetov = pocetVitaznychSetov;
        
        Color color = new Color(204, 255, 204);
        this.getContentPane().setBackground(color);
        
        zapasLabel.setText(turnaj.getNazov() + " " + turnaj.getRok() + " - " + typ);
        hrac1Label.setText(hrac1.getMeno() + " " + hrac1.getPriezvisko());
        hrac2Label.setText(hrac2.getMeno() + " " + hrac2.getPriezvisko());
        sety1Label.setText("");
        sety2Label.setText("");
        sety3Label.setText("");
        sety4Label.setText("");
        sety5Label.setText("");
        sety6Label.setText("");
        sety7Label.setText("");
        
        CasovacListener casovacListener = new CasovacListener();
        Timer casovac = new Timer(1000, casovacListener);
        casovac.start();
    }

    private class CasovacListener implements ActionListener {        
        @Override
        public void actionPerformed(ActionEvent e) {
            cas.setSeconds(cas.getSeconds() + 1);
            casLabel.setText(String.valueOf(cas));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casLabel = new javax.swing.JLabel();
        zapasLabel = new javax.swing.JLabel();
        hrac1Panel = new javax.swing.JPanel();
        hrac1Label = new javax.swing.JLabel();
        podanieHrac1Label = new javax.swing.JLabel();
        hrac1PlusBod = new javax.swing.JButton();
        esoHrac1 = new javax.swing.JButton();
        okoHrac1 = new javax.swing.JButton();
        rychlostPodaniaHrac1Txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hrac2Panel = new javax.swing.JPanel();
        hrac2Label = new javax.swing.JLabel();
        podanieHrac2Label = new javax.swing.JLabel();
        hrac2PlusBod = new javax.swing.JButton();
        esoHrac2 = new javax.swing.JButton();
        okoHrac2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rychlostPodaniaHrac2Txt = new javax.swing.JTextField();
        strednyPanel = new javax.swing.JPanel();
        stavGemyLabel = new javax.swing.JLabel();
        stavBodyLabel = new javax.swing.JLabel();
        zmenaPodaniaButton = new javax.swing.JButton();
        sety1Label = new javax.swing.JLabel();
        sety2Label = new javax.swing.JLabel();
        sety3Label = new javax.swing.JLabel();
        sety5Label = new javax.swing.JLabel();
        sety6Label = new javax.swing.JLabel();
        sety7Label = new javax.swing.JLabel();
        sety4Label = new javax.swing.JLabel();
        statistikyComboBox = new javax.swing.JComboBox();
        zrusitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        casLabel.setText("00:00:00");

        zapasLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zapasLabel.setText(".....");

        hrac1Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        hrac1Label.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        hrac1Label.setText(".....");
        hrac1Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        podanieHrac1Label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        podanieHrac1Label.setText(".");

        hrac1PlusBod.setText("+");
        hrac1PlusBod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrac1PlusBodActionPerformed(evt);
            }
        });

        esoHrac1.setText("Eso");

        okoHrac1.setText("Oko");

        jLabel2.setText("km/h");

        javax.swing.GroupLayout hrac1PanelLayout = new javax.swing.GroupLayout(hrac1Panel);
        hrac1Panel.setLayout(hrac1PanelLayout);
        hrac1PanelLayout.setHorizontalGroup(
            hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hrac1PanelLayout.createSequentialGroup()
                        .addComponent(hrac1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(podanieHrac1Label))
                    .addGroup(hrac1PanelLayout.createSequentialGroup()
                        .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(okoHrac1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(esoHrac1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hrac1PlusBod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(hrac1PanelLayout.createSequentialGroup()
                                .addComponent(rychlostPodaniaHrac1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hrac1PanelLayout.setVerticalGroup(
            hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac1Label)
                    .addComponent(podanieHrac1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hrac1PlusBod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esoHrac1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okoHrac1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rychlostPodaniaHrac1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hrac2Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        hrac2Label.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        hrac2Label.setText(".....");

        podanieHrac2Label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        podanieHrac2Label.setText(".");

        hrac2PlusBod.setText("+");
        hrac2PlusBod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrac2PlusBodActionPerformed(evt);
            }
        });

        esoHrac2.setText("Eso");

        okoHrac2.setText("Oko");

        jLabel3.setText("km/h");

        javax.swing.GroupLayout hrac2PanelLayout = new javax.swing.GroupLayout(hrac2Panel);
        hrac2Panel.setLayout(hrac2PanelLayout);
        hrac2PanelLayout.setHorizontalGroup(
            hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac2PanelLayout.createSequentialGroup()
                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hrac2PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createSequentialGroup()
                                .addComponent(podanieHrac2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hrac2Label))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(okoHrac2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(esoHrac2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hrac2PlusBod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(rychlostPodaniaHrac2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        hrac2PanelLayout.setVerticalGroup(
            hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrac2Label)
                    .addComponent(podanieHrac2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hrac2PlusBod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esoHrac2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okoHrac2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rychlostPodaniaHrac2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strednyPanel.setBackground(new java.awt.Color(204, 255, 204));

        stavGemyLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stavGemyLabel.setText("0 - 0");

        stavBodyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stavBodyLabel.setText("0 - 0");

        zmenaPodaniaButton.setText("Zmena podania");

        sety1Label.setText(".....");

        sety2Label.setText(".....");

        sety3Label.setText(".....");

        sety5Label.setText(".....");

        sety6Label.setText(".....");

        sety7Label.setText(".....");

        sety4Label.setText(".....");

        javax.swing.GroupLayout strednyPanelLayout = new javax.swing.GroupLayout(strednyPanel);
        strednyPanel.setLayout(strednyPanelLayout);
        strednyPanelLayout.setHorizontalGroup(
            strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strednyPanelLayout.createSequentialGroup()
                .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(strednyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(zmenaPodaniaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(strednyPanelLayout.createSequentialGroup()
                        .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(strednyPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stavBodyLabel)
                                    .addComponent(stavGemyLabel)))
                            .addGroup(strednyPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sety4Label)
                                    .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sety7Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sety5Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sety6Label, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(sety3Label)
                                    .addComponent(sety2Label)
                                    .addComponent(sety1Label))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        strednyPanelLayout.setVerticalGroup(
            strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strednyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stavGemyLabel)
                .addGap(18, 18, 18)
                .addComponent(stavBodyLabel)
                .addGap(37, 37, 37)
                .addComponent(zmenaPodaniaButton)
                .addGap(29, 29, 29)
                .addComponent(sety1Label)
                .addGap(4, 4, 4)
                .addComponent(sety2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sety3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sety4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sety5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sety6Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sety7Label)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        zrusitButton.setText("Zrušiť");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zapasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(casLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statistikyComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(hrac1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(strednyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hrac2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(zrusitButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casLabel)
                    .addComponent(zapasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(strednyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hrac1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hrac2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statistikyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zrusitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hrac1PlusBodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrac1PlusBodActionPerformed
        switch (bodyHrac1) {
            case 0:
                bodyHrac1 = 15;
                break;
            case 15:
                bodyHrac1 = 30;
                break;
            case 30:
                bodyHrac1 = 40;
                break;
            case 40:
                if (bodyHrac2 == 40)
                    bodyHrac1 = ADVANTAGE;
                else if (bodyHrac2 == ADVANTAGE)
                    bodyHrac2 = 40;
                else {
                    bodyHrac1 = 0;
                    bodyHrac2 = 0;
                    //???
                }
                break;
            case ADVANTAGE:
                bodyHrac1 = 0;
                bodyHrac2 = 0;
                //???
        }
        stavBodyLabel.setText(bodyHrac1 + " - " + bodyHrac2);
    }//GEN-LAST:event_hrac1PlusBodActionPerformed

    private void hrac2PlusBodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrac2PlusBodActionPerformed
        switch (bodyHrac2) {
            case 0:
                bodyHrac2 = 15;
                break;
            case 15:
                bodyHrac2 = 30;
                break;
            case 30:
                bodyHrac2 = 40;
                break;
            case 40:
                if (bodyHrac1 == 40)
                    bodyHrac2 = ADVANTAGE;
                else if (bodyHrac1 == ADVANTAGE)
                    bodyHrac1 = 40;
                else {
                    bodyHrac1 = 0;
                    bodyHrac2 = 0;
                    //???
                }
                break;
            case ADVANTAGE:
                bodyHrac1 = 0;
                bodyHrac2 = 0;
                //???
        }
        stavBodyLabel.setText(bodyHrac1 + " - " + bodyHrac2);
    }//GEN-LAST:event_hrac2PlusBodActionPerformed

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
            java.util.logging.Logger.getLogger(PriebehZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PriebehZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PriebehZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PriebehZapasuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PriebehZapasuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casLabel;
    private javax.swing.JButton esoHrac1;
    private javax.swing.JButton esoHrac2;
    private javax.swing.JLabel hrac1Label;
    private javax.swing.JPanel hrac1Panel;
    private javax.swing.JButton hrac1PlusBod;
    private javax.swing.JLabel hrac2Label;
    private javax.swing.JPanel hrac2Panel;
    private javax.swing.JButton hrac2PlusBod;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okoHrac1;
    private javax.swing.JButton okoHrac2;
    private javax.swing.JLabel podanieHrac1Label;
    private javax.swing.JLabel podanieHrac2Label;
    private javax.swing.JTextField rychlostPodaniaHrac1Txt;
    private javax.swing.JTextField rychlostPodaniaHrac2Txt;
    private javax.swing.JLabel sety1Label;
    private javax.swing.JLabel sety2Label;
    private javax.swing.JLabel sety3Label;
    private javax.swing.JLabel sety4Label;
    private javax.swing.JLabel sety5Label;
    private javax.swing.JLabel sety6Label;
    private javax.swing.JLabel sety7Label;
    private javax.swing.JComboBox statistikyComboBox;
    private javax.swing.JLabel stavBodyLabel;
    private javax.swing.JLabel stavGemyLabel;
    private javax.swing.JPanel strednyPanel;
    private javax.swing.JLabel zapasLabel;
    private javax.swing.JButton zmenaPodaniaButton;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
