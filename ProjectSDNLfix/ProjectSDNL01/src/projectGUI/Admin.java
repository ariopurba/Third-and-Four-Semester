/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectGUI;

import java.awt.Color;

/**
 *
 * @author Ribka Restu
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelHUGambar = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelLogn = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelGambarUsername = new javax.swing.JLabel();
        jLabelGambarPassword = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        LabelGambarUtama = new javax.swing.JLabel();
        jPanelJudulHU = new javax.swing.JPanel();
        jLabelTulisanApk = new javax.swing.JLabel();
        jLabelTulisanApk1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHUGambar.setBackground(new java.awt.Color(102, 0, 0));
        jPanelHUGambar.setForeground(new java.awt.Color(102, 51, 0));
        jPanelHUGambar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogin.setBackground(new java.awt.Color(153, 153, 153));

        jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("USERNAME");

        jLabelLogn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelLogn.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogn.setText("LOGIN");

        jTextFieldUsername.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldUsername.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldPassword.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("PASSWORD");

        jLabelGambarUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelGambarUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGambarUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGambarUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jLabelGambarPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelGambarPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGambarPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGambarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N

        jButtonLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setBorder(null);
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseEntered(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelGambarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGambarUsername))
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGambarUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGambarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelHUGambar.add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 340, 240));

        LabelGambarUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UtamaBlur.png"))); // NOI18N
        LabelGambarUtama.setOpaque(true);
        jPanelHUGambar.add(LabelGambarUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 630, -1));

        jPanelJudulHU.setBackground(new java.awt.Color(51, 0, 0));

        jLabelTulisanApk.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelTulisanApk.setForeground(new java.awt.Color(204, 153, 0));
        jLabelTulisanApk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTulisanApk.setText("Aplikasi pendaftaran misa");
        jLabelTulisanApk.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelTulisanApk1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelTulisanApk1.setForeground(new java.awt.Color(204, 153, 0));
        jLabelTulisanApk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTulisanApk1.setText(" Gereja St. Aloysius Kalembu paneta");
        jLabelTulisanApk1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelJudulHULayout = new javax.swing.GroupLayout(jPanelJudulHU);
        jPanelJudulHU.setLayout(jPanelJudulHULayout);
        jPanelJudulHULayout.setHorizontalGroup(
            jPanelJudulHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJudulHULayout.createSequentialGroup()
                .addGroup(jPanelJudulHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTulisanApk1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addComponent(jLabelTulisanApk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelJudulHULayout.setVerticalGroup(
            jPanelJudulHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJudulHULayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelTulisanApk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabelTulisanApk1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelHUGambar.add(jPanelJudulHU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        getContentPane().add(jPanelHUGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseEntered
        // TODO add your handling code here:
        jButtonLogin.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jButtonLoginMouseEntered

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelGambarUtama;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGambarPassword;
    private javax.swing.JLabel jLabelGambarUsername;
    private javax.swing.JLabel jLabelLogn;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTulisanApk;
    private javax.swing.JLabel jLabelTulisanApk1;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelHUGambar;
    private javax.swing.JPanel jPanelJudulHU;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}