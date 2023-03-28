/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbe;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];
        
        try {
            raf = new RandomAccessFile("nevek.txt","r");
            int db = 0;                     //Sz�ml�l�t ind�tok
            sor = raf.readLine();          //els� sort beolvasom
            
            while( sor != null ) {       //Addig fusson, am�g a sor nem null
                                        //System.out.println(new String(sor.getBytes("ISO-88591"), "UTF-8"));
                nevek[db] = sor;       //A neveket tartalmaz� t�mbbe teszi a kiolvasott adatot
                db++;                 //Sz�ml�l� n�vel�se (a while NEM n�veli)
                sor = raf.readLine();//Beolvasom a k�vetkez� sort
            }
            
            raf.close();
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
        
        for(int i = 0; i < nevek.length; i++) {
            System.out.print(nevek[i] + " ");
        }
    }
    
}
