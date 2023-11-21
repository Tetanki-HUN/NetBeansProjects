
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Godrok20231120 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("melyseg.txt"))) {
            String line;
            Integer db = 0;
            while ((line = br.readLine()) != null) {
                db++;

            }
            System.out.println("1. feladat");
            System.out.println(db);
            System.out.println("--------------------------------------------");
        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        } 
        
        System.out.println("2. feladat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy távolságértéket: ");
        int tavolsag = sc.nextInt();
        int tavolsagdb = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader("melyseg.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                if (number > tavolsag) {
                    tavolsagdb++;
                }
            }
            System.out.println("A megadott távolságot meghaladó számok száma: " + tavolsagdb);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
        
        
        
    }

}
