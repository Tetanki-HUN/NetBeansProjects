/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


/**
 *
 * @author user3
 */
public class fajl4 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<Integer> szamok = new ArrayList<Integer>();
        
        try {
            raf = new RandomAccessFile("adat2.txt","r");
            int db =  0;                      
            sor = raf.readLine();
            
            while ( sor != null ) { 
                szamok.add(Integer.parseInt(sor));
                db++;
                sor = raf.readLine();
            }
            
            raf.close(); 
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
        
        for(int i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
    }
}

