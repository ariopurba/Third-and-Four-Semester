/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectGUI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ribka Restu
 */
public class HalamanUtamaUmat extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtamaUmat() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Utama Umat");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelLogo = new javax.swing.JPanel();
        jLabelLogoHU = new javax.swing.JLabel();
        jPanelFormLogin = new javax.swing.JPanel();
        jLabelLogoHU1 = new javax.swing.JLabel();
        jButtonKembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonDaftarMisa = new javax.swing.JButton();
        jButtonBatalMisa = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogo.setBackground(new java.awt.Color(51, 0, 0));
        jPanelLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoHU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo HU_.png"))); // NOI18N
        jPanelLogo.add(jLabelLogoHU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(jPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 80));

        jPanelFormLogin.setBackground(new java.awt.Color(102, 0, 0));
        jPanelFormLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoHU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo HU_.png"))); // NOI18N
        jPanelFormLogin.add(jLabelLogoHU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -60, -1, -1));

        jButtonKembali.setText("KEMBALI");
        jButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembaliActionPerformed(evt);
            }
        });
        jPanelFormLogin.add(jButtonKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Silahkan pilih menu :");
        jPanelFormLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, -1));

        jButtonDaftarMisa.setText("DAFTAR MISA");
        jButtonDaftarMisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaftarMisaActionPerformed(evt);
            }
        });
        jPanelFormLogin.add(jButtonDaftarMisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 40));

        jButtonBatalMisa.setText("BATALKAN MISA");
        jButtonBatalMisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalMisaActionPerformed(evt);
            }
        });
        jPanelFormLogin.add(jButtonBatalMisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 170, 40));

        getContentPane().add(jPanelFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembaliActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            new HalamanUtama().setVisible(true);

    }//GEN-LAST:event_jButtonKembaliActionPerformed

    private void jButtonBatalMisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalMisaActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        new BatalMisa().setVisible(true);
    }//GEN-LAST:event_jButtonBatalMisaActionPerformed

    private void jButtonDaftarMisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaftarMisaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DaftarMisa().setVisible(true);
    }//GEN-LAST:event_jButtonDaftarMisaActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtamaUmat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaUmat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaUmat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaUmat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtamaUmat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatalMisa;
    private javax.swing.JButton jButtonDaftarMisa;
    private javax.swing.JButton jButtonKembali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogoHU;
    private javax.swing.JLabel jLabelLogoHU1;
    private javax.swing.JPanel jPanelFormLogin;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}