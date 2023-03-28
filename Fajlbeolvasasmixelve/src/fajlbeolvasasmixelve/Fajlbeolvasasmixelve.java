/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasasmixelve;

/**
 *
 * @author user3
 */
import java.io.*;
public class Fajlbeolvasasmixelve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];
        
        try {
            raf = new RandomAccessFile("Nevekesegyszam.txt","r");
            int db = 0;                       //Számlálót indítok
            
            sor = raf.readLine();            //első sort beolvasom
            
            while( sor != null ) {         //Addig fusson, amíg a sor nem null
                nevek[db] = sor;         //A neveket tartalmazó tömbbe teszi a kiolvasott adatot
                db++;                   //Számláló növelése (a while NEM növeli)
                sor = raf.readLine();  //Beolvasom a következő sort
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
