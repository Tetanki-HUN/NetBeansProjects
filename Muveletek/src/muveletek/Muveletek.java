/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matematikai műveletek
        
          //Két operandosu
          int a = 420;
          int b = 69;
          int osszeg = a + b;
          int kulonseg = a - b;
          int szorzat = a * b;
          int hanyados = a / b;
          int maradek = 0 % b;
          System.out.println(maradek); //az a/b osztás MARADÉLÁT adja 
          
          //Egy operandusó
          int c = 5;
          c++; //v értékének növelése 1-el postfix formában
          System.out.println(c); //c értéke 6
          System.out.println(c++); //c értéke 6 majd növeli 1-gyel (7)
          System.out.println(++c); //c értéke 8 lesz, ezt íratjuk ki 
          
          int d = 3;
          d--; //2
          System.out.println(--d); //1
          
        //Relációs műveletek
          int x = 9;
          int y = 14;
          
          System.out.println(x > y); //false
          System.out.println(x < y); //true
          System.out.println(x <= y); //true
          System.out.println(x >= y); //false
          System.out.println(x == y); //false
          System.out.println(x != y); //true
          System.out.println("amogus uwu sussy bools owo yeah yeah <3 sussy baka x3");
          
        //Logikai műveletek 
          boolean t = true;
          boolean f = false;
          
          System.out.println(t && f); //false mert f hamis ha mindkettő igaz lenne csak akkor írna ki igazt
          System.out.println(t || f);
          System.out.println(!t);
          
        //Értékadó műveletek
          int k;
          
          k = 3;
          k = k + 1;
          k += 1; //összevontuk a műveleteket
          
          k -= 1;
          k *= 2;
          k /= 4;
          k %= 2;
         
          System.out.println(k);
          
        //Összetett műveletek
          int z = 12;
         
          //3-mal és 4-gyel is osztható-e
         System.out.println((z % 4 == 0) && (z % 3 == 0)); //true
         
          //3-mal vagy 4-gyel osztható-e
         System.out.println((z % 4 == 0) || (z % 3 == 0));
         
          //3-mal és 5-tel nem osztható-e
         System.out.println(!(z % 3 == 0) && (z % 5 == 0)); 
         
          //3-mal osztható és 5-tel nem osztható-e
         System.out.println((z % 3 == 0) && !(z % 5 == 0)); 
         
          //5-tel osztható nem negatív szám-e
         System.out.println((z % 5 == 0) && !(z < 0)); 
         
        
          
    }
    
}
