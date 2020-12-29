package backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubSet {

    static void generateSubsetKV2(int arr[], int start, int k, Set<Integer> partial){
        if(partial.size() == k ){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }

        //we reached end of array
        if(start == arr.length){
            return;
        }

        for(int i= start; i<arr.length; i++){
            partial.add(arr[i]);
            generateSubsetKV2(arr, i+1, k, partial);
            //backtrack
            partial.remove(arr[i]);
        }
    }

    static void generateSubsetK(int arr[], int start, int k, Set<Integer> partial){
        if(partial.size() == k ){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }

        //we reached end of array
        if(start == arr.length){
            return;
        }
        partial.add(arr[start]);
        generateSubsetK(arr, start+1, k, partial);
        partial.remove(arr[start]);
        generateSubsetK(arr, start+1, k, partial);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k= 3; //3 element subset
        int start = 0;
        //generateSubsetK(arr, start, k, new HashSet<>());
        generateSubsetKV2(arr, start, k, new HashSet<>());
    }
}
