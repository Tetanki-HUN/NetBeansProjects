/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viragok;

/**
 *
 * @author MSI
 */
import java.io.*;
public class Viragok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String[] String, boolean enMuskatlim) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[3];

        try {
            raf = new RandomAccessFile("novenyek.txt", "r");
            sor = raf.readLine();
            String[] adatok = sor.split(",");
            System.out.println(enMuskatlim);

        } catch (IOException e) {
            System.err.println("HIBA: " + e);
        }
       

        for (int i = 0; i < nevek.length; i++) {
            System.out.print(nevek[i] + " ");
        }
    }
    
}
