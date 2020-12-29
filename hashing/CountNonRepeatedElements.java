package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNonRepeatedElements {
    static long countNonRepeated(int arr[], int n)    {

        Map<Integer, Integer> counterMap = new HashMap<>();
        long result =0;

        for(int i=0; i<n;i++){
            counterMap.put(arr[i], counterMap.getOrDefault(arr[i], 0)+1);
        }

        for(int i : counterMap.values()){
            if(i == 1){
                result = result+1;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        //int arr[] = {1, 1, 2, 2, 3, 3, 4 ,5 ,6, 7};
        int arr[] = {1, 1,1,1,1,1, 2};
        System.out.println(countNonRepeated(arr, arr.length));
    }
}
