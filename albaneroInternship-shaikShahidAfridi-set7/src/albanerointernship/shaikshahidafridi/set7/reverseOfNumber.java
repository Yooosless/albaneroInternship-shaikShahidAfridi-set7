//How to reverse a given Integer in Java?
package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner ;  
/**
 *
 * @author afrid
 */
public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }   
    System.out.println(rev);
    }
}
