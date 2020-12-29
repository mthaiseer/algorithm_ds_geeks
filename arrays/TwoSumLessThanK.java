package arrays;

import java.util.Arrays;

public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] nums, int k) {

       int start =0;
       int end = nums.length-1;
       int maxsofar = -1;

       Arrays.sort(nums);

       while(start < end){
           int localsum = nums[start]+ nums[end];
           if(localsum == k){
               start++;
               end--;
           }

           if(localsum > k){
               end--;
           }

           if(localsum< k){
               maxsofar = Math.max(localsum, maxsofar);
               start++;
           }

       }
        return maxsofar;

    }

    public static void main(String[] args) {
//        int[] nums = {34,23,1,24,75,33,54,8};
//        int k =60;
        int[] nums = {254,914,110,900,147,441,209,122,571,942,136,350,160,127,178,839,201,386,462,45,735,467,153,415,875,282,204,534,639,994,284,320,865,468,1,838,275,370,295,574,309,268,415,385,786,62,359,78,854,944};
        int k= 200;


        System.out.println(new TwoSumLessThanK().twoSumLessThanK(nums, k));
    }

}
