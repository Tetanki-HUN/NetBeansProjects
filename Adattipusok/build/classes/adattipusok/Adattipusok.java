/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //egész számok
       byte homerseklet = 10;
       short magassag = 165;
       int fizetes = 850000;
       long nyeremeny = 250000000L;
       //valós számok
       float tomeg = 44333.569874521F;
       double ezEgyValoSzam = 6689737.587967382;
       //karakter
       char egyBetu = 'k';
       char masikBetu = '\u0055'; //U karakter unicode kódja hexadecimálisan
       char haromBetu = '\u0077';
       System.out.println(masikBetu);
       System.out.println(haromBetu);
       System.out.println(masikBetu);
       //logikai
       boolean vane = false;
       
       //változók értékeinek kiíratása 
       System.out.println(homerseklet);
       System.out.println(magassag);
       System.out.println(fizetes);
       System.out.println(nyeremeny);
       System.out.println(tomeg);
       System.out.println(ezEgyValoSzam);
       System.out.println(egyBetu);
       System.out.println(vane);
       System.out.println((int)masikBetu);
       
       //adattípusok tartománya
       int byteAlja = Byte.MIN_VALUE;
       int byteTeteje = Byte.MAX_VALUE;
       System.out.println(byteAlja);
       //A byte adttípus tartománya -128 értéktől 127 értíkig terjed.
       System.out.println("A byte adattípus tarománya " + byteAlja + " értéktől " + byteTeteje + " értékig terjed");
       System.out.println("Az integer adattípus tartománya " + Integer.MIN_VALUE + " értéktől " + Integer.MAX_VALUE + " értékig terjed");
        System.out.println("A short adattípus tartománya " + Short.MIN_VALUE + " értéktől " + Short.MAX_VALUE + " értékig terjed");
        System.out.println("A long adattípus tartománya " + Long.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed");
        System.out.println("A float adattípus tartománya " + Float.MIN_VALUE + " értéktől " + Float.MAX_VALUE + " értékig terjed");
        System.out.println("A double adattípus tartománya " + Double.MIN_VALUE + " értéktől " + Double.MAX_VALUE + " értékig terjed");
        System.out.println("A character adattípus tartománya " + Character.MIN_VALUE + " értéktől " + Character.MAX_VALUE + " értékig terjed");
       
    }
    
}
