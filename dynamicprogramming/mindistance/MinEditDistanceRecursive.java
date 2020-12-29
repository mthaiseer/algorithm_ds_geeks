package dynamicprogramming.mindistance;


public class MinEditDistanceRecursive {

    private static int editDistance(String S1, String S2, int m, int n){

        if( m == 0){
            return n;
        }

        if(n ==0){
            return m;
        }

        if(S1.charAt(m-1) == S2.charAt(n-1)){
            return editDistance(S1, S2, m-1, n-1);
        }else{

            return  1+ Math.min(editDistance(S1, S2, m-1, n), Math.min(editDistance(S1, S2, m, n-1), editDistance(S1, S2, m-1, n-1)));

        }

    }

    public static void main(String[] args) {
        String S1= "SATURDAY";
        String S2 = "SUNDAY";
        int m=  S1.length();
        int n = S2.length();
        int result = editDistance(S1, S2, m, n);
        System.out.println(result);
    }
}
