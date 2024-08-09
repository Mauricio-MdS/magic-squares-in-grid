# 840. Magic Squares In Grid

A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?

**Note:** While a magic square can only contain numbers from 1 to 9, the grid may contain numbers up to 15.

## Example 1:

![grid example](readme/magic_main.jpg)

**Input:** `grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]`

**Output:** `1`

**Explanation:**

The following subgrid is a 3 x 3 magic square:

![valid square](readme/magic_valid.jpg)

while this one is not:

![invalid square](readme/magic_invalid.jpg)

In total, there is only one magic square inside the given grid.

## Example 2:

**Input:** `grid = [[8]]`

**Output:** `0`

## Constraints:

- `row == grid.length`
- `col == grid[i].length`
- `1 <= row, col <= 10`
- `0 <= grid[i][j] <= 15`