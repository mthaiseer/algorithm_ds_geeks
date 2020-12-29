package dynamicprogramming.mincoin;

public class MinimumCoinRecursiveDP {

    static int mincoin(int coins[], int n, int val) {
        //create an array size of val
        int grid[] = new int[val + 1];

        //make grid first element 0
        grid[0] = 0;

        //fill all elements in grid max val
        for (int i = 1; i <= val; i++) {
            grid[i] = Integer.MAX_VALUE;
        }
        //iterate from 1 to val to fill the grid
        for (int i = 1; i <= val; i++) {
            //take each coin
            for (int j = 0; j < n; j++) {
                //if coin less than current index
                if (coins[j] <= i) {
                    //get value at that index
                    int sub = grid[i - coins[j]];
                    //if that index value not infinity then store
                    //min of current index or previous index +1
                    if (sub != Integer.MAX_VALUE) {
                        grid[i] = Math.min(grid[i], sub + 1);
                    }
                }
            }
        }

        return grid[val];
    }

    public static void main(String[] args) {
        int coins[] = {3, 4, 1};
        int N = 3;
        int val = 5;
        int result = mincoin(coins, N, val);
        System.out.println(result);
    }
}
