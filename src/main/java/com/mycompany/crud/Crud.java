package com.mycompany.crud;


public class Crud {

    public static void main(String[] args) {
        Loading l= new Loading();
        l.setVisible(true);
        
        Login lo= new Login();
        try{
            for (int i=0; i<=100; i++) {
                Thread.sleep(i);
                l.setTxtPercent(Integer.toString(i)+"%");
                l.getTxtPercent();
                
                if (i==100) {
                    l.setVisible(false);
                    lo.setVisible(true);
                }
                
            }
        } catch (Exception e){
            
        }
    }
   
}
