# Day 14 – [Helpful Maths](https://codeforces.com/problemset/problem/339/A)

## Problem Description

You are given a mathematical expression containing only the numbers `1`, `2`, and `3`, separated by `+` signs.

Rearrange the numbers so that they appear in non-decreasing order and print the resulting expression.

### Example

**Input:**
```text
3+2+1
```

**Output:**
```text
1+2+3
```

Another example:

**Input:**
```text
1+1+3+1+3
```

**Output:**
```text
1+1+1+3+3
```

## Approach

1. Read the expression as a string.
2. Split the string using `+` to get the individual numbers.
3. Sort the numbers.
4. Join them back together using `+`.
5. Print the sorted expression.
