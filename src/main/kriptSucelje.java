
package main;
import eliptickekrivulje.algoritmi.ECIES;
import eliptickekrivulje.domene.ECIESPoruka;
import eliptickekrivulje.domene.ParKljuceva;
import eliptickekrivulje.fileRW.ReadECIESPoruka;
import eliptickekrivulje.fileRW.ReadKey;
import eliptickekrivulje.generatorkljuca.GeneratorKljuca;
import java.io.File;
import javax.swing.JOptionPane;


public class kriptSucelje extends javax.swing.JFrame {

    
    public kriptSucelje() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genKljuc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        javniKljuc = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        velicinaKljuca4 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        privatniKljuc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        zaEnkripciju = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        enkriptirano = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        dekriptirano = new javax.swing.JTextArea();
        enkriptiraj = new javax.swing.JButton();
        dekriptiraj = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        natragGumb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(890, 600));
        setSize(new java.awt.Dimension(0, 0));

        genKljuc.setBackground(new java.awt.Color(0, 102, 102));
        genKljuc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genKljuc.setForeground(new java.awt.Color(255, 255, 255));
        genKljuc.setText("Generiraj ključeve");
        genKljuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        genKljuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genKljuc.setMultiClickThreshhold(1L);
        genKljuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genKljucActionPerformed(evt);
            }
        });

        javniKljuc.setEditable(false);
        javniKljuc.setBackground(new java.awt.Color(255, 255, 255));
        javniKljuc.setColumns(20);
        javniKljuc.setLineWrap(true);
        javniKljuc.setRows(5);
        jScrollPane1.setViewportView(javniKljuc);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Veličina ključa :");

        velicinaKljuca4.setBackground(new java.awt.Color(0, 102, 102));
        velicinaKljuca4.setForeground(new java.awt.Color(255, 255, 255));
        velicinaKljuca4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256r1", "secp384r1" }));
        velicinaKljuca4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(velicinaKljuca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(velicinaKljuca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        privatniKljuc.setEditable(false);
        privatniKljuc.setBackground(new java.awt.Color(153, 153, 153));
        privatniKljuc.setColumns(20);
        privatniKljuc.setLineWrap(true);
        privatniKljuc.setRows(5);
        jScrollPane2.setViewportView(privatniKljuc);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Privatni ključ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Javni ključ");

        zaEnkripciju.setLineWrap(true);
        zaEnkripciju.setColumns(20);
        zaEnkripciju.setRows(5);
        jScrollPane3.setViewportView(zaEnkripciju);

        enkriptirano.setEditable(false);
        enkriptirano.setBackground(new java.awt.Color(204, 204, 204));
        enkriptirano.setColumns(20);
        enkriptirano.setLineWrap(true);
        enkriptirano.setRows(5);
        jScrollPane4.setViewportView(enkriptirano);

        dekriptirano.setLineWrap(true);
        dekriptirano.setEditable(false);
        dekriptirano.setBackground(new java.awt.Color(255, 255, 255));
        dekriptirano.setColumns(20);
        dekriptirano.setRows(5);
        jScrollPane5.setViewportView(dekriptirano);

        enkriptiraj.setBackground(new java.awt.Color(0, 102, 102));
        enkriptiraj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enkriptiraj.setForeground(new java.awt.Color(255, 255, 255));
        enkriptiraj.setText("Enkriptiraj");
        enkriptiraj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enkriptiraj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enkriptiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enkriptirajActionPerformed(evt);
            }
        });

        dekriptiraj.setBackground(new java.awt.Color(0, 102, 102));
        dekriptiraj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dekriptiraj.setForeground(new java.awt.Color(255, 255, 255));
        dekriptiraj.setText("Dekriptiraj");
        dekriptiraj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dekriptiraj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dekriptiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dekriptirajActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tekst za enkripciju");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Enkriptirani tekst");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Dekriptirani tekst");

        jLabel2.setVisible(false);
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Niste unijeli ništa za enkripciju!");

        jLabel8.setVisible(false);
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Unesite tekst za enkripciju!");

        natragGumb.setBackground(new java.awt.Color(0, 153, 153));
        natragGumb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        natragGumb.setForeground(new java.awt.Color(255, 255, 255));
        natragGumb.setText("Povratak");
        natragGumb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        natragGumb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        natragGumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natragGumbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genKljuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(307, 307, 307))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(enkriptiraj, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(natragGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dekriptiraj, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genKljuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enkriptiraj, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(dekriptiraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(natragGumb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dekriptirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dekriptirajActionPerformed
        if (enkriptirano.getText().replaceAll(" ", "").isEmpty()) {
            jLabel8.setVisible(true);
        }
        else{
            jLabel8.setVisible(false);
            File file = new File("privateKey.txt");
            File eciesFile = new File("ecies.txt");
            ECIES ecies = new ECIES(velicinaKljuca4.getSelectedItem().toString());
            ECIESPoruka eciesMessage = (ECIESPoruka) ReadECIESPoruka.readECIESMessage(eciesFile);
            dekriptirano.setText(ecies.decrypt(eciesMessage, ReadKey.read(file)));
        }
            
    }//GEN-LAST:event_dekriptirajActionPerformed

    private void enkriptirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enkriptirajActionPerformed
        if(privatniKljuc.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(this, "Generirajte ključeve!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            if(zaEnkripciju.getText().replaceAll(" ", "").isEmpty()){
                jLabel2.setVisible(true);
            }
            else{
            jLabel2.setVisible(false);
            File file = new File("publicKey.txt");
            File eciesFile = new File("ecies.txt");
            ECIES ecies = new ECIES(velicinaKljuca4.getSelectedItem().toString());
            ecies.encryptECIES(zaEnkripciju.getText(), ReadKey.read(file));
            ECIESPoruka eciesMessage = (ECIESPoruka) ReadECIESPoruka.readECIESMessage(eciesFile);
            enkriptirano.setText(eciesMessage.getMessage());
            }
        }
    }//GEN-LAST:event_enkriptirajActionPerformed

    private void natragGumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natragGumbActionPerformed
        mainSucelje izbornik = new mainSucelje();
        izbornik.setVisible(true);
        izbornik.setTitle("Glavni izbornik");
        this.setVisible(false);
    }//GEN-LAST:event_natragGumbActionPerformed

    private void genKljucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genKljucActionPerformed
        GeneratorKljuca keyGenerator = new GeneratorKljuca(velicinaKljuca4.getSelectedItem().toString());
        ParKljuceva keyPair = keyGenerator.generateKeys();
        javniKljuc.setText(keyPair.getPublicKey());
        privatniKljuc.setText(keyPair.getPrivateKey());
    }//GEN-LAST:event_genKljucActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                kriptSucelje window = new kriptSucelje();
                window.setVisible(true);
                window.setResizable(false);
                window.setTitle("Kriptografija eliptičkim krivuljama");
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dekriptiraj;
    private javax.swing.JTextArea dekriptirano;
    private javax.swing.JButton enkriptiraj;
    private javax.swing.JTextArea enkriptirano;
    private javax.swing.JButton genKljuc;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea javniKljuc;
    private javax.swing.JButton natragGumb;
    private javax.swing.JTextArea privatniKljuc;
    private javax.swing.JComboBox<String> velicinaKljuca4;
    private javax.swing.JTextArea zaEnkripciju;
    // End of variables declaration//GEN-END:variables
}
