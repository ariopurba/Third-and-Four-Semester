/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectGUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ribka Restu
 */
public class HalamanUtama extends javax.swing.JFrame {

    public static ArrayList<Jadwal> jadwalTerupdate = KosongkanJadwal.jadwalKosong;

    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtama() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Utama");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormLogin = new javax.swing.JPanel();
        jLabelMasukSebagai = new javax.swing.JLabel();
        jButtonMasukAdmin = new javax.swing.JButton();
        jButtonMasukUmat = new javax.swing.JButton();
        jPanelLogo = new javax.swing.JPanel();
        jLabelLogoHU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFormLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFormLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelMasukSebagai.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelMasukSebagai.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMasukSebagai.setText("Masuk sebagai ");

        jButtonMasukAdmin.setText("ADMIN");
        jButtonMasukAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMasukAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMasukAdminMouseClicked(evt);
            }
        });
        jButtonMasukAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasukAdminActionPerformed(evt);
            }
        });

        jButtonMasukUmat.setText("UMAT");
        jButtonMasukUmat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMasukUmat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMasukUmatMouseClicked(evt);
            }
        });
        jButtonMasukUmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasukUmatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormLoginLayout = new javax.swing.GroupLayout(jPanelFormLogin);
        jPanelFormLogin.setLayout(jPanelFormLoginLayout);
        jPanelFormLoginLayout.setHorizontalGroup(
            jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMasukAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMasukSebagai)
                    .addComponent(jButtonMasukUmat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanelFormLoginLayout.setVerticalGroup(
            jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLoginLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabelMasukSebagai)
                .addGap(28, 28, 28)
                .addComponent(jButtonMasukAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMasukUmat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 430));

        jPanelLogo.setBackground(new java.awt.Color(51, 0, 0));
        jPanelLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoHU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo HU_25%.png"))); // NOI18N
        jPanelLogo.add(jLabelLogoHU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 460, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMasukAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasukAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMasukAdminActionPerformed

    private void jButtonMasukUmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasukUmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMasukUmatActionPerformed

    private void jButtonMasukAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasukAdminMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanLogin().setVisible(true);
    }//GEN-LAST:event_jButtonMasukAdminMouseClicked

    private void jButtonMasukUmatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMasukUmatMouseClicked
        // TODO add your handling code here:
        if (jadwalTerupdate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada jawal, silahkan cek dilain waktu. Terima kasih!");
        } else {
            this.setVisible(false);
            new HalamanUtamaUmat().setVisible(true);
        }

    }//GEN-LAST:event_jButtonMasukUmatMouseClicked

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMasukAdmin;
    private javax.swing.JButton jButtonMasukUmat;
    private javax.swing.JLabel jLabelLogoHU;
    private javax.swing.JLabel jLabelMasukSebagai;
    private javax.swing.JPanel jPanelFormLogin;
    private javax.swing.JPanel jPanelLogo;
    // End of variables declaration//GEN-END:variables
}