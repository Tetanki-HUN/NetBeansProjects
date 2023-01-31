/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtombokelso;

/**
 *
 * @author user3
 */

public class Matrixtombokelso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int osszeg = 0;
    int[][] tomb = new int[4][5];
    for( int i = 0; i < tomb.length; i++ ) {
        for( int j = 0; j < tomb[i].length; j++ ) {
            tomb[i][j] = (int)(Math.random()*10)+1;
            System.out.print(tomb[i][j]+" ");
            
            osszeg = osszeg + tomb[i][j];
            
          
            
        }
        System.out.println();
    }
    
    System.out.println("------------------------------------------");
    
    
   
    System.out.println();
    System.out.println("------------------------------------------");
    
    System.out.println("A tomb elemeinek összege: "+osszeg); //Összeg az egész mátrixnak
    
   
    System.out.println("------------------------------------------");
    System.out.println();
    
    
    }
    public static void doubleMatrix(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = numbers [i][j] * 2;
                System.out.println(numbers+"");
            }
        }
}
    
}
