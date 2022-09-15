/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;

/**
 *
 * @author afrid
 */
public class SumofTwo {

  private static void bigsmall(int[] array, int number) {
  for(int i = 0; i < array.length ; i++){
   int first = array[i];
   for(int j = i +1 ; j < array.length; j++){
    int second = array[j];
    if(first+second == number){
     System.out.println("("+first+","+second+")");
    }
   }
  }
  }
 public static void main(String[] args) {
  int [] array = {3,4,1,6,-1,7,5,2};
  int number = 6;
  bigsmall(array, number);
}}

    

