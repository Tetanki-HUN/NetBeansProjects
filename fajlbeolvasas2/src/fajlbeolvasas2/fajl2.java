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
public class fajl2 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[] szamok = new int[6];
        
        try {
            raf = new RandomAccessFile("adat2.txt","r");
            int db =  Integer.parseInt(raf.readLine());                      
            
            for(int i = 0; i < db; i++) { 
                sor = raf.readLine();
                szamok[i] = Integer.parseInt(sor);
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
