/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.syavelanisrina.projectakhirpbo;

/**
 *
 * @author Asus
 */
public class DaftarTiketSoloJogja extends javax.swing.JFrame {

    /**
     * Creates new form DaftarTiketSoloJogja
     */
    public DaftarTiketSoloJogja() {
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

        sancakaRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sancakaTA = new javax.swing.JTextArea();
        lodayaRB = new javax.swing.JRadioButton();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lodayaTA = new javax.swing.JTextArea();
        malabarRB = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        malabarTA = new javax.swing.JTextArea();
        ranggajatiRB = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ranggajatiTA = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        kertanegaraTA = new javax.swing.JTextArea();
        kertanegaraRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sancakaTA.setColumns(20);
        sancakaTA.setRows(5);
        sancakaTA.setText("SANCAKA\n\n01.09    SOLO BALAPAN (SLO)\n '\n '\n02.00    YOGYAKARTA (YK)\t\tRp 210.000/pax");
        jScrollPane1.setViewportView(sancakaTA);

        lodayaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lodayaRBActionPerformed(evt);
            }
        });

        title.setText("DAFTAR TIKET");

        lodayaTA.setColumns(20);
        lodayaTA.setRows(5);
        lodayaTA.setText("LODAYA\n\n07.20    SOLO BALAPAN (SLO)\n '\n '\n08.06    YOGYAKARTA (YK)\t\tRp 320.000/pax");
        jScrollPane2.setViewportView(lodayaTA);

        malabarTA.setColumns(20);
        malabarTA.setRows(5);
        malabarTA.setText("MALABAR\n\n10.30    SOLO BALAPAN (SLO)\n '\n '\n11.36    YOGYAKARTA (YK)\t\tRp 340.000/pax");
        jScrollPane3.setViewportView(malabarTA);

        ranggajatiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranggajatiRBActionPerformed(evt);
            }
        });

        ranggajatiTA.setColumns(20);
        ranggajatiTA.setRows(5);
        ranggajatiTA.setText("RANGGAJATI\n\n13.10    SOLO BALAPAN (SLO)\n '\n '\n14.01    YOGYAKARTA (YK)\t\tRp 265.000/pax");
        jScrollPane4.setViewportView(ranggajatiTA);

        kertanegaraTA.setColumns(20);
        kertanegaraTA.setRows(5);
        kertanegaraTA.setText("KERTANEGARA\n\n13.34    SOLO BALAPAN (SLO)\n '\n '\n14.25    YOGYAKARTA (YK)\t\tRp 210.000/pax");
        jScrollPane5.setViewportView(kertanegaraTA);

        kertanegaraRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kertanegaraRBActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sancakaRB)
                            .addComponent(lodayaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(malabarRB)
                            .addComponent(ranggajatiRB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kertanegaraRB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(sancakaRB)
                        .addGap(89, 89, 89)
                        .addComponent(lodayaRB)
                        .addGap(95, 95, 95)
                        .addComponent(malabarRB)
                        .addGap(89, 89, 89)
                        .addComponent(ranggajatiRB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(kertanegaraRB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lodayaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lodayaRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lodayaRBActionPerformed

    private void ranggajatiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranggajatiRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ranggajatiRBActionPerformed

    private void kertanegaraRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kertanegaraRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kertanegaraRBActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarTiketSoloJogja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarTiketSoloJogja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarTiketSoloJogja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarTiketSoloJogja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarTiketSoloJogja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton kertanegaraRB;
    private javax.swing.JTextArea kertanegaraTA;
    private javax.swing.JRadioButton lodayaRB;
    private javax.swing.JTextArea lodayaTA;
    private javax.swing.JRadioButton malabarRB;
    private javax.swing.JTextArea malabarTA;
    private javax.swing.JRadioButton ranggajatiRB;
    private javax.swing.JTextArea ranggajatiTA;
    private javax.swing.JRadioButton sancakaRB;
    private javax.swing.JTextArea sancakaTA;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
