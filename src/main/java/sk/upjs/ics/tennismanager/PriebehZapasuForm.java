package sk.upjs.ics.tennismanager;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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
    private int esaHrac1;
    private int esaHrac2;
    private int okaHrac1;
    private int okaHrac2;
    private int uspesnostPodaniaHrac1;
    private int uspesnostPodaniaHrac2;
    private List<Integer> podaniaHrac1 = new LinkedList<>();
    private List<Integer> podaniaHrac2 = new LinkedList<>();
    private int najrychlejsiePodanie;
    private Hrac najrychlejsiePodanieHrac;
    private boolean podavaHrac1 = true;
    private boolean podavaHrac2 = false;
    private int aktualnySet = 1;

    private static final int ADVANTAGE = 50;

    Timer casovac;

    public PriebehZapasuForm() {
        initComponents();
    }

    public PriebehZapasuForm(final Hrac hrac1, final Hrac hrac2, Turnaj turnaj, String typ, int pocetVitaznychSetov) {
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
        gemy1Label.setText("0-0");
        gemy2Label.setText("");
        gemy3Label.setText("");
        gemy4Label.setText("");
        gemy5Label.setText("");
        gemy6Label.setText("");
        gemy7Label.setText("");

        podanieHrac1Label.setText(".");
        podanieHrac2Label.setText(" ");

        rychlostPodaniaHrac1Txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                podaniaHrac1.add(Integer.valueOf(rychlostPodaniaHrac1Txt.getText()));

                if (Integer.valueOf(rychlostPodaniaHrac1Txt.getText()) > najrychlejsiePodanie) {
                    najrychlejsiePodanie = Integer.valueOf(rychlostPodaniaHrac1Txt.getText());
                    najrychlejsiePodanieHrac = hrac1;
                }
                rychlostPodaniaHrac1Txt.setText("");
            }
        });

        rychlostPodaniaHrac2Txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                podaniaHrac2.add(Integer.valueOf(rychlostPodaniaHrac2Txt.getText()));

                if (Integer.valueOf(rychlostPodaniaHrac2Txt.getText()) > najrychlejsiePodanie) {
                    najrychlejsiePodanie = Integer.valueOf(rychlostPodaniaHrac2Txt.getText());
                    najrychlejsiePodanieHrac = hrac2;
                }
                rychlostPodaniaHrac2Txt.setText("");
            }
        });

        CasovacListener casovacListener = new CasovacListener();
        casovac = new Timer(1000, casovacListener);
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
        okoHrac1Button = new javax.swing.JButton();
        rychlostPodaniaHrac1Txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        esoHrac1Button = new javax.swing.JButton();
        hrac2Panel = new javax.swing.JPanel();
        hrac2Label = new javax.swing.JLabel();
        podanieHrac2Label = new javax.swing.JLabel();
        hrac2PlusBod = new javax.swing.JButton();
        esoHrac2Button = new javax.swing.JButton();
        okoHrac2Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rychlostPodaniaHrac2Txt = new javax.swing.JTextField();
        strednyPanel = new javax.swing.JPanel();
        stavGemyLabel = new javax.swing.JLabel();
        stavBodyLabel = new javax.swing.JLabel();
        zmenaPodaniaButton = new javax.swing.JButton();
        gemy1Label = new javax.swing.JLabel();
        gemy2Label = new javax.swing.JLabel();
        gemy3Label = new javax.swing.JLabel();
        gemy5Label = new javax.swing.JLabel();
        gemy6Label = new javax.swing.JLabel();
        gemy7Label = new javax.swing.JLabel();
        gemy4Label = new javax.swing.JLabel();
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

        okoHrac1Button.setText("Oko");
        okoHrac1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okoHrac1ButtonActionPerformed(evt);
            }
        });

        rychlostPodaniaHrac1Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rychlostPodaniaHrac1TxtMouseClicked(evt);
            }
        });
        rychlostPodaniaHrac1Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rychlostPodaniaHrac1TxtKeyPressed(evt);
            }
        });

        jLabel2.setText("km/h");

        esoHrac1Button.setText("Eso");
        esoHrac1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esoHrac1ButtonActionPerformed(evt);
            }
        });

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
                            .addGroup(hrac1PanelLayout.createSequentialGroup()
                                .addComponent(rychlostPodaniaHrac1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(esoHrac1Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(okoHrac1Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hrac1PlusBod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(hrac1PlusBod)
                .addGap(11, 11, 11)
                .addComponent(esoHrac1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okoHrac1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hrac1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rychlostPodaniaHrac1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(123, Short.MAX_VALUE))
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

        esoHrac2Button.setText("Eso");
        esoHrac2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esoHrac2ButtonActionPerformed(evt);
            }
        });

        okoHrac2Button.setText("Oko");
        okoHrac2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okoHrac2ButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("km/h");

        javax.swing.GroupLayout hrac2PanelLayout = new javax.swing.GroupLayout(hrac2Panel);
        hrac2Panel.setLayout(hrac2PanelLayout);
        hrac2PanelLayout.setHorizontalGroup(
            hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hrac2PanelLayout.createSequentialGroup()
                        .addComponent(podanieHrac2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hrac2Label))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createSequentialGroup()
                        .addGap(0, 112, Short.MAX_VALUE)
                        .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(okoHrac2Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(esoHrac2Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hrac2PlusBod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hrac2PanelLayout.createSequentialGroup()
                                .addComponent(rychlostPodaniaHrac2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))))
                .addContainerGap())
        );
        hrac2PanelLayout.setVerticalGroup(
            hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrac2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hrac2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podanieHrac2Label)
                    .addComponent(hrac2Label))
                .addGap(18, 18, 18)
                .addComponent(hrac2PlusBod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esoHrac2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okoHrac2Button)
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
        zmenaPodaniaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmenaPodaniaButtonActionPerformed(evt);
            }
        });

        gemy1Label.setText(".....");

        gemy2Label.setText(".....");

        gemy3Label.setText(".....");

        gemy5Label.setText(".....");

        gemy6Label.setText(".....");

        gemy7Label.setText(".....");

        gemy4Label.setText(".....");

        javax.swing.GroupLayout strednyPanelLayout = new javax.swing.GroupLayout(strednyPanel);
        strednyPanel.setLayout(strednyPanelLayout);
        strednyPanelLayout.setHorizontalGroup(
            strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strednyPanelLayout.createSequentialGroup()
                .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(strednyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(zmenaPodaniaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(strednyPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gemy4Label)
                            .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gemy7Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gemy5Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gemy6Label, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(gemy3Label)
                            .addComponent(gemy2Label)
                            .addComponent(gemy1Label))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, strednyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(strednyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stavBodyLabel)
                    .addComponent(stavGemyLabel))
                .addGap(47, 47, 47))
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
                .addComponent(gemy1Label)
                .addGap(4, 4, 4)
                .addComponent(gemy2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemy3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemy4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemy5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemy6Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemy7Label)
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
                            .addComponent(statistikyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(hrac1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zrusitButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(strednyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hrac2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                if (bodyHrac2 == 40) {
                    bodyHrac1 = ADVANTAGE;
                } else if (bodyHrac2 == ADVANTAGE) {
                    bodyHrac2 = 40;
                } else {
                    bodyHrac1 = 0;
                    bodyHrac2 = 0;
                    gemyHrac1++;
                    spocitajAVypis();
                }
                break;
            case ADVANTAGE:
                bodyHrac1 = 0;
                bodyHrac2 = 0;
                gemyHrac1++;
                spocitajAVypis();
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
                if (bodyHrac1 == 40) {
                    bodyHrac2 = ADVANTAGE;
                } else if (bodyHrac1 == ADVANTAGE) {
                    bodyHrac1 = 40;
                } else {
                    bodyHrac1 = 0;
                    bodyHrac2 = 0;
                    gemyHrac2++;
                    spocitajAVypis();
                }
                break;
            case ADVANTAGE:
                bodyHrac1 = 0;
                bodyHrac2 = 0;
                gemyHrac2++;
                spocitajAVypis();
        }
        stavBodyLabel.setText(bodyHrac1 + " - " + bodyHrac2);
    }//GEN-LAST:event_hrac2PlusBodActionPerformed

    private void zmenaPodaniaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmenaPodaniaButtonActionPerformed
        if (podavaHrac1) {
            podavaHrac1 = false;
            podavaHrac2 = true;

            podanieHrac1Label.setText(" ");
            podanieHrac2Label.setText(".");
        } else {
            podavaHrac1 = true;
            podavaHrac2 = false;

            podanieHrac1Label.setText(".");
            podanieHrac2Label.setText(" ");
        }
    }//GEN-LAST:event_zmenaPodaniaButtonActionPerformed

    private void esoHrac1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esoHrac1ButtonActionPerformed
        esaHrac1++;
    }//GEN-LAST:event_esoHrac1ButtonActionPerformed

    private void esoHrac2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esoHrac2ButtonActionPerformed
        esaHrac2++;
    }//GEN-LAST:event_esoHrac2ButtonActionPerformed

    private void okoHrac1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okoHrac1ButtonActionPerformed
        okaHrac1++;
    }//GEN-LAST:event_okoHrac1ButtonActionPerformed

    private void okoHrac2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okoHrac2ButtonActionPerformed
        okaHrac2++;
    }//GEN-LAST:event_okoHrac2ButtonActionPerformed

    private void rychlostPodaniaHrac1TxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rychlostPodaniaHrac1TxtKeyPressed

    }//GEN-LAST:event_rychlostPodaniaHrac1TxtKeyPressed

    private void rychlostPodaniaHrac1TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rychlostPodaniaHrac1TxtMouseClicked

    }//GEN-LAST:event_rychlostPodaniaHrac1TxtMouseClicked

    public void spocitajAVypis() {
        switch (aktualnySet) {
            case 1:
                gemy1Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 2:
                gemy2Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 3:
                gemy3Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 4:
                gemy4Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 5:
                gemy5Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 6:
                gemy6Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
            case 7:
                gemy7Label.setText(gemyHrac1 + "-" + gemyHrac2);
                break;
        }

        if (gemyHrac1 >= 6 && gemyHrac2 <= gemyHrac1 - 2) {
            gemyHrac1 = 0;
            gemyHrac2 = 0;
            setyHrac1++;
            aktualnySet++;
        } else if (gemyHrac2 >= 6 && gemyHrac1 <= gemyHrac2 - 2) {
            gemyHrac1 = 0;
            gemyHrac2 = 0;
            setyHrac2++;
            aktualnySet++;
        }

        stavGemyLabel.setText(gemyHrac1 + " - " + gemyHrac2);

        if (setyHrac1 == pocetVitaznychSetov || setyHrac2 == pocetVitaznychSetov) {
            casovac.stop();
            
            if (setyHrac1 > setyHrac2)
                hrac1.setPocetVyhier(hrac1.getPocetVyhier() + 1);
            else
                hrac2.setPocetVyhier(hrac2.getPocetVyhier() + 1);
            
            Zapas zapas = new Zapas();
            zapas.setHrac1(hrac1);
            zapas.setHrac2(hrac2);
            zapas.setTurnaj(turnaj);
            zapas.setStavHrac1(setyHrac1);
            zapas.setStavHrac2(setyHrac2);
            zapas.setSety(gemy1Label.getText() + "   " + gemy2Label.getText() + "   " + gemy3Label.getText()
                    + "   " + gemy4Label.getText() + "   " + gemy5Label.getText() + "   " + gemy6Label.getText()
                    + "   " + gemy7Label.getText());
            zapas.setNajrychlejsiePodanie(najrychlejsiePodanie);
            zapas.setNajrychlejsiePodanieHrac(najrychlejsiePodanieHrac);
            zapas.setCas(cas);
            zapas.setEsaHrac1(esaHrac1);
            zapas.setEsaHrac2(esaHrac2);
            zapas.setOkoHrac1(okaHrac1);
            zapas.setOkoHrac2(okaHrac2);

            zapas.setUspesnostPodaniaHrac1(0);
            zapas.setUspesnostPodaniaHrac2(0);

            zapas.setTyp(typ);
            
            
            KoniecZapasuForm koniecZapasuForm = new KoniecZapasuForm(this, true, zapas);
            koniecZapasuForm.setVisible(true);
        }
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
    private javax.swing.JButton esoHrac1Button;
    private javax.swing.JButton esoHrac2Button;
    private javax.swing.JLabel gemy1Label;
    private javax.swing.JLabel gemy2Label;
    private javax.swing.JLabel gemy3Label;
    private javax.swing.JLabel gemy4Label;
    private javax.swing.JLabel gemy5Label;
    private javax.swing.JLabel gemy6Label;
    private javax.swing.JLabel gemy7Label;
    private javax.swing.JLabel hrac1Label;
    private javax.swing.JPanel hrac1Panel;
    private javax.swing.JButton hrac1PlusBod;
    private javax.swing.JLabel hrac2Label;
    private javax.swing.JPanel hrac2Panel;
    private javax.swing.JButton hrac2PlusBod;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okoHrac1Button;
    private javax.swing.JButton okoHrac2Button;
    private javax.swing.JLabel podanieHrac1Label;
    private javax.swing.JLabel podanieHrac2Label;
    private javax.swing.JTextField rychlostPodaniaHrac1Txt;
    private javax.swing.JTextField rychlostPodaniaHrac2Txt;
    private javax.swing.JComboBox statistikyComboBox;
    private javax.swing.JLabel stavBodyLabel;
    private javax.swing.JLabel stavGemyLabel;
    private javax.swing.JPanel strednyPanel;
    private javax.swing.JLabel zapasLabel;
    private javax.swing.JButton zmenaPodaniaButton;
    private javax.swing.JButton zrusitButton;
    // End of variables declaration//GEN-END:variables
}
