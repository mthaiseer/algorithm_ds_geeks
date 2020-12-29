package arrays.leetcode;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {

        int start =0;
        int mid  = n;

        int[] result = new int[nums.length];
        int count =0;

        while(mid < nums.length){

            result[count++] = nums[start];
            result[count++] = nums[mid];
            start++;
            mid++;


        }
        return result;

    }

    public static void main(String[] args) {

        //int nums[] = {2,5,1,3,4,7};
        int nums[] = {1,2,3,4,4,3,2,1};

        //int n = 3;
        int n = 4;
        int[] result = shuffle(nums, n);

        for(int x: result){
            System.out.print(x + " ");
        }

    }
}
