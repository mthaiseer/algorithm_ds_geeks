package binarysearch;

import java.util.Arrays;

public class BinarySearch {

    static int search(int arr[], int N, int K) {

       int start =0;
       int end = N;

        Arrays.sort(arr);

       while(start< end){
           int mid  = (end+ start)/2;
           if(arr[mid] == K){
               return mid;
           }

           if(K > arr[mid]){
               start = mid+1;
           }
           if(K< arr[mid]){
               end = mid -1;
           }
       }

       return -1;

    }

    public static void main(String[] args) {
        int arr[] = {16, 82 ,58, 24, 37,62,24 ,0,36};
        System.out.println(search(arr, arr.length, 36));
    }
}
