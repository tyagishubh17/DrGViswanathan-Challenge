# Day 10 – [Petya and Strings](https://codeforces.com/problemset/problem/112/A)

## Problem Description

Given two strings, compare them lexicographically without considering the difference between uppercase and lowercase letters.

Print:
- `-1` if the first string is smaller than the second.
- `1` if the first string is greater than the second.
- `0` if both strings are equal.

## Examples

### Example 1
**Input:**
```text
aaaa
aaaA
```

**Output:**
```text
0
```

### Example 2
**Input:**
```text
abcdef
ABCDEF
```

**Output:**
```text
0
```

### Example 3
**Input:**
```text
aaaa
bbbb
```

**Output:**
```text
-1
```

## Approach

Convert both strings to lowercase and compare their characters one by one.

At the first position where the characters differ:
- If the first character is smaller, print `-1`.
- If the first character is greater, print `1`.

If all characters are equal, print `0`.
