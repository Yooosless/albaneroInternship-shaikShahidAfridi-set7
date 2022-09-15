
package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner;
public class DuplicateStr {
 public static void main(String argu[]) {

 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
  int cnt = 0;
  char[] inp = str.toCharArray();
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) { 
     cnt++;
     break;
    }    
  }
    
 }if(cnt>0){
       System.out.println("yes");
  }
  else{
      System.out.println("no");
   }
 }
} 
