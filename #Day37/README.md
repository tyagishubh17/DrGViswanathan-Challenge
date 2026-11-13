
# Day 37 - [Arrival of the General](https://codeforces.com/problemset/problem/144/A)

## Problem Description

There are n soldiers standing in a line, each having a different height. The first soldier is at position 1, and the last soldier is at position n.

The general wants to arrange the soldiers so that:
- The tallest soldier stands at the first position.
- The shortest soldier stands at the last position.

In one move, the general can swap two adjacent soldiers.

Find the minimum number of swaps required to achieve this arrangement.

If multiple tallest soldiers exist, choose the one closest to the beginning. If multiple shortest soldiers exist, choose the one closest to the end.

## Examples

**Input:**
```text
4
33 44 11 22
```

**Output:**
```text
2
```

**Input:**
```text
7
10 10 58 31 63 40 76
```

**Output:**
```text
10
```

## Approach

1. Read the number of soldiers and their heights.
2. Initialize `maxVal` to -1 and `minVal` to 101 to track the tallest and shortest soldiers.
3. Traverse the array using a loop:
   - If the current height is greater than `maxVal`, update the maximum height and its index. Using `>` ensures the first occurrence of the tallest soldier is selected.
   - If the current height is less than or equal to `minVal`, update the minimum height and its index. Using `<=` ensures the last occurrence of the shortest soldier is selected.
4. Calculate the swaps required:
   - `maxIndex` swaps to bring the tallest soldier to the beginning.
   - `n - 1 - minIndex` swaps to bring the shortest soldier to the end.
5. If the tallest soldier is positioned after the shortest soldier, subtract one swap because moving the tallest soldier forward also shifts the shortest soldier one position backward.
6. Print the final minimum number of swaps.
