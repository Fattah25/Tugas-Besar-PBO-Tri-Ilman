
package konversi_suhu_ilman;

import java.awt.Color;


public class tampilanKonversiSuhu extends javax.swing.JFrame {

    public tampilanKonversiSuhu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        latar = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        pilihan1 = new javax.swing.JComboBox<>();
        pilihan2 = new javax.swing.JComboBox<>();
        suhuPertama = new javax.swing.JTextField();
        suhuKedua = new javax.swing.JTextField();
        konversi2Suhu = new javax.swing.JButton();
        clearAndClean = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konversi SuhuKu");
        setIconImages(null);
        setResizable(false);

        latar.setBackground(new java.awt.Color(51, 204, 0));

        Judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Konversi SuhuKu");

        javax.swing.GroupLayout latarLayout = new javax.swing.GroupLayout(latar);
        latar.setLayout(latarLayout);
        latarLayout.setHorizontalGroup(
            latarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(latarLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Judul)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        latarLayout.setVerticalGroup(
            latarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(latarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Judul)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pilihan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit" }));
        pilihan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihan1ActionPerformed(evt);
            }
        });

        pilihan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit" }));

        suhuPertama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuPertamaActionPerformed(evt);
            }
        });

        suhuKedua.setEditable(false);
        suhuKedua.setBorder(null);

        konversi2Suhu.setText("Konversi");
        konversi2Suhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversi2SuhuActionPerformed(evt);
            }
        });

        clearAndClean.setBackground(new java.awt.Color(255, 51, 51));
        clearAndClean.setText("Bersihkan");
        clearAndClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clearAndClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAndCleanActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keluar.setText("X");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TO");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 2, 11)); // NOI18N
        jLabel1.setText("Created by Tri Ilman Almunawarah Fattah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(latar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pilihan1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(suhuPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pilihan2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(suhuKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(konversi2Suhu)
                .addGap(68, 68, 68)
                .addComponent(clearAndClean))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(keluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(latar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihan1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhuPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihan2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhuKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(konversi2Suhu))
                            .addComponent(clearAndClean))
                        .addGap(37, 37, 37)
                        .addComponent(keluar)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        pilihan2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihan1ActionPerformed

    private void suhuPertamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuPertamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhuPertamaActionPerformed

    private void clearAndCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAndCleanActionPerformed
        suhuKedua.setText(null);
        suhuPertama.setText(null);
    }//GEN-LAST:event_clearAndCleanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void konversi2SuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversi2SuhuActionPerformed
        String kotakPilihan1 = (String)pilihan1.getSelectedItem();
        String kotakPilihan2 = (String)pilihan2.getSelectedItem();
        
        if(kotakPilihan1.equals("Celcius")&& kotakPilihan2.equals("Fahrenheit")){
            double celcius = Double.parseDouble(suhuPertama.getText());
            double fahrenheit = (double)(celcius * 1.8 + 32);
            
                String konversiAku = String.format("%.2f", fahrenheit);
                suhuKedua.setText(" "+konversiAku+" ºF");
        }
        else if(kotakPilihan1.equals("Fahrenheit")&& kotakPilihan2.equals("Celcius")){
            double fahrenheit = Double.parseDouble(suhuPertama.getText());
            double celcius = (double)((fahrenheit - 32)*0.55556);
            
            String konversiAku = String.format("%.2f", celcius);
            suhuKedua.setText(" "+konversiAku+" ºC");
        }
        else{
            suhuKedua.setText("Tidak dapat mengkonversi");
        }
    }//GEN-LAST:event_konversi2SuhuActionPerformed

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
            java.util.logging.Logger.getLogger(tampilanKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilanKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilanKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilanKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilanKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JButton clearAndClean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton konversi2Suhu;
    private javax.swing.JPanel latar;
    private javax.swing.JComboBox<String> pilihan1;
    private javax.swing.JComboBox<String> pilihan2;
    private javax.swing.JTextField suhuKedua;
    private javax.swing.JTextField suhuPertama;
    // End of variables declaration//GEN-END:variables
}
