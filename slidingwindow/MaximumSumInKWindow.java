package slidingwindow;

public class MaximumSumInKWindow {

   private  static int findMaximumInKWindow(int arr[], int k){
        int result = Integer.MIN_VALUE;
        int windowStart =0;
        int windowEnd =0;
        int windowSum =0;

        for(windowEnd =0; windowEnd< arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            if(windowEnd >= k-1){
                result = Math.max(result, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k =3;
        int result  =  findMaximumInKWindow(arr, k);
        System.out.println(result);


    }
}
