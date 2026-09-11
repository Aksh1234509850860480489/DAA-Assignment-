class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if(col==0 || row==0){
            return 0;
        }
        int [][] dp = new int [row][col];
        dp[0][0] = grid[0][0];
        int i, j;
        for(i=1;i<col;i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for(i=1;i<row;i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(i=1;i<row;i++){
            for(j=1;j<col;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[row-1][col-1];
    }
}