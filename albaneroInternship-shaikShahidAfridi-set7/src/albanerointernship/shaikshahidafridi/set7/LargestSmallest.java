/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;
import java.util.Scanner;

public class LargestSmallest {

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers=new int[5];
        for(int i=0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = numbers[0];
        int largest = numbers[0];

         for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            
            else if (numbers[i] < smallest)
                smallest = numbers[i];
             
         }

 
  System.out.println("Smallest: " + smallest);
  System.out.println("Largest: " + largest);
 }
}