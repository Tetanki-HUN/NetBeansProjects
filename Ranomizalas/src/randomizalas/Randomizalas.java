/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizalas;

/**
 *
 * @author user3
 */
public class Randomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Random szám generálás:
      //(Math.random() * intervallum_értéke ) + alsó;
       int randomSzam = (int)(Math.random() * 21) + 10; // közötti szám
       System.out.println(randomSzam);
       randomSzam = (int)(Math.random() * -71)-55;
       System.out.println(randomSzam);
       randomSzam = (int)(Math.random() * -46)-40;
       System.out.println(randomSzam);
       randomSzam = (int)(Math.random() * 46)+60;
       System.out.println(randomSzam);
       
    }
    
}
