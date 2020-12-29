package dynamicprogramming.mincoin;

public class MinimumCoinRecursive {
    static int mincoin(int coins[], int n, int val) {

        if (val == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (coins[i] <= val) {
                int sub = mincoin(coins, n, val - coins[i]);
                if (sub != Integer.MAX_VALUE) {
                    result = Math.min(result, sub + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int coins[] = {25, 10, 5};
        int coins[] = {1,2,4};
        int K = 6;
        int min = mincoin(coins, coins.length, K);
        System.out.println(min);
    }
}
