package twopointer;

public class SquareRootInSortedOrder {

    private static int[] calculateSquareRoot(int []arr){

        int result[] = new int[arr.length];
        int left = 0;
        int right = arr.length -1;
        int resultPtr = arr.length-1;

        while(left < right){

            int leftSqrt  = arr[left] * arr[left];
            int rightSqrt  = arr[right] * arr[right];

            if(leftSqrt >= rightSqrt){
                result[resultPtr--] = leftSqrt;
                left++;
            }

            if(leftSqrt <= rightSqrt){
                result[resultPtr--] = rightSqrt;
                right--;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {-2, -1, 0, 2, 3};
        int result[] =  calculateSquareRoot(arr);
        for(int d: result){
            System.out.print(d + " ");
        }

        System.out.println();

        int arr2[] = {-3, -1, 0, 1, 2};
        int result2[] =  calculateSquareRoot(arr2);
        for(int d: result2){
            System.out.print(d + " ");
        }


    }

}
