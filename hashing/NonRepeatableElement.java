package hashing;

import java.util.*;

public class NonRepeatableElement {

    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        Map<Integer, Integer> counterMap = new LinkedHashMap<>();

        for(int i=0; i<n; i++){
            counterMap.put(arr[i], counterMap.getOrDefault(arr[i], 0)+1);
        }

        counterMap.forEach((k, v) ->{
            if(v == 1){
                result.add(k);
            }
        });
        return result;
    }

    public static void main(String[] args) {
        //int arr[] = {1,1,2,2,3,3,4,5,6,7};
        int arr[] = {0 ,9 ,2 ,3, 4 ,8, 7};
        System.out.println(printNonRepeated(arr, arr.length));
    }
}
