/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciklusok;
import java.util.Scanner;

public class Ciklusok {
 

    public static void main(String[] args) {
        //Növekményes cikludok (FOR)
       int i; 
       for (i = 0; i < 5; i++) {
    }
       
       //visszafelé 
       for (i=4; i > -1; i--) {
        System.out.println(i);
    }
       
       //Kettesével
       for (i = 0; i < 5; i+=2) {
        System.out.println(i);
       }
       
       //Elöltesztelő ciklus
       int szam = 0;
       while (szam < 5) {
           System.out.println(szam);
           szam++;
       }
       
       //Feladat: Kérjünk be a felhasználótól egy 0-nál nagyobb páros számot
     
       Scanner bill = new Scanner(System.in);
       int szamparos = 0;
       System.out.print("Add meg egy 0-nál nagyobb páros számot: ");
       parosszam = bill.nextInt();
       while (!(szamparos > 0 && szamparos & 2 ==0)) {
           System.out.print("Add meg egy 0-nál nagyobb páros számot: ");
           szamparos = bill.nextInt();
       }
       
       //Hátultesztelő
       
       do {
           System.out.print("Add meg egy 0-nál nagyobb páros számot: ");
           parosszam = bill.nextInt();
        } while (!(szamparos > 0 && szamparos & 2 ==0));
      
     
   
}

}