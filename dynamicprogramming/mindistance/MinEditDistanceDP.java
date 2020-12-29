package dynamicprogramming.mindistance;

public class MinEditDistanceDP {

    private static int editDistance(String S1, String S2, int m, int n){

        int[][] grid = new int[m+1][n+1];

        for(int i=1; i<=m; i++){
            grid[i][0] = i;
        }

        for(int i=1; i<=n; i++){
            grid[0][i] =i;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    grid[i][j] = grid[i-1][j-1];
                }else{
                    grid[i][j] = 1+ Math.min(grid[i-1][j], Math.min(grid[i][j-1], grid[i-1][j-1]));
                }
            }
        }

        //print grid
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }

        return grid[m][n];

    }

    public static void main(String[] args) {
        //String S1= "CAT";
        // String S2 = "CUT";
        String S1= "SATURDAY";
        String S2 = "SUNDAY";
        int m=  S1.length();
        int n = S2.length();
        int result = editDistance(S1, S2, m, n);
        System.out.println(result);
    }
}
