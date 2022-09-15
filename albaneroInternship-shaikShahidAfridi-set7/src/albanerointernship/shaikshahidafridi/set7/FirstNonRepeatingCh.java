package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner;

class FirstNonRepeatingCh {
    static char count[] = new char[256];
    static void getCharCountArray(String str){
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static int firstNonRepeating(String str){
        getCharCountArray(str);
        int index = -1, i;
 
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
 
        return index;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = firstNonRepeating(str);
        if(index==-1){
            System.out.println("");
        }
        else{
            System.out.println(str.charAt(index));
        }
       
}}
