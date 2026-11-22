# Day 46 - [Calculating Function](https://codeforces.com/problemset/problem/486/A)

## Problem Description

You are given a positive integer `n`. Your task is to calculate the value of a function `f(n)` defined as:

- Odd numbers contribute negatively.
- Even numbers contribute positively.

The function is defined as:

`f(n) = -1 + 2 - 3 + 4 ... ± n`

Print the resulting value of the function.

## Examples

**Example 1:**

Input:
```text
4
```

Output:
```text
2
```

**Example 2:**

Input:
```text
5
```

Output:
```text
-3
```

**Example 3:**

Input:
```text
6
```

Output:
```text
3
```

## Approach

Instead of calculating the sum of all numbers individually, we can use a mathematical formula to get the result directly.

- If `n` is even, the result is `n / 2`.
- If `n` is odd, the result is `-(n + 1) / 2`.

We check whether `n` is even or odd using the modulo operator (`%`).

Since `n` can be a large number, we use the `long` data type to avoid integer overflow.

This approach calculates the answer in constant time, O(1), without using any loops.