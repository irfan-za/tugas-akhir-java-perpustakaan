package com.mycompany.crud.component;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DaftarBuku extends javax.swing.JFrame {
    public DaftarBuku() {
        initComponents();
        sortBook();
    }
//      shorter table
    private void sortBook(){        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<> (table.getModel());
        table.setRowSorter(sorter);
    }
    
      //        filter book
    private void findBook(String query) {
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tblModel);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtInput = new javax.swing.JTextField();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(557, 407));

        btnTambah.setBackground(new java.awt.Color(34, 230, 0));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 204, 0));
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(253, 91, 41));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2020", "Irfan", "Gramedia", "Belajar Java"},
                {"2021", "Budi", "Kompas", "Panduan Java untuk Pemula"},
                {"2019", "Gunawan", "Noura", "Menggambar Pemandangan"}
            },
            new String [] {
                "Tahun", "Penulis", "Penerbit", "Judul"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputKeyReleased(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setText("Perpustakaan 123");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput)
                    .addComponent(btnTambah)
                    .addComponent(btnUpdate)
                    .addComponent(btnHapus))
                .addGap(313, 313, 313))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        String query= txtInput.getText();
        findBook(query);
    }//GEN-LAST:event_txtInputKeyReleased

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // pindah ke halaman tambah
        Tambah t= new Tambah();
        t.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //        update data buku
//        DefaultTableModel tblModel= (DefaultTableModel)table.getModel();
        if(table.getSelectedRowCount()==1){
            // pindah ke halaman edit
            Update u= new Update();
            u.setVisible(true);
        }
        else{
            if(table.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this,"Pilih satu buku!");
            }else{
//                    jika data buku yang dipilih banyak maka muncul alert
                JOptionPane.showMessageDialog(this, "Pilih satu buku yang ingin diupdate");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tblModel= (DefaultTableModel)table.getModel();
        //mengambil data buku per baris
        String tblTahun = tblModel.getValueAt(table.getSelectedRow(), 0).toString();
        String tblPenulis = tblModel.getValueAt(table.getSelectedRow(), 1).toString();
        String tblPenerbit = tblModel.getValueAt(table.getSelectedRow(), 2).toString();
        String tblJudul = tblModel.getValueAt(table.getSelectedRow(), 3).toString();
//        set data buku ke field input
        Update.tahun.setText(tblTahun);
        Update.penulis.setText(tblPenulis);
        Update.penerbit.setText(tblPenerbit);
        Update.judul.setText(tblJudul);
    }//GEN-LAST:event_tableMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
    //   hapus data per baris        
            if(table.getSelectedRowCount()==1){
                tblModel.removeRow(table.getSelectedRow());
            }
            else {
//                JOptionPane.showMessageDialog(this, "Pilih satu buku yang ingin dihapus");
                if(table.getSelectedRowCount()==0){
//                    jika baris yang dipilih kosong, maka muncul alert
                    JOptionPane.showMessageDialog(this, "Pilih salah satu buku.");
                }
                else {
//                    jika data buku yang dipilih banyak maka muncul alert
                    JOptionPane.showMessageDialog(this, "Pilih satu buku yang ingin dihapus");
                }
            }
    }//GEN-LAST:event_btnHapusActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}

