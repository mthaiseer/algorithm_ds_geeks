package arrays.geeksforgeeks.rotate;

public class FindInRotatedArray {

    static int search(int arr[], int n, int k){

        int pivotIndex = pivot(arr, n);
        if(pivotIndex == -1){
            System.out.println("search in all array");
            return binarySearch(arr, 0, n-1, k);
        }

        if( k >=arr[0] && k <= arr[pivotIndex]){
            System.out.println("search in left part");
            return  binarySearch(arr, 0, pivotIndex, k);
        }

        System.out.println("search in right part");
        return binarySearch(arr, pivotIndex+1, n-1, k);
    }

    static int binarySearch(int arr[], int start, int end, int k){

        while(start <=end){
            int mid = (end+ start) /2;
            if(arr[mid] == k){
                return mid;
            }

            if(k > arr[mid]){
                start = mid+1;
            }

            if(k < arr[mid]){
                end = mid -1;
            }
        }

        return -1;

    }

    static int pivot(int arr[], int n) {

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = (end + start) / 2;

            if (arr[mid] > arr[0] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] < arr[0]) {
                end = mid - 1;
            }
            start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        //int arr[] = {3, 4, 5, 1, 2};
        int arr[] = {3, 4, 5, 6,7,8,1,2};
        //int arr[] = {1,2,3, 4, 5, 6,7,8};
        //int arr[] = {2,3,4,5,6,1};
        System.out.println(search(arr, arr.length,  8));
        //System.out.println(pivot(arr, arr.length));

    }
}
