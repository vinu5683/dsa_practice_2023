package dp.basics;

/**
 * Given a grid N X M, we need to find the minimum path sum from cell 0,0
 * to N,M.
 * we can only travel to next cell by going Right (i,j+1) or down (i+1,j) i<N && j<M
 */
public class MinPathSumInGrid {
    public static void main(String[] args) {
        int N = 4;
        int M = 4;
        int[][] grid = new int[][]{
                {3, 1, 4, 10},
                {3, 1, 8, 0},
                {1, 1, 1, 0},
                {5, 5, 6, 22}
        };

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
        Min = findMinPathSum(grid, 0, 0, N, M, 0);

        System.out.println();
        System.out.println(Min);
    }

    static int Min = Integer.MAX_VALUE;

    private static int findMinPathSum(int[][] grid, int i, int j, int n, int m, int minSoFar) {
        if (i == n - 1 && j == m - 1) return grid[i][j];

        if (i >= n || j >= m)
            return Integer.MAX_VALUE;

        return grid[i][j] + Math.min(findMinPathSum(grid, i + 1, j, n, m, minSoFar)
                , findMinPathSum(grid, i, j + 1, n, m, minSoFar));
    }
}
