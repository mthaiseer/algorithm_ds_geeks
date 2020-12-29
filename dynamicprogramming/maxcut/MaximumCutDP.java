package dynamicprogramming.maxcut;

public class MaximumCutDP {

    static int maxcuts(int n, int a, int b, int c){

        int[] grid = new int[n+1];
        grid[0] =0;

        for(int i=1; i<=n; i++){

            grid[i] = -1;

            if(i - a >=0) grid[i] = Math.max(grid[i], grid[i-a]);
            if(i - b >=0) grid[i] = Math.max(grid[i], grid[i-b]);
            if(i - c >=0) grid[i] = Math.max(grid[i], grid[i-c]);

            if(grid[i] != -1){
                grid[i]++;
            }

        }
        return grid[n];
    }

    public static void main(String[] args) {

        int max =  maxcuts(5, 1,2,3);
       // int max =  maxcuts(23, 12,11,13);
        System.out.println(max);

    }
}
