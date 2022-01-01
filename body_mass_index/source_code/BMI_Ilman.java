
package BMI_Iman;

import java.awt.Color;


public class BMI_Ilman extends javax.swing.JFrame {

    
    public BMI_Ilman() {
        initComponents();
    }

   // kode untuk mengatur frame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        beratBadan = new javax.swing.JTextField();
        tinggiBadan = new javax.swing.JTextField();
        hitungBmi = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        resetUlang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tampilBMI = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        umurKamu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator BMI Ilman");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 153));
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(500, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setAlignmentX(2.0F);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {"19 - 24", "19 - 24"},
                {"25 - 34", "20 - 25"},
                {"35 - 44", "21 - 26"},
                {"45 - 54", "22 - 27"},
                {"55 - 64", "23 - 28"},
                {"> 65", "24 - 29"}
            },
            new String [] {
                "Umur", "BMI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tabel NCI BMI", jPanel2);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {"Underweight", "< 18.4"},
                {"Normal Weight", "18.5 - 24.9"},
                {"Overweight", "25 - 29.9"},
                {"Obesitas tingkat 1", "30 - 34.9"},
                {"Obesitias tingkat 2", "35 - 39.9"},
                {"Obesitas tingkat 3", " >= 40"}
            },
            new String [] {
                "level", "BMI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Tabel BMI", jScrollPane1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 67, 226, 171));

        beratBadan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratBadanActionPerformed(evt);
            }
        });
        getContentPane().add(beratBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 150, 117, 32));

        tinggiBadan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiBadanActionPerformed(evt);
            }
        });
        getContentPane().add(tinggiBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 106, 117, 33));

        hitungBmi.setText("HITUNG BMI");
        hitungBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungBmiActionPerformed(evt);
            }
        });
        getContentPane().add(hitungBmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 243, 121, -1));

        keluar.setBackground(new java.awt.Color(240, 79, 103));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 243, -1, -1));

        resetUlang.setText("RESET");
        resetUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUlangActionPerformed(evt);
            }
        });
        getContentPane().add(resetUlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 71, 37));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("BMI ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("BERAT BADAN (kg)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Created by Tri Ilman Almunawarah Fattah");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 284, 240, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("BODY MASS INDEX (BMI) ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 9, -1, -1));

        tampilBMI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tampilBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 200, 121, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TINGGI BADAN (m)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("USIA (> 18)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, 110, -1));
        getContentPane().add(umurKamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 67, 117, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // code saya di mulai dari sini
    private void hitungBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungBmiActionPerformed
        double tinggi = Double.parseDouble(tinggiBadan.getText());
        double berat = Double.parseDouble(beratBadan.getText());
        double BMIku = berat / (tinggi*tinggi);
        int usia = Integer.parseInt(umurKamu.getText());
        
        String hitungBMI = String.format("%.2f", BMIku);
        tampilBMI.setText(" "+hitungBMI);
        
        if(BMIku < 19){
            tampilBMI.setOpaque(true);
            tampilBMI.setBackground(Color.red);
        }
        else if(BMIku >=19 && BMIku <= 29){
            if(BMIku < 20 && usia >= 25 || BMIku > 24 && usia <= 24){
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.yellow);
            }
            else if(BMIku < 21 && usia >=35||BMIku>25 && usia <=34){
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.yellow);
            }
            else if(BMIku < 22 && usia >=45||BMIku>26 && usia <=44){
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.yellow);
            }
            else if(BMIku < 23 && usia >=55||BMIku>27 && usia <=54){
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.yellow);
            }
            else if(BMIku < 24 && usia >=65||BMIku>28 && usia <=64){
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.yellow);
            }
            else{
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.green);
            }            
        }
        else{
                tampilBMI.setOpaque(true);
                tampilBMI.setBackground(Color.red);
            }  
    }//GEN-LAST:event_hitungBmiActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void resetUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUlangActionPerformed
        tinggiBadan.setText(null);
        beratBadan.setText(null);
        tampilBMI.setText(null);
        tampilBMI.setOpaque(true);
        tampilBMI.setBackground(null);
        umurKamu.setText(null);
    }//GEN-LAST:event_resetUlangActionPerformed

    private void tinggiBadanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiBadanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiBadanActionPerformed

    private void beratBadanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratBadanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratBadanActionPerformed

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
            java.util.logging.Logger.getLogger(BMI_Ilman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI_Ilman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI_Ilman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI_Ilman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI_Ilman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratBadan;
    private javax.swing.JButton hitungBmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton resetUlang;
    private javax.swing.JLabel tampilBMI;
    private javax.swing.JTextField tinggiBadan;
    private javax.swing.JTextField umurKamu;
    // End of variables declaration//GEN-END:variables
}
