/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gulyás.zsolt.máté;

/**
 *
 * @author user3
 */
import java.util.ArrayList;
import java.util.Scanner;
public class GulyásZsoltMáté {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1. feladat
       //Kérje be a program a felhasználótól az email címét addig, amíg formailag nem megfelelő címet ad meg
       //Az ellenőrzéshez készíts egy saját metódust, ami visszaadja, hogy helyes vagy nem helyes a formátum
       //A formátum akkor helyes, ha van benne @ jel
       
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Írd le az email címet: ");
        String emailcim = myObj.nextLine();
        
        if (emailcim.contains("@")) {
            System.out.println("Köszönöm szépen :D");
        } else {
            System.out.println("Rossz email címe");
        }
        
        
        
       // 2. feladat
       //Hozz létre egy 5 elemű tömböt vagy ArrayList-et. Töltsd fel random egész szám adatokkal 10 és 20 között
       //hány olyan szám van a tömbben vagy listában, melyet egy tőle nagyobb szám követ?
       //Vizsgáld meg, hogy a tömb elemei növekvő sorrendben állnak-e
       
       
        
    }
    
}
