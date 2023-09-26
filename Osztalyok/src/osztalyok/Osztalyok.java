/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osztalyok;

/**
 *
 * @author MSI
 */
import java.io.*;

public class Osztalyok {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[3];

        try {
            raf = new RandomAccessFile("kutyak.txt", "r");
            sor = raf.readLine();
            String[] adatok = sor.split(",");
            Kutya cezarKutya = new Kutya(adatok[0], adatok[1], adatok[2], Integer.parseInt(adatok[3]));

            cezarKutya.ugat();

        } catch (IOException e) {
            System.err.println("HIBA: " + e);
        }

        for (String nevek1 : nevek) {
            System.out.print(nevek1 + " ");
        }

        Kutya buksiKutya = new Kutya("Buksi", "tacskó", "barna", 5);

        System.out.println(buksiKutya.getFajta());
        buksiKutya.ugat();
    }

}
