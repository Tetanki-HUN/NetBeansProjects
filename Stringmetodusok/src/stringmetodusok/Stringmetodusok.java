/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

/**
 *
 * @author user3
 */
public class Stringmetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg";
        
        //Szöveg hossza
        System.out.println(szoveg.length());
        
        //Adott pozíción levő karakter
        System.out.println(szoveg.charAt(5));
        
        //Minden kisbetűs
        System.out.println(szoveg.toLowerCase());
        
        //Minden nagybetűs
        System.out.println(szoveg.toUpperCase());
        
        //Sor eleji és végi szóköz levágása
        System.out.println(szoveg.trim().length());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.compareToIgnoreCase("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.equals("Ez egy ... "));
        System.out.println(szoveg.equalsIgnoreCase("Ez egy tetszőleges szöveg. "));
         
        //összefűzés
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzött."));
        
        //tartalmazza-e
        System.out.println(szoveg.compareTo("tetszőleges"));
        
        //keresett karakter(ek) első pozíciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //keresett karakter(ek) utolsó pozíciója
        System.out.println(szoveg.lastIndexOf("t"));
        
        //string üres-e (boolean)
         System.out.println(szoveg.isEmpty());
         String szoveg2 = "";
          System.out.println(szoveg.isEmpty());
          
        //lecseréli a szövegben a megadott karakterek(ek)et más karakter(ek) re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        //lecseréli a szövegben az első megadott karakterek(ek)et más karakter(ek) re
        System.out.println(szoveg.replaceFirst("e", "b"));
        
        //string szétszedése tömbbe megadott karakterek mentén
        System.out.println(szoveg.split(""));
        
    }
    
}
