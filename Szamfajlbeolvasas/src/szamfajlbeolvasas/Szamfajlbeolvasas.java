/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamfajlbeolvasas;

/**
 *
 * @author user3
 */
import java.util.*;
import java.io.*;
public class Szamfajlbeolvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Integer> szam = new Vector<Integer>();
        
        try {
            FileReader be = new FileReader ("szmszam.txt");
            System.out.println("Kész");
            
            int c;
            
            while ((c = be.read()) != -1) {
                System.out.print((char)c+"\n");
                szam.add(c);
            }
        } catch(IOException e) {System.out.print("Hiba");
        } for (int i = 0; i<szam.size(); i++){
            System.out.println(szam.get(i));
        }

    }
    
}
