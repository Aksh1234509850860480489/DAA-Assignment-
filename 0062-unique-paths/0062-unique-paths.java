class Solution {
    public int uniquePaths(int row, int col) {
        int[][] dp = new int [row][col];
        int i,j;
        for(i=0;i<col;i++){
            dp[0][i]=1;
        }
        for(i=0;i<row;i++){
            dp[i][0]=1;
        }
        for(i=1;i<row;i++){
            for(j=1;j<col;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[row-1][col-1];
    }
}