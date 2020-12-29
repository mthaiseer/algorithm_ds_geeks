package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayInGroup {

    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {

//        if(k > n){
//            return mv;
//        }

        Integer[] arr = mv.stream().toArray(Integer[] ::new);

        int start =0;
        int end =0;
        //iterate array
        for(end=0; end<n;end++){

            //
            if((end - start)+1 == k){
                reverse(arr, start, end);
                start = end+1;
            }

        }

        if(start < n-1){
            reverse(arr, start, n-1);
            start = n+1;
        }
        return new ArrayList<Integer>(Arrays.asList(arr));
    }

    private static void reverse(Integer[]arr, int start, int end){
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> mv = new ArrayList<>();
        mv.add(1);
        mv.add(2);
       mv.add(3);
        mv.add(4);
        mv.add(5);
//        mv.add(6);
        //mv.add(7);

        ArrayList<Integer> result  = reverseInGroups(mv, mv.size(), 5);
        System.out.println(result);


    }
}
