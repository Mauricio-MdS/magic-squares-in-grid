import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int squares = 0;
        for (int rowIndex = 0; rowIndex < grid.length - 2; rowIndex++) {
            for (int colIndex = 0; colIndex < grid[0].length -2; colIndex++) {
                if (magicSquare(grid, rowIndex, colIndex)) squares++;
            }
        }
        return squares;
    }

    private boolean magicSquare(int[][] grid, int rowIndex, int colIndex) {
        Set<Integer> set = new HashSet<>();
        int[] col = new int[3];
        for (int i = rowIndex; i < rowIndex + 3; i++) {
            int row = 0;
            for (int j = colIndex; j < colIndex + 3; j++) {
                int x = grid[i][j];
                if (x < 1 || x > 9 || !set.add(x)) return false;
                row += x;
                col[j - colIndex] += x;
            }
            if (row != 15) return false;
        }

        if (grid[rowIndex][colIndex] + grid[rowIndex + 1][colIndex + 1] + grid[rowIndex + 2][colIndex + 2] != 15 ||
                grid[rowIndex][colIndex + 2] + grid[rowIndex + 1][colIndex + 1] + grid[rowIndex + 2][colIndex] != 15)
            return false;
        return Arrays.stream(col).allMatch(value -> value == 15);
    }
}