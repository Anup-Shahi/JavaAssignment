package Week4;

import java.util.Arrays;

public class BinarySearchElement {

         public static void binarySearch(int arr[], int first, int second, int key){
   int midd = (first + second)/2;
   while( first <= second){
      if ( arr[midd] < key ){
        first = midd + 1;   
      }else if ( arr[midd] == key ){
        System.out.println("Element found at index: " + midd);
        break;
      }else{
         second = midd - 1;
      }
      midd = (first + second)/2;
   }
   if ( first > second){
      System.out.println("Element not found!");
   }
 }
         
 public static void main(String args[]){
		int arr[] = {20,30,40,50,60};
		int key =30;
                int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
}