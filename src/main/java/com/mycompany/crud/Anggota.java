package com.mycompany.crud;

public class Anggota extends javax.swing.JFrame {
    static String[] nama = {
            "Aldhyno Yogatama      | L200210014",
            "Muhammad Irfan Zahran | L200210016", 
            "Muhammad Dzaki Hanifa | L200210032", 
            "Rifan Ardyansyah      | L200210045"};
    
//    static String[] nama(){
//        nama = {
//            "Muhammad Irfan Zahran | L200210016",
//            "Muhammad Irfan Zahran | L200210016", 
//            "Muhammad Irfan Zahran | L200210016", 
//            "Muhammad Irfan Zahran | L200210016"};
//        return nama;
//    }

    public Anggota() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
