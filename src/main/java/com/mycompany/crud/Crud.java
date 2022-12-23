package com.mycompany.crud;


public class Crud {

    public static void main(String[] args) {
        Anggota a=new Anggota(
                        "Aldhyno Yoghatama     | L200210014",
                        "Muhammad Irfan Zahran | L200210016", 
                        "Muhammad Dzaki Hanifa | L200210032", 
                        "Rifan Ardyansyah      | L200210045");
        
        Loading l= new Loading();
        l.setVisible(true);
        
        Login login= new Login();
        try{
            for (int i=0; i<=100; i++) {
                Thread.sleep(i);
                l.setTxtPercent(Integer.toString(i)+"%");
                l.getTxtPercent();
                
                if (i==100) {
                    l.setVisible(false);
                    login.setVisible(true);
                }
                
            }
        } catch (Exception e){
            
        }
    }
   
}
