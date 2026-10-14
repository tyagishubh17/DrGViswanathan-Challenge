# Day 7 - Team ([Codeforces Problem 231A - Team](https://codeforces.com/problemset/problem/231/A))

## Problem Description

Three friends, Petya, Vasya, and Tonya, decide whether to solve programming problems together.

For each problem, they give their opinion using `1` if they are sure about the solution and `0` otherwise.

A problem is solved if at least two of the three friends are sure about the solution.

Given the number of problems and their opinions, count how many problems they will solve.

## Examples

### Example 1

**Input:**
```text
3
1 1 0
1 1 1
1 0 0
```

**Output:**
```text
2
```

### Example 2

**Input:**
```text
2
1 0 0
0 1 1
```

**Output:**
```text
1
```

## Approach

For each problem, read the opinions of Petya, Vasya, and Tonya.

Add their values together. If the sum is at least `2`, it means at least two friends are confident about the solution, so the problem is counted.

Finally, print the total number of problems that can be solved.

