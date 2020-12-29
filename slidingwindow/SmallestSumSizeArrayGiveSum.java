package slidingwindow;

public class SmallestSumSizeArrayGiveSum {

    private static int smallSubArrayGivenSum(int arr[], int S){

        int minWindowSize = Integer.MAX_VALUE;
        int windowStart =0;
        int windowEnd =0;
        int windowSum =0;

        for(windowEnd=0;windowEnd <arr.length;windowEnd++){
            windowSum += arr[windowEnd];

            while(windowSum >= S){
                minWindowSize  = Math.min(minWindowSize, (windowEnd- windowStart));
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize == Integer.MAX_VALUE ? -1 : minWindowSize+1;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,2,3,2};
        int S= 7;

        int result = smallSubArrayGivenSum(arr, S);
        System.out.println("Minimum window length : "+ result);

        int arr2[] = {2,1,-3, 2,2,-4};
        int S2= 7;
         result = smallSubArrayGivenSum(arr2, S2);
        System.out.println("Minimum window length : "+ result);

    }
}
