/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jaror;

import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Jaror {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ArrayList<JarorClass> Meresek = new ArrayList<>();

        try (RandomAccessFile raf = new RandomAccessFile("jarmu.txt", "rw")) {
            String sor = raf.readLine();
            while (sor != null) {
                JarorClass egyMeres = new JarorClass(sor.split(" "), 08, 46, 51, "FD-2717");
                Meresek.add(egyMeres);
                sor = raf.readLine();
                
            }
        } catch( IOException e ) {
            System.err.println("HIBA");
        }
   
        
       
    }  
}
