package app;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class dKoleksi extends javax.swing.JDialog {
    DaoPerpus dtKoleksi;
    DefaultTableModel tabelModel;
    TableColumnModel columnModel;


    public dKoleksi(java.awt.Frame parent, boolean modal, DaoPerpus dtKoleksi) {
        super(parent, modal);
        initComponents();
        this.dtKoleksi = dtKoleksi;

        rbMajalah.setSelected(true);
        tampilData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbIdK = new javax.swing.JLabel();
        tfIdK = new javax.swing.JTextField();
        lblNo = new javax.swing.JLabel();
        tfJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPenerbit = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        rbDisk = new javax.swing.JRadioButton();
        rbMajalah = new javax.swing.JRadioButton();
        rbBuku = new javax.swing.JRadioButton();
        lGen1 = new javax.swing.JLabel();
        tfGen1 = new javax.swing.JTextField();
        lGen2 = new javax.swing.JLabel();
        tfGen2 = new javax.swing.JTextField();
        lGen3 = new javax.swing.JLabel();
        tfGen3 = new javax.swing.JTextField();
        ChDipinjam = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelolaan Data Koleksi");
        setAlwaysOnTop(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Peminjam"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title1", "Title2", "Title3", "Title4", "Title 5"
            }
        ));
        jTable1.setRowHeight(21);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Data Koleksi"));

        lbIdK.setText("Id Koleksi");

        tfIdK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdKFocusLost(evt);
            }
        });

        lblNo.setText("Judul");

        jLabel3.setText("Penerbit");

        jLabel4.setText("Status Pinjam");

        btTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btTambah.setText("TAMBAH");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btHapus.setText("HAPUS");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        rbGroup.add(rbDisk);
        rbDisk.setText("Disk");
        rbDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDiskActionPerformed(evt);
            }
        });

        rbGroup.add(rbMajalah);
        rbMajalah.setText("Majalah");
        rbMajalah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMajalahActionPerformed(evt);
            }
        });

        rbGroup.add(rbBuku);
        rbBuku.setText("Buku");
        rbBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBukuActionPerformed(evt);
            }
        });

        lGen1.setText("Volume");

        tfGen1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfGen1FocusLost(evt);
            }
        });

        lGen2.setText("Seri");

        tfGen2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfGen2FocusLost(evt);
            }
        });

        lGen3.setText("ISSN");

        ChDipinjam.setText("Dipinjam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(rbMajalah)
                        .addGap(124, 124, 124)
                        .addComponent(rbDisk)
                        .addGap(124, 124, 124)
                        .addComponent(rbBuku)
                        .addGap(0, 410, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(lblNo)
                                .addComponent(lbIdK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lGen1)
                            .addComponent(lGen2)
                            .addComponent(lGen3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ChDipinjam)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                                    .addComponent(tfGen1)
                                    .addComponent(tfGen2)
                                    .addComponent(tfGen3)
                                    .addComponent(tfJudul)
                                    .addComponent(tfIdK))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbMajalah)
                        .addComponent(rbDisk)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbIdK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNo)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tfIdK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ChDipinjam))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lGen1)
                            .addComponent(tfGen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lGen2)
                            .addComponent(tfGen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lGen3)))
                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        Koleksi ckol = cariKoleksi(tabelModel.getValueAt(selectedRow, 0).toString());
        char tipe = ckol.getIdKoleksi().charAt(0);
        tfIdK.setText(ckol.getIdKoleksi());
        tfJudul.setText(ckol.getJudul());
        tfPenerbit.setText(ckol.getPenerbit());
        ChDipinjam.setSelected(ckol.isStatus_pinjam());
        switch (tipe) {
            case 'D':
                rbDisk.setSelected(Boolean.TRUE);
                lGen1.setText("Format");
                lGen2.setText("ISBN");
                lGen3.setVisible(false);
                tfGen3.setVisible(false);
                tfGen1.setText(((Disk) ckol).getFormat());
                tfGen2.setText(((Disk) ckol).getIsbn());
                break;
            case 'M':
                rbMajalah.setSelected(Boolean.TRUE);
                lGen1.setText("Volume");
                lGen2.setText("Seri");
                lGen3.setVisible(true);
                tfGen3.setVisible(true);
                tfGen1.setText(Integer.toString(((Majalah) ckol).getVolume()));
                tfGen2.setText(Integer.toString(((Majalah) ckol).getSeri()));
                tfGen3.setText(((Majalah) ckol).getIssn());
                break;
            case 'B':
                rbBuku.setSelected(Boolean.TRUE);
                lGen1.setText("Halaman");
                lGen2.setText("ISBN");
                lGen3.setVisible(false);
                tfGen3.setVisible(false);
                tfGen1.setText(Integer.toString(((Buku) ckol).getHalaman()));
                tfGen2.setText(((Buku) ckol).getIsbn());
                break;
            default:
                JOptionPane.showMessageDialog(this, "ID Koleksi tidak terdefinisi!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        Koleksi ckol = cariKoleksi(tabelModel.getValueAt(selectedRow, 0).toString());
        char tipe = ckol.getIdKoleksi().charAt(0);
        tfIdK.setText(ckol.getIdKoleksi());
        tfJudul.setText(ckol.getJudul());
        tfPenerbit.setText(ckol.getPenerbit());
        ChDipinjam.setSelected(ckol.isStatus_pinjam());
        switch (tipe) {
            case 'D':
                rbDisk.setSelected(Boolean.TRUE);
                lGen1.setText("Format");
                lGen2.setText("ISBN");
                lGen3.setVisible(false);
                tfGen3.setVisible(false);
                tfGen1.setText(((Disk) ckol).getFormat());
                tfGen2.setText(((Disk) ckol).getIsbn());
                break;
            case 'M':
                rbMajalah.setSelected(Boolean.TRUE);
                lGen1.setText("Volume");
                lGen2.setText("Seri");
                lGen3.setVisible(true);
                tfGen3.setVisible(true);
                tfGen1.setText(Integer.toString(((Majalah) ckol).getVolume()));
                tfGen2.setText(Integer.toString(((Majalah) ckol).getSeri()));
                tfGen3.setText(((Majalah) ckol).getIssn());
                break;
            case 'B':
                rbBuku.setSelected(Boolean.TRUE);
                lGen1.setText("Halaman");
                lGen2.setText("ISBN");
                lGen3.setVisible(false);
                tfGen3.setVisible(false);
                tfGen1.setText(Integer.toString(((Buku) ckol).getHalaman()));
                tfGen2.setText(((Buku) ckol).getIsbn());
                break;
            default:
                JOptionPane.showMessageDialog(this, "ID Koleksi tidak terdefinisi!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        String vIdK=tfIdK.getText();
        String vJudul=tfJudul.getText();
        String vPenerbit=tfPenerbit.getText();
        Boolean vStatus = ChDipinjam.isSelected();
        String vFormat = "";
        String vIsbn = "";
        int vVolume = 0;
        int vSeri = 0;
        int vHalaman = 0;
        Koleksi dataKoleksi = null;
        if(rbDisk.isSelected())
        {
            vFormat = tfGen1.getText();
            vIsbn = tfGen2.getText(); 
            dataKoleksi = new Disk(vIdK, vJudul, vPenerbit, vStatus, vFormat, vIsbn);
        }
        if(rbMajalah.isSelected())
        {
            vVolume = Integer.parseInt(tfGen1.getText());
            vSeri = Integer.parseInt(tfGen2.getText());            
            vIsbn = tfGen3.getText();
            dataKoleksi = new Majalah(vIdK, vJudul, vPenerbit, vStatus, vVolume, vSeri, vIsbn);
        }
        if(rbBuku.isSelected())
        {
            vHalaman = Integer.parseInt(tfGen1.getText());
            vIsbn = tfGen2.getText();  
            dataKoleksi = new Buku(vIdK, vJudul, vPenerbit, vStatus, vHalaman, vIsbn);
        }
        dtKoleksi.isiDataKoleksi(dataKoleksi);
        tampilData();
        clrInput();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        int a = jTable1.getSelectedRow();
        if (a == -1) {} else {dtKoleksi.koleksiList.remove(a);}
        clrInput();
        tampilData();
    }//GEN-LAST:event_btHapusActionPerformed

    private void rbDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDiskActionPerformed
        // TODO add your handling code here:
        lGen1.setText("Format");
        lGen2.setText("ISBN");
        lGen3.setVisible(false);
        tfGen3.setVisible(false);
        tampilData();
    }//GEN-LAST:event_rbDiskActionPerformed

    private void rbMajalahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMajalahActionPerformed
        // TODO add your handling code here:
        lGen1.setText("Volume");
        lGen2.setText("Seri");
        lGen3.setVisible(true);
        tfGen3.setVisible(true);
        tampilData();
    }//GEN-LAST:event_rbMajalahActionPerformed

    private void rbBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBukuActionPerformed
        // TODO add your handling code here:
        lGen1.setText("Halaman");
        lGen2.setText("ISBN");
        lGen3.setVisible(false);
        tfGen3.setVisible(false);
        tampilData();
    }//GEN-LAST:event_rbBukuActionPerformed

    private void tfIdKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdKFocusLost
        // TODO add your handling code here:
        if (tfIdK.getText().isBlank()){return;}
        String cek = tfIdK.getText();
        if( !cek.matches("^[M|D|B][\\d+].*")) {
            try {
            throw new Exception("ID harus diawali dengan huruf \n M {untuk Majalah) atau D (untuk Disk) atau B (untuk Buku) \n dan kemudian diikuti dengan angka \n \n Contoh : M1234 atau D1234 atau B1234");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tfIdKFocusLost

    private void tfGen1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGen1FocusLost
        // TODO add your handling code here:
        if (tfGen1.getText().isBlank()){return;}
        String cek = tfGen1.getText();
        if(rbMajalah.isSelected())
        {
            if( !cek.matches("[0-9]+")) {
                try {
                    throw new Exception("Volume harus berupa angka");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        if(rbBuku.isSelected())
        {
            if( !cek.matches("[0-9]+")) {
                try {
                    throw new Exception("Jumlah Halaman harus berupa angka");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
    }//GEN-LAST:event_tfGen1FocusLost

    private void tfGen2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfGen2FocusLost
        // TODO add your handling code here:
        if (tfGen2.getText().isBlank()){return;}
        String cek = tfGen2.getText();
        if(rbMajalah.isSelected())
        {
            if( !cek.matches("[0-9]+")) {
                try {
                    throw new Exception("Seri harus berupa angka");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
    }//GEN-LAST:event_tfGen2FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dKoleksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public void tampilData(){
        String IsbnIssn = "";
        String[] kolom = {"Id Koleksi","Judul","Penerbit","Status","ISBN/ISSN"};
        Object[][] objData = new Object[dtKoleksi.koleksiList.size()][5]; // 6 merupakan jumlah kolom
        int i = 0;
        for(Koleksi n : dtKoleksi.koleksiList){
            if (n instanceof Disk){
                IsbnIssn = ((Disk) n).getIsbn();
            }
            if (n instanceof Majalah){
                IsbnIssn = ((Majalah) n).getIssn();
            }
            if (n instanceof Buku){
                IsbnIssn = ((Buku) n).getIsbn();
            }
            objData[i] = new String[]{n.getIdKoleksi(), n.getJudul(), n.getPenerbit(), n.isStatus_pinjam() ? "Dipinjam" : "Tersedia", IsbnIssn};
            i++;
        }
        tabelModel = new DefaultTableModel(objData,kolom){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable1.repaint();
        jTable1.setModel(tabelModel);
        columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(10);
        columnModel.getColumn(4).setPreferredWidth(20);
    }

    private Koleksi cariKoleksi(String idKoleksi) {
        Iterator<Koleksi> iterator = dtKoleksi.koleksiList.iterator();
        while (iterator.hasNext()) {
            Koleksi koleksi = iterator.next();
            if (koleksi.getIdKoleksi().equals(idKoleksi)) {
                return koleksi;
            }
        }
        return null;
    }    


    private void clrInput(){
        tfIdK.setText("");
        tfJudul.setText("");
        tfPenerbit.setText("");
        tfIdK.requestFocus();
        ChDipinjam.setSelected(Boolean.FALSE);
        tfGen1.setText("");
        tfGen2.setText("");
        tfGen3.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChDipinjam;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lGen1;
    private javax.swing.JLabel lGen2;
    private javax.swing.JLabel lGen3;
    private javax.swing.JLabel lbIdK;
    private javax.swing.JLabel lblNo;
    private javax.swing.JRadioButton rbBuku;
    private javax.swing.JRadioButton rbDisk;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JRadioButton rbMajalah;
    private javax.swing.JTextField tfGen1;
    private javax.swing.JTextField tfGen2;
    private javax.swing.JTextField tfGen3;
    private javax.swing.JTextField tfIdK;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfPenerbit;
    // End of variables declaration//GEN-END:variables
}
