/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Radio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String sor;
        ArrayList<NewClass> sorok = new ArrayList<>();
        RandomAccessFile raf;
        Scanner sc = new Scanner(System.in);
        
        try {
            raf = new RandomAccessFile("veetel.txt", "r");
            sor = raf.readLine();
        
        
        while(sor != null){
            NewClass radioadas = new NewClass(sor.split(" "));
            sorok.add(radioadas);
            
        }
        
        for (int i = 0; i < sorok.size(); i++) {
            System.out.println(sorok.get(i));
        }
        } catch(IOException e){
            System.err.println("ERROR");
        }
        
        
    }

    
}
