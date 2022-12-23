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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtInput = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(title)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput)
                    .addComponent(btnTambah)
                    .addComponent(btnUpdate)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}

