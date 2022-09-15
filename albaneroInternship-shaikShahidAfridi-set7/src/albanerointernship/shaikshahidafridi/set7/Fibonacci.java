/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner;  
public class Fibonacci   
{  
 
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	else if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    
    
    public static void main(String args[])  
        {  
        int n1=0, n2=1, n3 = 0;  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt(); 
    	for(int i = 0; i < n; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}
