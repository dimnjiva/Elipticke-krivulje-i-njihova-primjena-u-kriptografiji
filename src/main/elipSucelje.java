
package main;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import eliptickekrivulje.racunanjeiprikaz.WeierstrassovaForma;
import eliptickekrivulje.racunanjeiprikaz.EliptickeKrivulje;
import static eliptickekrivulje.racunanjeiprikaz.EliptickeKrivulje.crtaj;
import static eliptickekrivulje.racunanjeiprikaz.EliptickeKrivulje.p;
import eliptickekrivulje.racunanjeiprikaz.Tocka;
import java.util.ArrayList;


public class elipSucelje extends javax.swing.JFrame {

    
    public elipSucelje() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EKxy = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wfForma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prvaY = new javax.swing.JTextField();
        drugaY = new javax.swing.JTextField();
        prvaX = new javax.swing.JTextField();
        skalar = new javax.swing.JTextField();
        drugaX = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        zbrojX = new javax.swing.JTextField();
        razlikaX = new javax.swing.JTextField();
        prvaSkalarX = new javax.swing.JTextField();
        drugaSkalarX = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        zbrojY = new javax.swing.JTextField();
        razlikaY = new javax.swing.JTextField();
        drugaSkalarY = new javax.swing.JTextField();
        prvaSkalarY = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        vizualizacijaGumb = new javax.swing.JButton();
        natragGumb = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        EKy = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        EKx2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        EKconst = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        EKx = new javax.swing.JTextField();
        weierstrassGumb = new javax.swing.JButton();
        radSTockamaGumb = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        weierstrassA = new javax.swing.JTextField();
        weierstrassB = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        weierstrassP = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("y - koordinata :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("y - koordinata :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 790));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Unesite formulu eliptičke krivulje :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Unesite prvu točku :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("x - koordinata :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("y - koordinata :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Unesite drugu točku :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("x - koordinata :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("y - koordinata :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Weierstrassova forma zadane krivulje :");

        wfForma.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Zbroj zadanih točaka :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Razlika zadanih točaka :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Unesite skalar : (opcionalno)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Umnožak prve točke skalarom :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Umnožak druge točke skalarom :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("x - koordinata :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("x - koordinata :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("x - koordinata :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("x - koordinata :");

        zbrojX.setEditable(false);

        razlikaX.setEditable(false);

        prvaSkalarX.setEditable(false);

        drugaSkalarX.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("y - koordinata :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("y - koordinata :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("y - koordinata :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("y - koordinata :");

        zbrojY.setEditable(false);

        razlikaY.setEditable(false);

        drugaSkalarY.setEditable(false);

        prvaSkalarY.setEditable(false);

        jLabel24.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        vizualizacijaGumb.setHorizontalAlignment(SwingConstants.CENTER);
        vizualizacijaGumb.setBackground(new java.awt.Color(102, 0, 102));
        vizualizacijaGumb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vizualizacijaGumb.setForeground(new java.awt.Color(255, 255, 255));
        vizualizacijaGumb.setText("Vizualizacija krivulje");
        vizualizacijaGumb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vizualizacijaGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vizualizacijaGumbActionPerformed(evt);
            }
        });

        natragGumb.setBackground(new java.awt.Color(153, 0, 102));
        natragGumb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        natragGumb.setForeground(new java.awt.Color(255, 255, 255));
        natragGumb.setText("Povratak");
        natragGumb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        natragGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natragGumbActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("y^2 +");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("xy + ");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("y = x^3 +");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("x^2 +");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("x +");

        vizualizacijaGumb.setHorizontalAlignment(SwingConstants.CENTER);
        weierstrassGumb.setBackground(new java.awt.Color(102, 0, 102));
        weierstrassGumb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        weierstrassGumb.setForeground(new java.awt.Color(255, 255, 255));
        weierstrassGumb.setText("Weierstrassova forma");
        weierstrassGumb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        weierstrassGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weierstrassGumbActionPerformed(evt);
            }
        });

        vizualizacijaGumb.setHorizontalAlignment(SwingConstants.CENTER);
        radSTockamaGumb.setBackground(new java.awt.Color(102, 0, 102));
        radSTockamaGumb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radSTockamaGumb.setForeground(new java.awt.Color(255, 255, 255));
        radSTockamaGumb.setText("Rad s točkama");
        radSTockamaGumb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        radSTockamaGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSTockamaGumbActionPerformed(evt);
            }
        });

        jLabel30.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Unesite formulu eliptičke krivulje : ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("y^2 = x^3 +");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("x + ");

        jLabel34.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("( mod ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText(")");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(natragGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(prvaX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel32)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(weierstrassA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(4, 4, 4)
                                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(3, 3, 3)
                                                        .addComponent(weierstrassB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(drugaX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(skalar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel31))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weierstrassP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel36)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drugaY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(weierstrassGumb)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(261, 261, 261)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EKxy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EKy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EKx2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EKx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EKconst, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wfForma, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(488, 488, 488)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(prvaY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radSTockamaGumb)
                                .addGap(42, 42, 42)
                                .addComponent(vizualizacijaGumb))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(zbrojX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(razlikaX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(prvaSkalarX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(drugaSkalarX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel13))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(zbrojY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(razlikaY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prvaSkalarY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(drugaSkalarY, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EKxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(EKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(EKx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(EKconst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(EKx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(weierstrassGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(wfForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(weierstrassA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(weierstrassB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(weierstrassP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(prvaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prvaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(drugaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radSTockamaGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vizualizacijaGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel20)
                        .addComponent(zbrojX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(zbrojY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(razlikaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(razlikaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prvaSkalarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(prvaSkalarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(drugaSkalarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(drugaSkalarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addGap(28, 28, 28)
                .addComponent(natragGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void natragGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natragGumbActionPerformed
        mainSucelje izbornik = new mainSucelje();
        izbornik.setVisible(true);
        izbornik.setTitle("Glavni izbornik");
        this.setVisible(false);
    }//GEN-LAST:event_natragGumbActionPerformed

    private void weierstrassGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weierstrassGumbActionPerformed
        if((EKy.getText().compareTo("") == 0) || (EKxy.getText().compareTo("") == 0) || (EKx2.getText().compareTo("") == 0) || (EKx.getText().compareTo("") == 0) || (EKconst.getText().compareTo("") == 0)){
            JOptionPane.showMessageDialog(this, "Upišite sve koeficijente!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            float a1 = Float.parseFloat(EKy.getText());
            float a3 = Float.parseFloat(EKxy.getText());
            float a2 = Float.parseFloat(EKx2.getText());
            float a4 = Float.parseFloat(EKx.getText());
            float a6 = Float.parseFloat(EKconst.getText());
            WeierstrassovaForma forma = new WeierstrassovaForma();
            if(forma.postojiLiKratkaWF(a1, a3, a2, a4, a6) == false){
                JOptionPane.showMessageDialog(this, "Za zadanu eliptičku krivulju ne postoji Weierstrassova forma!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
            }
            forma.kratkaWF(a1, a3, a2, a4, a6);
            float a = forma.getA();
            float b = forma.getB();
            String zapisi = "y^2 = x^3 ";
            if(a < 0){
                zapisi = zapisi.concat("- " + Math.abs(a) + "x ");
            }
            else if(a > 0)
                zapisi = zapisi.concat("+ " + a + "x ");
            if(b < 0)
                zapisi = zapisi.concat("- " + Math.abs(b));
            else if(b > 0)
                    zapisi = zapisi.concat("+ " + b);
             
            wfForma.setText(zapisi);
        }
    }//GEN-LAST:event_weierstrassGumbActionPerformed

    private void radSTockamaGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSTockamaGumbActionPerformed
        if((weierstrassA.getText().compareTo("") == 0) || (weierstrassB.getText().compareTo("") == 0) || (weierstrassP.getText().compareTo("") == 0) || (prvaX.getText().compareTo("") == 0) || (prvaY.getText().compareTo("") == 0) || (drugaX.getText().compareTo("") == 0) || (drugaY.getText().compareTo("") == 0)){
           JOptionPane.showMessageDialog(this, "Upišite sve koordinate!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
        }
        else{
        int x1 = Integer.parseInt(prvaX.getText());
        int y1 = Integer.parseInt(prvaY.getText());
        int x2 = Integer.parseInt(drugaX.getText());
        int y2 = Integer.parseInt(drugaY.getText());
        
        Tocka prva = new Tocka(x1,y1);
        Tocka druga = new Tocka(x2,y2);
        
        int a = Integer.parseInt(weierstrassA.getText());
        int b = Integer.parseInt(weierstrassB.getText());
        int p = Integer.parseInt(weierstrassP.getText());
        EliptickeKrivulje ek = new EliptickeKrivulje(a,b,p);
        
        boolean prvaNaEK = ek.TockaNaEK(prva);
        boolean drugaNaEK = ek.TockaNaEK(druga);
        
        if(prvaNaEK == false){
            JOptionPane.showMessageDialog(this, "Prva upisana točka nije točka na zadanoj eliptičkoj krivulji! Promijenite točku!", "Upozorenje", JOptionPane.WARNING_MESSAGE); 
        }
        
        if(drugaNaEK == false){
            JOptionPane.showMessageDialog(this, "Druga upisana točka nije točka na zadanoj eliptičkoj krivulji! Promijenite točku!", "Upozorenje", JOptionPane.WARNING_MESSAGE); 
        }
        
        
        Tocka zbroj = ek.zbroji(prva, druga);
        zbrojX.setText(Integer.toString(zbroj.x));
        zbrojY.setText(Integer.toString(zbroj.y));
        
        Tocka razlika = ek.oduzmi(prva, druga);
        razlikaX.setText(Integer.toString(razlika.x));
        razlikaY.setText(Integer.toString(razlika.y));
        
        if(skalar.getText().compareTo("") == 1){
            int s = Integer.parseInt(skalar.getText());
            Tocka skalMnoz1 = ek.skalarnoMnozenje(prva, s);
            Tocka skalMnoz2 = ek.skalarnoMnozenje(druga, s);
            prvaSkalarX.setText(Integer.toString(skalMnoz1.x));
            prvaSkalarY.setText(Integer.toString(skalMnoz1.y));
            drugaSkalarX.setText(Integer.toString(skalMnoz2.x));
            drugaSkalarY.setText(Integer.toString(skalMnoz2.y));
        }
        }
    }//GEN-LAST:event_radSTockamaGumbActionPerformed

    private void vizualizacijaGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vizualizacijaGumbActionPerformed
        if((weierstrassA.getText().compareTo("") == 0) || (weierstrassB.getText().compareTo("") == 0) || (weierstrassP.getText().compareTo("") == 0)){
           JOptionPane.showMessageDialog(this, "Upišite sve koeficijente!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
        }
        else{
        int a = Integer.parseInt(weierstrassA.getText());
        int b = Integer.parseInt(weierstrassB.getText());
        int p = Integer.parseInt(weierstrassP.getText());
        EliptickeKrivulje ek = new EliptickeKrivulje(a,b,p);
        
        ArrayList<Tocka> L;
        L = ek.tockeZaCrtanjeINT();
        crtaj(L, p);
        }
    }//GEN-LAST:event_vizualizacijaGumbActionPerformed

    
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
            java.util.logging.Logger.getLogger(elipSucelje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elipSucelje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elipSucelje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elipSucelje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                elipSucelje ekran = new elipSucelje();
                ekran.setVisible(true);
                ekran.setResizable(false);
                ekran.setTitle("Rad s eliptičkim krivuljama");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EKconst;
    private javax.swing.JTextField EKx;
    private javax.swing.JTextField EKx2;
    private javax.swing.JTextField EKxy;
    private javax.swing.JTextField EKy;
    private javax.swing.JTextField drugaSkalarX;
    private javax.swing.JTextField drugaSkalarY;
    private javax.swing.JTextField drugaX;
    private javax.swing.JTextField drugaY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton natragGumb;
    private javax.swing.JTextField prvaSkalarX;
    private javax.swing.JTextField prvaSkalarY;
    private javax.swing.JTextField prvaX;
    private javax.swing.JTextField prvaY;
    private javax.swing.JButton radSTockamaGumb;
    private javax.swing.JTextField razlikaX;
    private javax.swing.JTextField razlikaY;
    private javax.swing.JTextField skalar;
    private javax.swing.JButton vizualizacijaGumb;
    private javax.swing.JTextField weierstrassA;
    private javax.swing.JTextField weierstrassB;
    private javax.swing.JButton weierstrassGumb;
    private javax.swing.JTextField weierstrassP;
    private javax.swing.JTextField wfForma;
    private javax.swing.JTextField zbrojX;
    private javax.swing.JTextField zbrojY;
    // End of variables declaration//GEN-END:variables
}
