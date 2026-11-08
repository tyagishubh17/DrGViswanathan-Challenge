# Day 32 - [Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)

## Problem Description

You are given a 5 × 5 matrix containing 24 zeroes and exactly one `1`.

The matrix is considered beautiful when the `1` is positioned at the center cell, which is at row 3 and column 3.

In one move, you can swap two neighboring rows or two neighboring columns. Find the minimum number of moves required to bring the `1` to the center.

## Examples

**Example 1**

Input:
```text
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
```

Output:
```text
3
```

**Example 2**

Input:
```text
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
```

Output:
```text
1
```

## Approach

- Read all 25 elements of the matrix using nested loops.
- When the element `1` is found, store its row and column positions.
- The target position is the center of the matrix: row 3, column 3.
- Each move shifts the `1` by exactly one row or one column. Therefore, the minimum number of moves is the Manhattan distance between its current position and the center.
- Calculate the answer using:

  `Math.abs(row - 3) + Math.abs(col - 3)`

- Print the calculated number of moves.
