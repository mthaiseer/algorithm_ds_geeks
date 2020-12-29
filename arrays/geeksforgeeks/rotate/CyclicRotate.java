package arrays.geeksforgeeks.rotate;

import java.io.InputStream;
import java.io.InputStreamReader;

public class CyclicRotate {

    static void rotate(int arr[], int n){

        if(n ==0){
            return;
        }
        int temp = arr[n-1];

        for(int i =n-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

    }

    public static void main(String[] args) {


        int arr[] = {1,2,3};
        int n = arr.length;
        rotate(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");

        }
    }


}
