/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas2;

/**
 *
 * @author user3
 */
import java.io.*;
public class Fajlbeolvasas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[] szamok = new int[6];
        
        try {
            raf = new RandomAccessFile("adat1.txt","r");
            int db = 0;                     
            sor = raf.readLine();          
            
            while( sor != null ) {       
                szamok[db] = Integer.parseInt(sor);
                db++;                
                sor = raf.readLine();
            }
            
            raf.close(); 
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
        
        for(int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
        
        
    }
    
}
