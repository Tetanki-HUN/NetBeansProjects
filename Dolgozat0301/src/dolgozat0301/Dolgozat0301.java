/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat0301;

/**
 *
 * @author user3
 */
public class Dolgozat0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int eredmeny = 0;
    int[][] matrix = new int[4][4];
    RandomSzamok(matrix);
    MaxAndMin(matrix);
    Primszam(matrix);
    }
    
    public static void RandomSzamok(int[][] matrix) {
    int n = matrix.length;
    for( int i = 0; i < matrix.length; i++ ) {
        for( int j = 0; j < matrix[i].length; j++ ) {
            matrix[i][j] = (int)(Math.random()*21)+10;
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("---------------------------------------------------------");

    }
    
    public static void MaxAndMin(int[][] matrix) {
        for (int i  = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            int min = matrix[i][1];
            int kulonbseg = matrix[i][2];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
              
            }
            System.out.println("A(z)" +(i + 1)+ " sor maximuma: "+max+ " és minimuma: "+min);
            
            System.out.println("A(z) " +(i + 1) +" sor külöbsége: "+ (max - min));
            
        }
        System.out.println("---------------------------------------------------------");
    }
    

    
     public static void Primszam(int[][] matrix) {
         for (int i  = 0; i < matrix.length; i++) {
             int szam = 0;
             }
        }
     }
    
    
    

}
