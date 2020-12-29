package twopointer;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    private static List<Integer> findPairSum(int arr[], int S){

        int left = 0;
        int right = arr.length-1;
        List<Integer> result  = new ArrayList<>();

        while(left < right){

            int sum  = arr[left] + arr[right];
            if(sum == S){
                result.add(left);
                result.add(right);
                break;
            }

            if( sum > S){
                right--;
            }
            if(sum < S){
                left++;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int S = 6;

        List<Integer> result  = findPairSum(arr, S);
        System.out.println(result);
    }

}
