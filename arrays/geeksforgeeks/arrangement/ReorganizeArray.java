package arrays.geeksforgeeks.arrangement;

import java.util.HashSet;
import java.util.Set;

public class ReorganizeArray {

    static void reorganizeHashtable(int arr[], int n){
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0; i<n; i++){
            hashSet.add(arr[i]);
        }

        for(int i=0; i<n; i++){
            if(hashSet.contains(i)){
                arr[i] = i;
            }else{
                arr[i] = -1;
            }
        }


    }

    static void reorganize(int arr[], int n){

        //iterate each element
        for(int i=0; i<n; i++){
            //search for current
            for(int j=0; j<n;j++ ){
                //if index and value in order then continue
                if(arr[j] == arr[i]) continue;
                //if disordered element fond then place correct position and swap current element
                if(arr[j] == i){
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }

        }


    }

    public static void main(String[] args) {

       // int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        reorganize(arr, arr.length);

        for(int x: arr){
            System.out.print(x + " ");
        }

        System.out.println("USING HASH TABLE");
        reorganizeHashtable(arr, arr.length);
        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
