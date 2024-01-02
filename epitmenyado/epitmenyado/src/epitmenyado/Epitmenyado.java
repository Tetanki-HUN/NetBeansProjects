/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package epitmenyado;

/**
 *
 * @author diak
 */
import java.io.RandomAccessFile;
import java.util.*;
import java.util.ArrayList;
import java.io.IOException;
public class Epitmenyado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sor;
        ArrayList<Epitmenyadoclass> utcak = new ArrayList<>();
        RandomAccessFile raf;
        Scanner sc = new Scanner(System.in);
        
        try {
            raf = new RandomAccessFile("utca.txt","r");
            sor = raf.readLine();
            int A;
            int B;
            int C;
            A = Integer.parseInt(sor.split(" ")[0]);
            B = Integer.parseInt(sor.split(" ")[1]);
            C = Integer.parseInt(sor.split(" ")[2]);
            sor = raf.readLine();
            
            while(sor!=null) {
                Epitmenyadoclass utca = new Epitmenyadoclass(sor.split(" "));
                utcak.add(utca);
                sor = raf.readLine();
            }
            
            for (int i = 0; i < utcak.size(); i++) {
                System.out.println(utcak.get(i));
            }
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("2. feladat.");
            System.out.println("A mintában " +utcak.size()+" telek szerepel.");
            System.out.println("------------------------------------------------");
            
            System.out.println("3. feladat.");
            System.out.println("Egy tulajdonos adószáma: ");
            int adoszam = sc.nextInt();
            int count = 0;
            for (int i = 0; i < utcak.size(); i++) {
                if (adoszam == utcak.get(i).getAdoszam()) {
                    count++;
                    System.out.println(utcak.get(i).getUtcanev()+" utca "+utcak.get(i).getHazszam());
                    System.out.println("---------------------------------------------------------------------");
                }
            }

            if (count ==0) {
                System.out.println("Ilyen adószámmal rendelkező személy nem rendelkezik az adatlistában.");
                System.out.println("---------------------------------------------------------------------");
            }
            
            System.out.println("5. feladat.");
            int AoverAll = 0;
            int BoverAll = 0;
            int CoverALL = 0;
            for (int i = 0; i < utcak.size(); i++) {
                ado(utcak.get(i).getAlapterulet(), utcak.get(i).getAdosav());
            }

        }
        catch(IOException e) {
            System.err.println("ERROR");
        }
    }

    
}
