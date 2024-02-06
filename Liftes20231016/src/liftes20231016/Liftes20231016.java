/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package liftes20231016;

/**
 *
 * @author MSI
 */
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
public class Liftes20231016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        Integer[] csapatok = null;
        
        ArrayList<Integer> jeloltek = new ArrayList<Integer>();
        
        try {
            raf = new RandomAccessFile("igeny.txt","r");
            int db = 0;                     
            sor = raf.readLine();
            sor = raf.readLine();  
            sor = raf.readLine();  
            
            while( sor != null ) {       
                System.out.println(new String(sor.getBytes("ISO-88591"), "UTF-8"));
                csapatok[db] = sor;      
                db++;             
                sor = raf.readLine();
            }
            
            raf.close();      
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
    }
    
}
