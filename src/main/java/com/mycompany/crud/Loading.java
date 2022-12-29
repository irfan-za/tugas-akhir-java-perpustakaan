package com.mycompany.crud;


public class Loading extends Anggota{
    private String txtPercent="0%";
    
    public Loading() {
        initComponents();
//        menampilkan daftar anggota kelompok
        daftarAnggota();
        infoAnggota();
    }
//    getter & setter [encapsulation]
    void getTxtPercent(){
        loadingPercent.setText("Loading "+txtPercent);
    }
    void setTxtPercent(String txt){
        this.txtPercent=txt;
    }
    
//    inheritance
    void daftarAnggota(){
        int i=1;
        for (String n : Anggota.nama) {
            switch (i) {
                case 1 -> anggota1.setText(n);
                case 2 -> anggota2.setText(n);
                case 3 -> anggota3.setText(n);
                case 4 -> anggota4.setText(n);
                default -> {
                }
            }
            i++;
        }
    }
    
    @Override
    void infoAnggota(){
        System.out.println("Menampilkan info anggota.");
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        anggota1 = new javax.swing.JLabel();
        anggota2 = new javax.swing.JLabel();
        anggota3 = new javax.swing.JLabel();
        anggota4 = new javax.swing.JLabel();
        loadingPercent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(401, 501));
        setSize(new java.awt.Dimension(382, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Perpustakaan Ngemplak");

        loadingPercent.setFont(new java.awt.Font("Segoe UI", 1, 12));
        loadingPercent.setText("Loading 0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loadingPercent)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(anggota2)
                            .addComponent(anggota3)
                            .addComponent(anggota4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(anggota1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(loadingPercent)
                .addGap(78, 78, 78)
                .addComponent(anggota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anggota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anggota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anggota4)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anggota1;
    private javax.swing.JLabel anggota2;
    private javax.swing.JLabel anggota3;
    private javax.swing.JLabel anggota4;
    private javax.swing.JLabel jLabel1;
    javax.swing.JLabel loadingPercent;
    // End of variables declaration//GEN-END:variables


}
