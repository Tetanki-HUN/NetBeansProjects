/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class fajl3 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor = null;
        String[] seged = null;
        int[][] szamok = new int[5][4];
        
        
        try {
            
            raf = new RandomAccessFile("adat2.txt","r");
            int db = 0;                      
            
           while(sor != null) { 
               seged = sor.split("");
               for (int i = 0; i < 4; i++) {
                   szamok[db][i] = Integer.parseInt(seged[i]);
               }
               db++;
               sor = raf.readLine();
            } raf.close(); } 
        
        catch( IOException e ) {
            System.err.println("HIBA");
        }
        
        for(int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
    }
}
