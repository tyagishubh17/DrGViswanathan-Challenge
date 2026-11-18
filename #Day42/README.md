# Day 42 - [Ultra-Fast Mathematician](https://codeforces.com/problemset/problem/61/A)

## Problem Description

You are given two binary strings of equal length, containing only `0` and `1`.

Your task is to generate a third string by comparing the corresponding digits of both strings.
- If the digits are different, print `1`.
- If the digits are the same, print `0`.

The operation is equivalent to applying the XOR (`^`) operator to each pair of corresponding digits.

## Examples

**Example 1**

Input:
```text
1010100
0100101
```

Output:
```text
1110001
```

**Example 2**

Input:
```text
1110
1010
```

Output:
```text
0100
```

## Approach

1. Read the two binary strings using `Scanner`.
2. Iterate through both strings simultaneously using a `for` loop.
3. Extract the characters at the current index using `charAt(i)`.
4. Apply the XOR (`^`) operator to the corresponding characters.
5. Print the result directly.

Since XOR returns `1` when two bits are different and `0` when they are equal, it directly solves the problem without requiring additional conditions or conversions.