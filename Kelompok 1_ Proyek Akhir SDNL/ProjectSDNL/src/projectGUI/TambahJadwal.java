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
public class TambahJadwal extends javax.swing.JFrame {

    public static ArrayList<Jadwal> jadwal = new ArrayList<Jadwal>();
    static int buatJadwal = 0;

    /**
     * Creates new form HalamanUtama
     */
    public TambahJadwal() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tambah Jadwal Misa");
        jTextFieldKuota.setEnabled(false);
        if (buatJadwal == 0) {
            jadwal.add(new Jadwal(50, "pukul 17.00 WIB", "28-05-2022", "Sabtu"));
            jadwal.get(0).setImam("Cyprianus Kuntoro Adi");
            jadwal.add(new Jadwal(32, "pukul 07.00 WIB", "29-05-2022", "Minggu"));
            jadwal.get(1).setImam("Drs.Hari Suparwito");
            jadwal.add(new Jadwal(30, "pukul 17.00 WIB", "29-05-2022", "Minggu"));
            jadwal.get(2).setImam("Drs.Hari Suparwito");
            buatJadwal++;
        }

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
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxHari = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldWaktu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxImam = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTanggal = new javax.swing.JComboBox<>();
        jComboBoxBulan = new javax.swing.JComboBox<>();
        jComboBoxTahun = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldKuota = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jPanelFormLogin = new javax.swing.JPanel();
        jLabelLogoHU1 = new javax.swing.JLabel();
        jLabelCariDataUmat = new javax.swing.JLabel();
        jLabelLihatDataUmat = new javax.swing.JLabel();
        jLabelTambahJadwalMisa = new javax.swing.JLabel();
        jLabelHapusJadwalMisa = new javax.swing.JLabel();
        jLabelKosongkanJadwalMisa = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogo.setBackground(new java.awt.Color(51, 0, 0));
        jPanelLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoHU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo HU_.png"))); // NOI18N
        jPanelLogo.add(jLabelLogoHU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kozuka Mincho Pr6N M", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 150, 0));
        jLabel5.setText("GEREJA SANTO ALOYSIUS KALEMBU PANETA");
        jPanelLogo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        getContentPane().add(jPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pilih hari                    :");

        jComboBoxHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));
        jComboBoxHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHariActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Masukkan waktu     :");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pilih Imam : ");

        jComboBoxImam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cyprianus Kuntoro Adi", "Drs.Hari Suparwito" }));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Masukkan tanggal   :");

        jComboBoxTanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTanggalActionPerformed(evt);
            }
        });

        jComboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBoxTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2026", "2025", "2024", "2023", "2022", "2021" }));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Format :DD-MM-YYYY");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Format  : pukul 20.00 WIB");

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Masukkan Kuota      :");

        jTextFieldKuota.setText("Masukkan angka");
        jTextFieldKuota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldKuotaMouseClicked(evt);
            }
        });
        jTextFieldKuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKuotaActionPerformed(evt);
            }
        });

        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSimpanMouseClicked(evt);
            }
        });
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxHari, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxImam, 0, 158, Short.MAX_VALUE)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jTextFieldKuota, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxImam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldKuota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 510, 350));

        jPanelFormLogin.setBackground(new java.awt.Color(102, 0, 0));
        jPanelFormLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoHU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo HU_.png"))); // NOI18N
        jPanelFormLogin.add(jLabelLogoHU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -70, -1, -1));

        jLabelCariDataUmat.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCariDataUmat.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelCariDataUmat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCariDataUmat.setText("> Cari Data Umat");
        jLabelCariDataUmat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCariDataUmatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCariDataUmatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCariDataUmatMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelCariDataUmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabelLihatDataUmat.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelLihatDataUmat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLihatDataUmat.setText("> Lihat Data Umat");
        jLabelLihatDataUmat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLihatDataUmatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLihatDataUmatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLihatDataUmatMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelLihatDataUmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabelTambahJadwalMisa.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelTambahJadwalMisa.setForeground(new java.awt.Color(220, 150, 0));
        jLabelTambahJadwalMisa.setText(">Tambah Jadwal Misa");
        jLabelTambahJadwalMisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTambahJadwalMisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTambahJadwalMisaMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelTambahJadwalMisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabelHapusJadwalMisa.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelHapusJadwalMisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHapusJadwalMisa.setText(">Hapus Jadwal Misa");
        jLabelHapusJadwalMisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHapusJadwalMisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHapusJadwalMisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHapusJadwalMisaMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelHapusJadwalMisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabelKosongkanJadwalMisa.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelKosongkanJadwalMisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKosongkanJadwalMisa.setText("> Kosongkan Jadwal Misa");
        jLabelKosongkanJadwalMisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelKosongkanJadwalMisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelKosongkanJadwalMisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelKosongkanJadwalMisaMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelKosongkanJadwalMisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabelHome.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText(">Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseExited(evt);
            }
        });
        jPanelFormLogin.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jButtonLogout.setText("LOGOUT");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanelFormLogin.add(jButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getContentPane().add(jPanelFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCariDataUmatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCariDataUmatMouseEntered
        // TODO add your handling code here:
        jLabelCariDataUmat.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelCariDataUmatMouseEntered

    private void jLabelCariDataUmatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCariDataUmatMouseExited
        // TODO add your handling code here:
        jLabelCariDataUmat.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelCariDataUmatMouseExited

    private void jLabelLihatDataUmatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLihatDataUmatMouseEntered
        // TODO add your handling code here:
        jLabelLihatDataUmat.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelLihatDataUmatMouseEntered

    private void jLabelLihatDataUmatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLihatDataUmatMouseExited
        // TODO add your handling code here:
        jLabelLihatDataUmat.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLihatDataUmatMouseExited

    private void jLabelTambahJadwalMisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTambahJadwalMisaMouseEntered
        // TODO add your handling code here:
//        jLabelTambahJadwalMisa.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelTambahJadwalMisaMouseEntered

    private void jLabelTambahJadwalMisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTambahJadwalMisaMouseExited
        // TODO add your handling code here:
//        jLabelTambahJadwalMisa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelTambahJadwalMisaMouseExited

    private void jLabelHapusJadwalMisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusJadwalMisaMouseEntered
        // TODO add your handling code here:
        jLabelHapusJadwalMisa.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelHapusJadwalMisaMouseEntered

    private void jLabelHapusJadwalMisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusJadwalMisaMouseExited
        // TODO add your handling code here:
        jLabelHapusJadwalMisa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelHapusJadwalMisaMouseExited

    private void jLabelKosongkanJadwalMisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKosongkanJadwalMisaMouseEntered
        // TODO add your handling code here:
        jLabelKosongkanJadwalMisa.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelKosongkanJadwalMisaMouseEntered

    private void jLabelKosongkanJadwalMisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKosongkanJadwalMisaMouseExited
        // TODO add your handling code here:
        jLabelKosongkanJadwalMisa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelKosongkanJadwalMisaMouseExited

    private void jLabelCariDataUmatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCariDataUmatMouseClicked
        // TODO add your handling code here:
        new CariData().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabelCariDataUmatMouseClicked

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
        int temp = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (temp == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new HalamanUtama().setVisible(true);
        }
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered
        // TODO add your handling code here:
        jLabelHome.setForeground(new Color(220, 150, 0));
    }//GEN-LAST:event_jLabelHomeMouseEntered

    private void jLabelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseExited
        // TODO add your handling code here:
        jLabelHome.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelHomeMouseExited

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanUtamaAdmin().setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelLihatDataUmatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLihatDataUmatMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LihatData().setVisible(true);
    }//GEN-LAST:event_jLabelLihatDataUmatMouseClicked

    private void jComboBoxHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHariActionPerformed

    private void jComboBoxTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTanggalActionPerformed

    private void jTextFieldKuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKuotaActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jLabelKosongkanJadwalMisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKosongkanJadwalMisaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new KosongkanJadwal().setVisible(true);
    }//GEN-LAST:event_jLabelKosongkanJadwalMisaMouseClicked

    private void jLabelHapusJadwalMisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusJadwalMisaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HapusJadwal().setVisible(true);
    }//GEN-LAST:event_jLabelHapusJadwalMisaMouseClicked

    private void jButtonSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSimpanMouseClicked
        // TODO add your handling code here:
        if (jTextFieldWaktu.getText().equals("") || jTextFieldKuota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap lengkapi data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int kuota = Integer.parseInt(jTextFieldKuota.getText());
                tambahJadwal();
                setAwal();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Inputan tidak valid !", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButtonSimpanMouseClicked

    private void jTextFieldKuotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldKuotaMouseClicked
        // TODO add your handling code here:
        jTextFieldKuota.setEnabled(true);
        if (jTextFieldKuota.getText().equalsIgnoreCase("Masukkan angka")) {
            jTextFieldKuota.setText("");
            jTextFieldKuota.requestFocus();
        }

    }//GEN-LAST:event_jTextFieldKuotaMouseClicked
    public void setAwal() {
        jComboBoxHari.setSelectedIndex(0);
        jComboBoxImam.setSelectedIndex(0);
        jComboBoxBulan.setSelectedIndex(0);
        jComboBoxTanggal.setSelectedIndex(0);
        jComboBoxTahun.setSelectedIndex(0);
        jTextFieldKuota.setText("Masukkan angka");
        jTextFieldKuota.setEnabled(false);
        jTextFieldWaktu.setText("");
    }

    public void tambahJadwal() {
        String hari, waktu, tanggal, Imam;
        int kuota;
        hari = jComboBoxHari.getSelectedItem().toString();
        waktu = jTextFieldWaktu.getText();
        tanggal = jComboBoxTanggal.getSelectedItem().toString() + " - " + jComboBoxBulan.getSelectedItem().toString() + " - " + jComboBoxTahun.getSelectedItem().toString();
        Imam = jComboBoxImam.getSelectedItem().toString();
        kuota = Integer.parseInt(jTextFieldKuota.getText());
        Jadwal tambahJadwal = new Jadwal(kuota, waktu, tanggal, hari);
        tambahJadwal.setImam(Imam);
        jadwal.add(tambahJadwal);
        JOptionPane.showMessageDialog(null, "Jadwal berhasil ditambahkan");
    }

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
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TambahJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox<String> jComboBoxBulan;
    private javax.swing.JComboBox<String> jComboBoxHari;
    private javax.swing.JComboBox<String> jComboBoxImam;
    private javax.swing.JComboBox<String> jComboBoxTahun;
    private javax.swing.JComboBox<String> jComboBoxTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCariDataUmat;
    private javax.swing.JLabel jLabelHapusJadwalMisa;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelKosongkanJadwalMisa;
    private javax.swing.JLabel jLabelLihatDataUmat;
    private javax.swing.JLabel jLabelLogoHU;
    private javax.swing.JLabel jLabelLogoHU1;
    private javax.swing.JLabel jLabelTambahJadwalMisa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFormLogin;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldKuota;
    private javax.swing.JTextField jTextFieldWaktu;
    // End of variables declaration//GEN-END:variables
}