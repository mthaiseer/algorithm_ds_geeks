package arrays;


import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> num1Hs = new HashSet<>();
        Set<Integer> num2Hs = new HashSet<>();
        Set<Integer> resultHs = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            num1Hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            num2Hs.add(nums2[i]);
        }

        for (Integer c : num1Hs) {
            if (num2Hs.contains(c)) {

                resultHs.add(c);
            }
        }

        return resultHs.stream().mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {

        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = obj.intersection(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }

}
