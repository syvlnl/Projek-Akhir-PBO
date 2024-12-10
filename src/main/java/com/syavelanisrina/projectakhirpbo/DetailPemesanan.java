/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.syavelanisrina.projectakhirpbo;

/**
 *
 * @author shifa
 */
public class DetailPemesanan extends javax.swing.JFrame {

    /**
     * Creates new form DetailPemesanan
     */
    public DetailPemesanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailtitleL = new javax.swing.JLabel();
        namaL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        teleponL = new javax.swing.JLabel();
        ktpL = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        ktpTF = new javax.swing.JTextField();
        teleponTF = new javax.swing.JTextField();
        cariTiketB = new javax.swing.JButton();
        cariTiketB1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detailtitleL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        detailtitleL.setText("DETAIL PEMESANAN");

        namaL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        namaL.setText("Nama");

        emailL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        emailL.setText("Email");

        teleponL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        teleponL.setText("No Telepon");

        ktpL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ktpL.setText("No KTP");

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        ktpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktpTFActionPerformed(evt);
            }
        });

        teleponTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponTFActionPerformed(evt);
            }
        });

        cariTiketB.setBackground(new java.awt.Color(255, 0, 0));
        cariTiketB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cariTiketB.setForeground(new java.awt.Color(0, 0, 0));
        cariTiketB.setText("Next");
        cariTiketB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTiketBActionPerformed(evt);
            }
        });

        cariTiketB1.setBackground(new java.awt.Color(153, 255, 51));
        cariTiketB1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cariTiketB1.setForeground(new java.awt.Color(0, 0, 0));
        cariTiketB1.setText("Next");
        cariTiketB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTiketB1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/nama.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/email.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/nomorTelepon.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/ktp.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ktpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ktpL)
                        .addComponent(teleponL)
                        .addComponent(namaL)
                        .addComponent(namaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                        .addComponent(emailL)
                        .addComponent(emailTF)
                        .addComponent(teleponTF))
                    .addComponent(cariTiketB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailtitleL)
                .addGap(90, 90, 90))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(cariTiketB1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(detailtitleL)
                .addGap(35, 35, 35)
                .addComponent(namaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(emailL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(teleponL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teleponTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(ktpL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ktpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(cariTiketB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(613, Short.MAX_VALUE)
                    .addComponent(cariTiketB1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(127, 127, 127)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        String nama = namaTF.getText();
        namaTF.setText(nama.toUpperCase());
    }//GEN-LAST:event_namaTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        String email = emailTF.getText();
        emailTF.setText(email.toUpperCase());
    }//GEN-LAST:event_emailTFActionPerformed

    private void ktpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktpTFActionPerformed
        String ktp = ktpTF.getText();
        ktpTF.setText(ktp.toUpperCase());
    }//GEN-LAST:event_ktpTFActionPerformed

    private void teleponTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponTFActionPerformed
        String telepon = teleponTF.getText();
        teleponTF.setText(telepon.toUpperCase());
    }//GEN-LAST:event_teleponTFActionPerformed

    private void cariTiketBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTiketBActionPerformed
        Booking booking = new Booking();
        booking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cariTiketBActionPerformed

    private void cariTiketB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTiketB1ActionPerformed

    }//GEN-LAST:event_cariTiketB1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariTiketB;
    private javax.swing.JButton cariTiketB1;
    private javax.swing.JLabel detailtitleL;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel ktpL;
    private javax.swing.JTextField ktpTF;
    private javax.swing.JLabel namaL;
    private javax.swing.JTextField namaTF;
    private javax.swing.JLabel teleponL;
    private javax.swing.JTextField teleponTF;
    // End of variables declaration//GEN-END:variables
}
