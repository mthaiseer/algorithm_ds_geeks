package slidingwindow;

public class LongestSubarrayWithConsecutiveOnes {

    private static int longestArrayOfOnes(int arr[], int K){
        int maxOnes =0;
        int windowEnd = 0;
        int windowStart =0;
        int windowMax = Integer.MIN_VALUE;


        for(windowEnd =0; windowEnd< arr.length; windowEnd++){

            if(arr[windowEnd] == 1){
                maxOnes+= 1;
            }

            // windowRange 1 1 1 0 0 1 = (5-0)+ 1 - 4 = 6 - 4 > 2 (K)
            int windowRange = (windowEnd - windowStart)+ 1 - maxOnes;
            if(windowRange > K){
                int leftElement = arr[windowStart];
                if(leftElement == 1){
                    maxOnes -= 1;
                }
                windowStart++;
            }

            windowMax = Math.max(windowMax, (windowEnd - windowStart)+1);

        }
        return windowMax;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0};
        int K = 2;
        int result =  longestArrayOfOnes(arr, K);
        System.out.println(result);

        int arr2[] = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 };
         result =  longestArrayOfOnes(arr2, K);
        System.out.println(result);
    }
}
