/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgeneralas10.pkg11;
public class Randomgeneralas1011 {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] tomb = new int[10];
 
    for( int i = 0; i < tomb.length; i++ )
    {
      tomb[i] = (int)(Math.random() * 10) + 1;
    }

    for( int i = 0; i < tomb.length; i++ )
    {
      System.out.print(tomb[i] + " ");
    }
        
    }
}
    
