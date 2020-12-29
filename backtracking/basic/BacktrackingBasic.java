package backtracking.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BacktrackingBasic {

    private  static void permute(int arr[], int n, List<Integer> temp){
        if(n< 0){

            System.out.println(Arrays.asList(temp.toArray()));
            return;
        }

        temp.add(arr[n]);
        permute(arr, n-1, temp);
        temp.remove(temp.size()-1);
        permute(arr, n-1, temp);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n= arr.length-1;

        permute(arr, n , new ArrayList<>());
    }

}
