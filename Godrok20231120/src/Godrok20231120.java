import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Godrok20231120 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("melyseg.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
    
    
}
