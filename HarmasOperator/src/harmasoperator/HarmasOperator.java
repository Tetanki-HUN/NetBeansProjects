/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmasoperator;

/**
 *
 * @author user3
 */
import java.util.Scanner;
public class HarmasOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = 10;
        String decide;
        if (num < 20) {
            decide = "kisebb";
        }
        else {
            decide = "nagyobb";
        }
        
        System.out.println(decide);
        
        decide = (num > 20)? "kisebb" : "nagyobb";
        
        System.out.println(decide);
 
        System.out.println("Írj be egy karaktert");
        String nagybetus = myObj.nextLine();

        
        if (nagybetus.equals(nagybetus.toUpperCase())) {
            System.out.println("A(z) "+nagybetus+ " karakter nagybetűs");
        }
        else {
            System.out.println("A(z) "+nagybetus+ " karakter kisbetűs");
            
        Scanner bill = new Scanner(System.in);   
        System.out.println("Írj be egy karaktert");
        char betu = bill.next().charAt(0);
        
        System.out.println("A(z) " + betu + " " + 
         (Character.isUpperCase(betu)? "nagybetűs" : "kisbetűs")
                + ".");
        
        
        int ev = 0;
        int honap;
        int nap;
        Scanner YEAR = new Scanner(System.in);
        System.out.printf("Írj be egy évszámot: ");
        ev = YEAR.nextInt();

        
        Scanner SN = new Scanner(System.in);
        System.out.printf("Írj be egy hónapi számot (pl: 12 = december): ");
        honap = SN.nextInt();
        System.out.println(honap);
        switch (honap) {
            case 4:
            case 6:
            case 9:
            case 11: 
                nap = 30;
                break;
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nap = 31;
                break;
                
            case 2:
                if (((ev % 4 == 0) && !(ev % 100 == 0)) || (ev % 400 == 0)) {
                    nap = 29;
                } 
                else {
                    nap = 28;
                }
                break;
                
            default:
                nap = 0;
                break;
                
        } if (nap > 0)
            System.out.println("Amennyi nap van ebbe a hónapba: " + nap);
        else
            System.out.printf("Ilyen hónapi dátum nem is létezik!!! ");
        }
    }
}
