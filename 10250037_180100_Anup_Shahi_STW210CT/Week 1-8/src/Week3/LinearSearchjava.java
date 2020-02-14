/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

public class LinearSearchjava {
    
            
    public static void main(String[] args) {
      
      int i,length, key, array[];
 
      Scanner input = new Scanner(System.in);
 
      System.out.println("Enter the length of Array:");
 
      length = input.nextInt(); 
 
      array = new int[length]; 
 
      System.out.println("Enter " + length + " elements");
 
      for (i = 0; i < length; i++)
      {
        array[i] = input.nextInt();
      }
      System.out.println("Enter the value of search key:");
      key = input.nextInt();
      for (i = 0; i < length; i++)
      {
         if (array[i]== key) 
         {
           System.out.println(key+" is present at location "+(i+1));
            break;
         }
      }
      if (i == length)
        System.out.println(key + " array doesn't exit.");
   }
}
