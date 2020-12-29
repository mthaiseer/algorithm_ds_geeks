package dynamicprogramming.lcs;

public class LongestCommonSubsequenceDP {

    private static int lcs(String S1, String S2, int m, int n){

        int grid[][] = new int[m+1][n+1];

        for(int i=1; i<= m; i++){
            for(int j=1; j<=n;j++){

                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    grid[i][j] = 1+grid[i-1][j-1]  ;
                }else{
                    grid[i][j] = Math.max(grid[i-1][j], grid[i][j-1]);
                }


            }
        }

        for(int i=0; i<= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print( " "+ grid[i][j]);
            }
            System.out.println();
        }

        return grid[m][n];

    }

    public static void main(String[] args) {
        String S1= "abcd";
        String S2 = "abd";
        int m = S1.length();
        int n = S2.length();
        int result = lcs(S1, S2, m, n);
        System.out.println(result);
    }


}
