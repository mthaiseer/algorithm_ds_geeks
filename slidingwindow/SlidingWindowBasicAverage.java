package slidingwindow;


import java.util.ArrayList;
import java.util.List;

public class SlidingWindowBasicAverage {

    List<Double> findAverage(int arr[], int K){

        double windowSum =0; int windowStart = 0; int windowEnd =0;
        List<Double> result = new ArrayList<>();

        for( windowEnd= 0; windowEnd<arr.length; windowEnd++){

            windowSum+= arr[windowEnd];

            if(windowEnd >= K-1){
                result.add(windowSum/K);
                windowSum -= arr[windowStart];
                windowStart+=1;
            }
        }
       return result;
    }

    public static void main(String[] args) {

        SlidingWindowBasicAverage obj = new SlidingWindowBasicAverage();
        int[] arr =  {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K =5;
        List<Double> result  =  obj.findAverage(arr, K);

        for(Double d: result){
            System.out.print(d + " ");
        }
    }

}
