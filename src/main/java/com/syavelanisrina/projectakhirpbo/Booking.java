/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.syavelanisrina.projectakhirpbo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Booking() {
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

        asalL = new javax.swing.JLabel();
        tujuanL = new javax.swing.JLabel();
        tanggalPergiL = new javax.swing.JLabel();
        penumpangL = new javax.swing.JLabel();
        titleL = new javax.swing.JLabel();
        asalTF = new javax.swing.JTextField();
        penumpangTF = new javax.swing.JTextField();
        tujuanTF = new javax.swing.JTextField();
        tanggalTF = new javax.swing.JTextField();
        calenderIcon = new javax.swing.JLabel();
        markerIcon1 = new javax.swing.JLabel();
        markerIcon2 = new javax.swing.JLabel();
        sitIcon = new javax.swing.JLabel();
        cariTiketB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        asalL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        asalL.setText("Dari");

        tujuanL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tujuanL.setText("Ke");

        tanggalPergiL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tanggalPergiL.setText("Tanggal Pergi");

        penumpangL.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        penumpangL.setText("Penumpang");

        titleL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titleL.setText("PEMESANAN TIKET");

        asalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asalTFActionPerformed(evt);
            }
        });

        penumpangTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penumpangTFActionPerformed(evt);
            }
        });

        tujuanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanTFActionPerformed(evt);
            }
        });

        tanggalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalTFActionPerformed(evt);
            }
        });

        calenderIcon.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        calenderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/calendar2.png"))); // NOI18N

        markerIcon1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        markerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/pngegg.png"))); // NOI18N

        markerIcon2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        markerIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/pngegg.png"))); // NOI18N

        sitIcon.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        sitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/syavelanisrina/projectakhirpbo/Resource/penumpang.png"))); // NOI18N

        cariTiketB.setBackground(new java.awt.Color(153, 255, 51));
        cariTiketB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cariTiketB.setForeground(new java.awt.Color(0, 0, 0));
        cariTiketB.setText("Next");
        cariTiketB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTiketBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(titleL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cariTiketB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calenderIcon)
                                    .addComponent(markerIcon1)
                                    .addComponent(markerIcon2)
                                    .addComponent(sitIcon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(asalL)
                                    .addComponent(tujuanL)
                                    .addComponent(tanggalPergiL)
                                    .addComponent(penumpangL)
                                    .addComponent(tanggalTF, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                    .addComponent(tujuanTF)
                                    .addComponent(asalTF)
                                    .addComponent(penumpangTF))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(titleL)
                .addGap(38, 38, 38)
                .addComponent(asalL)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markerIcon1))
                .addGap(18, 18, 18)
                .addComponent(tujuanL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tujuanTF, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markerIcon2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(tanggalPergiL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tanggalTF, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calenderIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(penumpangL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(penumpangTF, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(129, 129, 129)
                        .addComponent(cariTiketB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sitIcon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asalTFActionPerformed
        String asal = asalTF.getText();
        asalTF.setText(asal.toUpperCase());
    }//GEN-LAST:event_asalTFActionPerformed

    private void penumpangTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penumpangTFActionPerformed
        String penumpang = penumpangTF.getText();
        penumpangTF.setText(penumpang);
    }//GEN-LAST:event_penumpangTFActionPerformed

    private void tujuanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanTFActionPerformed
        String tujuan = tujuanTF.getText();
        tujuanTF.setText(tujuan.toUpperCase());
    }//GEN-LAST:event_tujuanTFActionPerformed

    private void tanggalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalTFActionPerformed
        String tanggal = tanggalTF.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        
        try {
            Date date = sdf.parse(tanggal);
            tanggalTF.setText(sdf.format(date));
        } catch(ParseException e) {
            javax.swing.JOptionPane.showMessageDialog (this, "Tanggal tidak valid! Format tanggal dd-mm-yyyy.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            tanggalTF.setText("");
        }
    }//GEN-LAST:event_tanggalTFActionPerformed

    private void cariTiketBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTiketBActionPerformed
        if (asalTF.getText().isEmpty() || tujuanTF.getText().isEmpty() || tanggalTF.getText().isEmpty() || penumpangTF.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Harus diisi semua!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
        DetailPemesanan detailpemesanan = new DetailPemesanan();
        detailpemesanan.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_cariTiketBActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asalL;
    private javax.swing.JTextField asalTF;
    private javax.swing.JLabel calenderIcon;
    private javax.swing.JButton cariTiketB;
    private javax.swing.JLabel markerIcon1;
    private javax.swing.JLabel markerIcon2;
    private javax.swing.JLabel penumpangL;
    private javax.swing.JTextField penumpangTF;
    private javax.swing.JLabel sitIcon;
    private javax.swing.JLabel tanggalPergiL;
    private javax.swing.JTextField tanggalTF;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel tujuanL;
    private javax.swing.JTextField tujuanTF;
    // End of variables declaration//GEN-END:variables
}
