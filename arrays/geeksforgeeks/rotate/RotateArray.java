package arrays.geeksforgeeks.rotate;

public class RotateArray {

    static void rotate(int arr[], int n, int d){

        if(n <=1 ){
            return;
        }


        swap(arr, 0, d-1);
        swap(arr, d,  n-1);
        swap(arr, 0, n-1);



    }

    static void swap(int arr[], int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start]  =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {


        //int arr[] = {1,2,3,4,5,6};
        int arr[] = {1, 3, 4, 2};
        int n = arr.length;
        int K = 3;
        rotate(arr, n, K);

        for(int x: arr){
            System.out.print( x+ " ");
        }


    }


}
