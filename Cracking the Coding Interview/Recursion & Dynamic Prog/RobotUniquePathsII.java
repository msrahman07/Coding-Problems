import java.util.Arrays;

/*
You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m-1][n-1]). The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The testcases are generated so that the answer will be less than or equal to 2 * 109.


// Python implementation
class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        if(obstacleGrid[0][0] == 1):
            return 0
        obstacleGrid[0][0] = 1
        
        r = len(obstacleGrid)
        c = len(obstacleGrid[0])
        
        for i in range(1,r):
            obstacleGrid[i][0] = int(obstacleGrid[i][0] == 0 and obstacleGrid[i-1][0] == 1)
            
        for j in range(1,c):
            obstacleGrid[0][j] = int(obstacleGrid[0][j] == 0 and obstacleGrid[0][j-1] == 1)
            
        for i in range(1,r):
            for j in range(1,c):
                if(obstacleGrid[i][j] == 0):
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1]
                else:
                    obstacleGrid[i][j] = 0
        return obstacleGrid[r-1][c-1]
*/

// Java implementation

public class RobotUniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] memo = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return uniquePathsWithObstacles(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1, memo);
    }
    
    private int uniquePathsWithObstacles(int[][] obstacleGrid, int r, int c, int[][] memo) {
        if(r < 0 || c < 0 || obstacleGrid[r][c] == 1) {
            return 0;
        } else if (r == 0 && c == 0 && obstacleGrid[r][c] == 0) {
            return 1;
        } else if(memo[r][c] > -1) {
            return memo[r][c];
        } else {
            memo[r][c] = uniquePathsWithObstacles(obstacleGrid, r-1, c, memo) + uniquePathsWithObstacles(obstacleGrid, r, c-1, memo);
            return memo[r][c];
        }
    }
}