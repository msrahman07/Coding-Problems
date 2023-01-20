/*
LeetCode: 994. Rotting Oranges

You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
*/

public class Solution {
    public int OrangesRotting(int[][] grid) {
        if(grid == null || grid[0].Length == 0)
        {
            return -1;
        }

        Queue<(int, int)> queue = new Queue<(int, int)>();
        int time = 0, fresh = 0;

        for(int i=0; i<grid.Length; i++) 
        {
            for(int j=0; j<grid[i].Length; j++)
            {
                if(grid[i][j] == 1)
                {
                    fresh++;
                }
                else if(grid[i][j] == 2)
                {
                    queue.Enqueue((i,j));
                }
            }
        }
        if(fresh == 0) return 0;
        
        int[,] fourDir = new int[,] {{0,1}, {0,-1}, {1,0}, {-1,0}};

        while(queue.Any()) 
        {
            int size = queue.Count;
            for(int i=0; i< size; i++)
            {
                (int, int) currCell = queue.Dequeue();
                for(int j=0; j<4; j++)
                {
                    int row = currCell.Item1 + fourDir[j,0];
                    int col = currCell.Item2 + fourDir[j,1];

                    if(row >= 0 && row < grid.Length &&
                        col >= 0 && col < grid[0].Length &&
                        grid[row][col] == 1
                    )
                    {
                        grid[row][col] = 2;
                        queue.Enqueue((row,col));
                        fresh--;
                    }
                }
            }
            time++;
        }
        return (fresh == 0) ? time-1 : -1;
    }
}
