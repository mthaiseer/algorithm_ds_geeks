package backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubSetSum {

    static void generateSubsetSum(int arr[], int start, int target, int sum, Set<Integer> partial){

        //if we found sum
        if(sum == target){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }
        //try each candidate
        for(int i = start; i< arr.length; i++){

            //if sum greater than target or two candidate are same, then skip it
            if(sum+ arr[i] > target || start> 0 && arr[start] == arr[start-1]){
                continue;
            }
            //add current candiate
            partial.add(arr[i]);
            //try next candidate
            generateSubsetSum(arr, i+1, target, sum+arr[i], partial);
            //remove candidate
            partial.remove(arr[i]);
        }


    }

    public static void main(String[] args) {
        int[] arr = {10, 1,2,7,6, 1, 5};
        Arrays.sort(arr);
        int target = 8;
        generateSubsetSum(arr, 0, target, 0, new HashSet<>());
    }

}
