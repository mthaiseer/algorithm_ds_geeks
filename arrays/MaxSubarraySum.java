package arrays;

public class MaxSubarraySum {

    int maxSubarraySum(int arr[], int n){

      int sum =0;
      int maxSum =0;

      for(int i=0; i<n;i++){

          sum += arr[i];
          if(sum < 0){
              sum = 0;
          }
          maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        //int arr[] = {1,2,3,-2,5};
        int arr[] = {0 ,-1 ,0, -1 ,0 ,-1, 0 ,-1};
        System.out.println(new MaxSubarraySum().maxSubarraySum(arr, arr.length));
    }
}
