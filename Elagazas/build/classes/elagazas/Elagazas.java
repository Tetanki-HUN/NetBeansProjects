/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author user3
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Egyágú elágazás
        int szam = 25;
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        
        //Kétágú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: "+ szam*2);
                    
    }
        else if (szam < 20){
           System.out.println("Kisebb"); 
        }
        else {
            System.out.println("Egyenlő");
        }
        
        //Sok ágú
        int honap = 10;
        switch(honap) {
            case 1 : System.out.println("Január");
            case 10 : System.out.println("Október"); break;
            case 11 : System.out.println("November"); 
            
            default : System.out.println("Nem meghatározható."); 
        }
        
        //Feladat:
        //Random karakter generálás! Kisbetűs, angol abc
        int RandomCharCode = (int)(Math.random() * 26)+97;
        System.out.println(RandomCharCode);
        System.out.println((char)RandomCharCode);
    }
    
}
