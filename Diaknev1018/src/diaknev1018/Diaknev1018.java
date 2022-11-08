/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaknev1018;

import java.util.Scanner;
public class Diaknev1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Mond el a neved kérlek: ");
        String firstName = myObj.nextLine();
        String lastName = myObj.nextLine();
    
        System.out.println("Mi az osztályazonosítód?:  ");
        String classId = myObj.nextLine();
        System.out.println(classId.replaceFirst("e", "E"));
  
    }
    
}
