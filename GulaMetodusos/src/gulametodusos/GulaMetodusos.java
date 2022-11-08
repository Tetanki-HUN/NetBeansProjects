/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gulametodusos;

import java.util.Scanner;
public class GulaMetodusos {

    /**
     * @param args the command line arguments
     * @param hossz
     * @param magassag
     */
    
    public static void main(String[] args, int hossz, int magassag) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg a gúla hosszát ");
        double a = bill.nextDouble();
        System.out.print("Add meg a gúla magasságát: ");
        double b = bill.nextDouble();
        
        a = hossz;
        b = magassag;
        
        System.out.println("A gúla térfogata" + gulaTerfogatSzamol(alap, magassag))
        
        } 
        
        
    }
    
