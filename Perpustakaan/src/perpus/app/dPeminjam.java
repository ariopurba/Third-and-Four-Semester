package perpus.app;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class dPeminjam extends javax.swing.JDialog {
    DaoPerpus dtPeminjam;
    DefaultTableModel tabelModel;
    TableColumnModel columnModel;


    public dPeminjam(java.awt.Frame parent, boolean modal,DaoPerpus dtPeminjam) {
        super(parent, modal);
        initComponents();
        this.dtPeminjam = dtPeminjam;
        rbDosen.setSelected(true);
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
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        lblNo = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfJum = new javax.swing.JTextField();
        rbDosen = new javax.swing.JRadioButton();
        rbMhs = new javax.swing.JRadioButton();
        rbUmum = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Peminjam");

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
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Data Peminjam"));

        jLabel1.setText("Id Peminjam");

        tfId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdFocusLost(evt);
            }
        });

        lblNo.setText("Nomor");

        tfNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNoFocusLost(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        tfNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNamaFocusLost(evt);
            }
        });

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

        jLabel5.setText("Jumlah Pinjam");

        tfJum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJumFocusLost(evt);
            }
        });

        rbGroup.add(rbDosen);
        rbDosen.setText("Dosen");
        rbDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDosenActionPerformed(evt);
            }
        });

        rbGroup.add(rbMhs);
        rbMhs.setText("Mahasiswa");
        rbMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMhsActionPerformed(evt);
            }
        });

        rbGroup.add(rbUmum);
        rbUmum.setText("Umum");
        rbUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUmumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblNo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(tfNo)
                            .addComponent(tfNama)
                            .addComponent(tfAlamat)
                            .addComponent(tfJum)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(rbDosen)
                        .addGap(75, 75, 75)
                        .addComponent(rbMhs)
                        .addGap(72, 72, 72)
                        .addComponent(rbUmum)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDosen)
                    .addComponent(rbMhs)
                    .addComponent(rbUmum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        tfId.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        tfNo.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        tfNama.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        tfAlamat.setText(tabelModel.getValueAt(selectedRow, 3).toString());
        tfJum.setText(tabelModel.getValueAt(selectedRow, 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        tfId.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        tfNo.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        tfNama.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        tfAlamat.setText(tabelModel.getValueAt(selectedRow, 3).toString());
        tfJum.setText(tabelModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_jTable1KeyPressed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        String vId=tfId.getText();
        String vNo=tfNo.getText();
        String vNama=tfNama.getText();
        String vAlamat=tfAlamat.getText();
        String vJum=tfJum.getText();
        Peminjam dataPeminjam = null;
        if(rbDosen.isSelected())
        {
            dataPeminjam = new Dosen(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        if(rbMhs.isSelected())
        {
            dataPeminjam = new Mahasiswa(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        if(rbUmum.isSelected())
        {
            dataPeminjam = new Umum(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        dtPeminjam.isiDataPeminjam(dataPeminjam);
        tampilData();
        clrInput();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        int a = jTable1.getSelectedRow();
        if (a == -1) {} else {dtPeminjam.peminjamList.remove(a);}
        clrInput();
        tampilData();
    }//GEN-LAST:event_btHapusActionPerformed

    private void rbDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDosenActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIP");
        tampilData();
    }//GEN-LAST:event_rbDosenActionPerformed

    private void rbMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMhsActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIM");
        tampilData();
    }//GEN-LAST:event_rbMhsActionPerformed

    private void rbUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUmumActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIK");
        tampilData();
    }//GEN-LAST:event_rbUmumActionPerformed

    private void tfIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdFocusLost
        // TODO add your handling code here:
        if (tfId.getText().isBlank()){return;}
        String cek = tfId.getText();
        if( !cek.matches("^[M|D|U][\\d+].*")) {
            try {
            throw new Exception("ID harus diawali dengan huruf \n M {untuk Mahasiswa) atau D (untuk Dosen) atau U (untuk Umum) \n dan kemudian diikuti dengan angka \n \n Contoh : M1234 atau D1234 atau U1234");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tfIdFocusLost

    private void tfNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaFocusLost
        // TODO add your handling code here:
        if (tfNama.getText().isBlank()){return;}
        String cek = tfNama.getText();
        if( cek.matches(".*\\d.*package perpus.app;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class dPeminjam extends javax.swing.JDialog {
    DaoPerpus dtPeminjam;
    DefaultTableModel tabelModel;
    TableColumnModel columnModel;


    public dPeminjam(java.awt.Frame parent, boolean modal,DaoPerpus dtPeminjam) {
        super(parent, modal);
        initComponents();
        this.dtPeminjam = dtPeminjam;
        rbDosen.setSelected(true);
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
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        lblNo = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfJum = new javax.swing.JTextField();
        rbDosen = new javax.swing.JRadioButton();
        rbMhs = new javax.swing.JRadioButton();
        rbUmum = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data Peminjam");

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
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Data Peminjam"));

        jLabel1.setText("Id Peminjam");

        tfId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdFocusLost(evt);
            }
        });

        lblNo.setText("Nomor");

        tfNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNoFocusLost(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        tfNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNamaFocusLost(evt);
            }
        });

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

        jLabel5.setText("Jumlah Pinjam");

        tfJum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJumFocusLost(evt);
            }
        });

        rbGroup.add(rbDosen);
        rbDosen.setText("Dosen");
        rbDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDosenActionPerformed(evt);
            }
        });

        rbGroup.add(rbMhs);
        rbMhs.setText("Mahasiswa");
        rbMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMhsActionPerformed(evt);
            }
        });

        rbGroup.add(rbUmum);
        rbUmum.setText("Umum");
        rbUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUmumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblNo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(tfNo)
                            .addComponent(tfNama)
                            .addComponent(tfAlamat)
                            .addComponent(tfJum)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(rbDosen)
                        .addGap(75, 75, 75)
                        .addComponent(rbMhs)
                        .addGap(72, 72, 72)
                        .addComponent(rbUmum)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDosen)
                    .addComponent(rbMhs)
                    .addComponent(rbUmum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        tfId.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        tfNo.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        tfNama.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        tfAlamat.setText(tabelModel.getValueAt(selectedRow, 3).toString());
        tfJum.setText(tabelModel.getValueAt(selectedRow, 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        tfId.setText(tabelModel.getValueAt(selectedRow, 0).toString());
        tfNo.setText(tabelModel.getValueAt(selectedRow, 1).toString());
        tfNama.setText(tabelModel.getValueAt(selectedRow, 2).toString());
        tfAlamat.setText(tabelModel.getValueAt(selectedRow, 3).toString());
        tfJum.setText(tabelModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_jTable1KeyPressed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        String vId=tfId.getText();
        String vNo=tfNo.getText();
        String vNama=tfNama.getText();
        String vAlamat=tfAlamat.getText();
        String vJum=tfJum.getText();
        Peminjam dataPeminjam = null;
        if(rbDosen.isSelected())
        {
            dataPeminjam = new Dosen(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        if(rbMhs.isSelected())
        {
            dataPeminjam = new Mahasiswa(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        if(rbUmum.isSelected())
        {
            dataPeminjam = new Umum(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
        }
        dtPeminjam.isiDataPeminjam(dataPeminjam);
        tampilData();
        clrInput();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        int a = jTable1.getSelectedRow();
        if (a == -1) {} else {dtPeminjam.peminjamList.remove(a);}
        clrInput();
        tampilData();
    }//GEN-LAST:event_btHapusActionPerformed

    private void rbDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDosenActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIP");
        tampilData();
    }//GEN-LAST:event_rbDosenActionPerformed

    private void rbMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMhsActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIM");
        tampilData();
    }//GEN-LAST:event_rbMhsActionPerformed

    private void rbUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUmumActionPerformed
        // TODO add your handling code here:
        lblNo.setText("NIK");
        tampilData();
    }//GEN-LAST:event_rbUmumActionPerformed

    private void tfIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdFocusLost
        // TODO add your handling code here:
        if (tfId.getText().isBlank()){return;}
        String cek = tfId.getText();
        if( !cek.matches("^[M|D|U][\\d+].*")) {
            try {
            throw new Exception("ID harus diawali dengan huruf \n M {untuk Mahasiswa) atau D (untuk Dosen) atau U (untuk Umum) \n dan kemudian diikuti dengan angka \n \n Contoh : M1234 atau D1234 atau U1234");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tfIdFocusLost

    private void tfNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaFocusLost
        // TODO add your handling code here:
        if (tfNama.getText().isBlank()){return;}
        String cek = tfNama.getText();
        if( cek.matches(".*\\d.*")) {
            try {
                throw new Exception("Nama harus berupa alfabet \n \n Contoh: Heru Suheru bukan Heru ke5");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tfNamaFocusLost

    private void tfNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNoFocusLost
        // TODO add your handling code here:
        if (tfNo.getText().isBlank()){return;}
        String cek = tfNo.getText();
        if( !cek.matches("[0-9]+")) {
            try {
                throw new Exception("JNomor ID harus berupa anggka \n\n Contoh : 3404040433342");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tfNoFocusLost

    private void tfJumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJumFocusLost
        // TODO add your handling code here:
        if (tfJum.getText().isBlank()){return;}
        String cek = tfJum.getText();
        if( !cek.matches("[0-9]+")) {
            try {
                throw new Exception("Jumlah Pinjam harus berupa angka");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        if ( Integer.parseInt(cek) > 6) {
                JOptionPane.showMessageDialog(this, "Angka harus antara 1 - 6","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_tfJumFocusLost
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
            java.util.logging.Logger.getLogger(dPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void tampilData(){
        String[] kolom = {"Id Peminjam","Identitas","Nama","Alamat","Maksimal Pinjam"};
        String[] arrData=null;
        String noID = "0";
        String nomor="";
        Object[][] objData = new Object[dtPeminjam.peminjamList.size()][5]; // 4 merupakan jumlah kolom
        int i = 0;
        for(Peminjam n : dtPeminjam.peminjamList){
            if (n instanceof Dosen){
                noID = ((Dosen)n).getNip();
            }
            if (n instanceof Mahasiswa){
                noID = ((Mahasiswa)n).getNim();
            }
            if (n instanceof Umum){
                noID = ((Umum)n).getNik();
            }
            arrData = new String[]{n.getId_peminjam(), noID, n.getNama(), n.getAlamat(), String.valueOf(n.getMak_pinjam())};
            objData[i] = arrData;
            i++;
        }
        tabelModel = new DefaultTableModel(objData,kolom){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTable1.setModel(tabelModel);
        columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(300);
        columnModel.getColumn(4).setPreferredWidth(30);
    }

   
    private void clrInput(){
        tfId.setText("");
        tfNo.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        tfJum.setText("");
        tfId.requestFocus();
        rbDosen.setSelected(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNo;
    private javax.swing.JRadioButton rbDosen;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JRadioButton rbMhs;
    private javax.swing.JRadioButton rbUmum;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfJum;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}
