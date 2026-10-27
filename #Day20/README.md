# Day 20 - [Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)

## Problem Description

You are given a 5 × 5 matrix containing exactly one `1` and the remaining elements are `0`.

The goal is to move the `1` to the center of the matrix, which is at position `(3, 3)`.

Each move can shift the `1` one position up, down, left, or right.

Find the minimum number of moves required.

## Examples

### Input
```text
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0
```

### Output
```text
0
```

### Input
```text
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 1 0
```

### Output
```text
3
```

## Approach

I read the matrix element by element and find the position of `1`.

Since the target position is the center `(3, 3)`, the minimum number of moves is the Manhattan distance between the current position `(i, c)` and the center:

`|i - 3| + |c - 3|`

I calculate this distance as soon as the `1` is found and print the result.
