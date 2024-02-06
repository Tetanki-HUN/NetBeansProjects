import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Godrok20231120 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new FileReader("melyseg.txt"))) {
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

        System.out.println("2. feladat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy távolságértéket: ");
        int tavolsag = sc.nextInt();
        int tavolsagdb = 0;

        for (int number : numbers) {
            if (number > tavolsag) {
                tavolsagdb++;
            }
        }
        System.out.println("A megadott távolságot meghaladó számok száma: " + tavolsagdb);
    }
}