/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;
import java.util.Scanner;  
public class SumOfDigits {  
        public static void main(String args[]) {  
             int number, digit, sum = 0;  
             Scanner sc = new Scanner(System.in);  
 
             number = sc.nextInt();  
             while(number > 0) {  
                digit = number % 10;  
                sum = sum + digit;  
                number = number / 10;  
            }  
            System.out.println(sum);  
        }  
    }  