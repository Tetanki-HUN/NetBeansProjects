/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix0207;

/**
 *
 * @author user3
 */
import java.io.*;
import java.util.Arrays;
public class Matrix0207 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
    int[][] tomb = new int[5][5];
    int n = tomb.length;
    for( int i = 0; i < tomb.length; i++ ) {
        for( int j = 0; j < tomb[i].length; j++ ) {
            tomb[i][j] = (int)(Math.random()*10)+1;
            System.out.print(tomb[i][j]+" ");
        }
        System.out.println();
        
        
        
    }
    
    
    System.out.println("------------------------------------------");
    keresztbeösszead(tomb);
    System.out.println("------------------------------------------");
    for (int i = 0; i < n; i++) {
            reverse(tomb[i]);
    }

    }
    
    static void keresztbeösszead(int[][] math){
        int keresztbe = 0;
        
        for (int i = 0; i < math.length; i++) {
           
            keresztbe += math[i][i];
            
        
        }
        
        System.out.println("Főátló összege:" + keresztbe);
    
       
    }
    
    public static void felcserel(int i1, int j1, int i2, int j2, int[][] csereles) {
        int k = csereles[i1][j1];
        csereles [i1][j1] = csereles [i2][j2];
        csereles [i2][j2] = k;
    }
    
    public static void reverse(int[] row) {
        
        int i = 0, j = row.length - 1;
        while (i < j) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;
        }

    }
}

