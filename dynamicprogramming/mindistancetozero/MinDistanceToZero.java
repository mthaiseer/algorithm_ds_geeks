package dynamicprogramming.mindistancetozero;

public class MinDistanceToZero {

    static int minDistance(int n){
        int dp[] = new int[n+1];



        for(int i =2; i<=n; i++){

            int op1 = Integer.MAX_VALUE;
            int op2 = Integer.MAX_VALUE;
            int op3 = Integer.MAX_VALUE;

            if(i % 3 == 0){
                op1 = dp[i/3];
            }

            if(i % 2 == 0){
                op2 = dp[i/2];
            }

            op3 = dp[i-1];

            dp[i] = Math.min((Math.min(op1, op2)), op3)+1;

        }

        return  dp[n];

    }

    public static void main(String[] args) {
        System.out.println(minDistance(2));
    }
}
