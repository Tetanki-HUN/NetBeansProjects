/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;

import java.util.Scanner;
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Két számot kérek");
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int Szam1 = x;
        int Szam2 = y;
        while (Szam1 != Szam2) {
            if (Szam1 > Szam2) {
                Szam1 = Szam1 - Szam2;
            }
            else Szam2 = Szam2 - Szam1;
        }
        int LNKO = Szam1;
        System.out.println(LNKO);
        
        System.out.println("LKKT: " + y*x/LNKO);
        
        
        
    }
    
}
