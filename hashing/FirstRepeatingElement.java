package hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {


    static int firstRepeated(int arr[], int n) {
       int index = -1;

        Map<Integer, Integer> trackMap = new HashMap<>();

        for(int i=0; i<n; i++){

            if(trackMap.containsKey(arr[i])){
                return  trackMap.get(arr[i]);
            }
            trackMap.put(arr[i], i);

        }


       return index;
    }

    public static void main(String[] args) {

//        int arr1[] = {1, 5, 3, 4, 3, 5, 6};
//        System.out.println(firstRepeated(arr1, arr1.length));

        int arr1[] = {1 ,1, 2, 2 ,3, 3};
        System.out.println(firstRepeated(arr1, arr1.length));

    }


}
