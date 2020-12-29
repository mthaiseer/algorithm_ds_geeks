package dynamicprogramming.longestincreasesubsequence;

public class LongestIncreaseSubsequence {

    static int lis(int[] arr, int n){
        int dp[] = new int[n];
        dp[0] = 1;

        for (int i=1; i<n; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                //any element lesser than current element then get dp[j]+ 1 to current index dp[i]
                //if current element is less than previous then put 1
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int max = -1;
        for(int i=0; i<dp.length; i++){
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10,5, 18, 7,2, 9};
        int result = lis(arr, arr.length);
        System.out.println(result);
    }
}
