import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int squares = 0;
        for (int rowIndex = 0; rowIndex < grid.length - 2; rowIndex++) {
            for (int colIndex = 0; colIndex < grid[0].length - 2; colIndex++) {
                if (isMagic(grid, rowIndex, colIndex)) squares++;
            }
        }
        return squares;
    }

    private boolean isMagic(int[][] grid, int rowIndex, int colIndex) {
        if (grid[rowIndex + 1][colIndex + 1] != 5) return false;

        int[] nums = new int[9];
        int index = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = colIndex; j < colIndex + 3; j++) {
                int x = grid[i][j];
                if (x < 1 || x > 9 || !set.add(x)) return false;
                nums[index++] = x;
            }
        }

        return nums[0] + nums[1] + nums[2] == 15 &&
                nums[3] + nums[4] + nums[5] == 15 &&
                nums[6] + nums[7] + nums[8] == 15 &&
                nums[0] + nums[3] + nums[6] == 15 &&
                nums[1] + nums[4] + nums[7] == 15 &&
                nums[2] + nums[5] + nums[8] == 15 &&
                nums[0] + nums[4] + nums[8] == 15 &&
                nums[2] + nums[4] + nums[6] == 15;
    }
}
