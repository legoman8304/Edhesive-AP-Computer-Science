import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class Lesson_17_Activity_Two {


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println("Enter two numbers:");
          int x = scan.nextInt();
          int y = scan.nextInt();
          
          if (x%2 == 0)
           
         while (x <= y) { 
           
            System.out.print(" " + x ); 
            x = x + 2; 
         } 
         
         
              if (x%2 == 1)
               x ++; 
               while (x <= y)
         { 
              
              System.out.print(" " + x );
               x = x + 2; 
         }
          
           
          
          
         
                
            
     }

}