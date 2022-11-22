/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyakorlas11.pkg22;

import java.util.Scanner;

public class Metodusgyakorlas1122 {
    
    public static void legkisebb(String str) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int szam1 = myObj.nextInt();
        System.out.println("Adj meg még egy számot: ");
        int szam2 = myObj.nextInt();
        System.out.println("Adj meg egy harmadik számot: ");
        int szam3 = myObj.nextInt();
        System.out.println("A lgkisebb szám: " + Math.min(szam1, szam2));
    }

    public static void kozepen(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kérek egy stringet ");
        String str = in.nextLine();
        System.out.print("A középső karakter:  " + kozepenszamolo(str));
    }

    public static String kozepenszamolo(String str) {
        int hely;
        int hossz;
        if (str.length() % 2 == 0) {
            hely = str.length() / 2 - 1;
            hossz = 2;
        } else {
            hely = str.length() / 2;
            hossz = 1;
        }
        return str.substring(hely, hely + hossz);
    }
    
    
}
