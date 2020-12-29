package arrays.geeksforgeeks.arrangement;

public class MoveZerosEnd {

    static void moveZerosOneLoop(int arr[], int n){

        int count =0;
        for(int i=0; i<n; i++){
            //swap all non zero item with zero item
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i ] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

    }

    static void moveZeros(int arr[], int n){
        int start =0;
        int end = n-1;

        while(start < end){

            if(arr[start] == 0){

                while(arr[end] == 0){
                    end --;
                }

                int temp = arr[start];
                arr[start ] = arr[end];
                arr[end] = temp;
                end--;

            }

            start++;
        }

    }

    public static void main(String[] args) {
        //int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr[] = {1, 2, 0, 0, 0, 3, 6};
        moveZeros(arr, arr.length);
        for(int x: arr){
            System.out.print(x +" ");
        }
        System.out.println("With one loop : ");
        moveZerosOneLoop(arr, arr.length);
        for(int x: arr){
            System.out.print(x +" ");
        }

    }
}
