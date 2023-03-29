/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autok;

/**
 *
 * @author user3
 */
import java.io.*;
import java.util.ArrayList;
public class Autok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String autok = ("cars.txt");
        File myObj = new File("filename.txt");
        
        try {
            raf = new RandomAccessFile("cars.txt","r");
            int db = 0;                     
            sor = raf.readLine();          
            
            for(String s: autok) {
                raf.writeBytes(s+"\n");
            } if (sor.startsWith("F")) {
                System.out.print(sor);
            }
            
            raf.close(); 
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
    }
    
}
