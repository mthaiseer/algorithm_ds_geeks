package dynamicprogramming.lcs;

public class LongestCommonSubsequenceRecursive {

    static int lcs(String S1, String S2, int m, int n){

        if(m ==0 ||  n == 0 ){
            return 0;
        }
        if(S1.charAt(m-1) == S2.charAt(n-1)){
            return 1+ lcs(S1, S2, m-1, n-1);
        }else{
            return Math.max(lcs(S1, S2, m-1, n), lcs(S1, S2, m, n-1));
        }

    }

    public static void main(String[] args) {
        String S1 = "ABC";
        String S2 = "AXC";
        int result  = lcs(S1, S2, S1.length(), S2.length());
        System.out.println(result);
    }


}
