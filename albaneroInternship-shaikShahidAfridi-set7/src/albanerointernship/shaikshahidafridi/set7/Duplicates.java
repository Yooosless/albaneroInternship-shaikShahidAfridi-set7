/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albanerointernship.shaikshahidafridi.set7;

import java.util.Scanner;

public class Duplicates {
    private static int findDuplicate(int nums[]) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i])
                    return nums[i];
            }
        }
 
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Duplicate ones are: " +findDuplicate(nums));
       
    }
}
