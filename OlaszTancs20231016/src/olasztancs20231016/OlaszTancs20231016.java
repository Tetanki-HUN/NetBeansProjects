/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package olasztancs20231016;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class OlaszTancs20231016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        ArrayList<Tancok> parok = new ArrayList<>();  
        
        try {
            raf = new RandomAccessFile("tancrend.txt","rw");
                            
            String fiuTanc = " ";
            
            while( fiuTanc != null ) {
                Integer.parseInt hour = raf.readLine();
                String lanyTancs = raf.readLine();
                fiuTanc = raf.readLine();
                String lanyTanc = null;
                Tancok adatok = new Tancok(tanc, fiuTanc, lanyTanc);
                parok.add(adatok);
                
            }
            
            raf.close();
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
    }
    
}
