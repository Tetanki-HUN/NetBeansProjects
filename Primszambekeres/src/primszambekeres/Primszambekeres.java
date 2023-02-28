/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primszambekeres;

/**
 *
 * @author user3
 */
import java.util.Scanner;
public class Primszambekeres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Írj nékem egy számot: ");
        int primszamcheck = myObj.nextInt();
        System.out.println("A választott számod:" + primszamcheck);
        
        
    }
    
}
