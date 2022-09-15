/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner;

/**
 *
 * @author afrid
 */
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev="";
        int n=input.length();
        char ch;
        for (int i=0;i<n;i++){
            ch = input.charAt(i);
            rev=ch+rev;
        }
        if(rev.equals(input)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}
