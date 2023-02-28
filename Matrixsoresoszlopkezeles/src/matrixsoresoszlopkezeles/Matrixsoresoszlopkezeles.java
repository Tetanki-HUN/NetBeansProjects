/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsoresoszlopkezeles;

/**
 *
 * @author user3
 */
public class Matrixsoresoszlopkezeles {
    
    public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    int[][] matrix2 = new int[5][5];
    RandomSzamok(matrix);
    MaxSorok(matrix);
    MinimumOszlop(matrix);
    MasodikMatrix(matrix);
    int[][] sum = MatrixOsszead(matrix, matrix2);
    RandomSzamok(sum);
    float[][] oszt = MatrixOsztas(matrix, matrix2);
    RandomSzamok(oszt);
    }
    
    public static void RandomSzamok(int[][] matrix) {
    int n = matrix.length;
    for( int i = 0; i < matrix.length; i++ ) {
        for( int j = 0; j < matrix[i].length; j++ ) {
            matrix[i][j] = (int)(Math.random()*11)+65;
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("---------------------------------------------------------");
    }
    
    
    public static void MaxSorok(int[][] matrix) {
        for (int i  = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("A(z)" +(i + 1)+ "sor maximuma: "+max);
        }
        System.out.println("---------------------------------------------------------");
    }
    
    
    public static void MinimumOszlop(int[][] matrix) {
        for( int j = 0; j < matrix.length; j++ ) {
            int min = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            System.out.println("A(z)" +(j + 1)+ "sor minimuma: "+min);
        }
        System.out.println("---------------------------------------------------------");
    }
    
    
    public static void MasodikMatrix(int[][] matrix2) {
    int g = matrix2.length;
    for( int i = 0; i < matrix2.length; i++ ) {
        for( int j = 0; j < matrix2[i].length; j++ ) {
            matrix2[i][j] = (int)(Math.random()*10)+1;
            System.out.print(matrix2[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("---------------------------------------------------------");
    }
    
    public static int[][] MatrixOsszead(int[][] matrix, int[][] matrix2) {
        int[][] sum = new int[5][5];
        for (int i = 0; i < matrix[i].length; i++) {
            for (int j = 0; j < matrix[j].length; j++) {
                sum[i][j] = matrix [i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    
    public static float[][] MatrixOsztas(int[][] matrix, int[][] matrix2) {
        System.out.println("---------------------------------------------------------");
        float[][] oszt = new float[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                oszt[i][j] = (float)matrix[i][j] / (float)matrix2[i][j];
            }
        }
        return oszt;
    }

    public static int[] Stat(int[][] matrix) {
        System.out.println("---------------------------------------------------------");
        int[] stat = new int[256];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int item = matrix[i][j];
                stat[item]++;
            }
        }
        return stat;
    }
}


