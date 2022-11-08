/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metudosok;

import java.util.Scanner;
public class Metudosok {

    public static double atlag(int szam1, int szam2) {

        double atl = (szam1 + szam2) / 2.0;

        return atl;
    }

    public static int veletlen(int also, int felso) {
        Random rand = new Random();
        int randomSzam = rand.nextInt(felso - also + 1);
        return randomSzam;
    }
    
    public static void main( String[] args, int alsoHatar, int felsoHatar ) {
        Scanner bill = new Scanner(System.in);
        
        System.out.println(atlag(4,5));
        
        System.out.print("Adj meg egy egész számot: ");
        int a = bill.nextInt();
        System.out.print("Adj meg egy egész számot: ");
        int b = bill.nextInt();
        
        if (a < b) {
            alsoHatar = a;
            felsoHatar = b;
        } else {
            felsoHatar = a;
            alsoHatar = b;
        }
    }

    private static class Random {

        private int nextInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
  
}
