package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int numberofElementsInIntersection(int a[], int b[], int n, int m) {

        Set<Integer> valueSet = new HashSet<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            valueSet.add(a[i]);
        }

        for(int i =0; i< m; i++){
            if(valueSet.contains(b[i])){
                valueSet.remove(b[i]);
                result+=1;
            }
        }


        return result;
    }

    public static void main(String[] args) {
//        int a[] = {89, 24, 75, 11, 23};
//        int b[] = {89, 2 ,4};
        int a[] = {4 ,4};
        int b[] = {1, 4, 2 ,3 ,5, 4};


        System.out.println(numberofElementsInIntersection(a, b, a.length, b.length));
    }
}
