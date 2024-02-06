/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cegesauto;

/**
 *
 * @author MSI
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Autok {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new FileReader("autok.txt"))) {
            while (fileScanner.hasNextLine()) {
                String[] data = Scanner.nextLine().split("\\s+");
                Cegesauto entry = new Cegesauto(
                        Integer.parseInt(data[0]),
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),    
                        data[3],
                        data[4],
                        Integer.parseInt(data[5]),
                        Boolean.parseBoolean(data[6 ]));
            }
        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        }

    }

}
