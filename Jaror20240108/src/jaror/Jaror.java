/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jaror;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Jaror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new FileReader("jarmu.txt"))) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                numbers.add(number);
            }
            System.out.println("1. feladat");
            System.out.println(numbers.size());
            System.out.println("--------------------------------------------");
        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
    
}
