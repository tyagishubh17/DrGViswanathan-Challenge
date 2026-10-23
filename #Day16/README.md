# Day 16 - [Boy or Girl](https://codeforces.com/problemset/problem/236/A)

## Problem Description

You are given a username containing lowercase English letters.

Count the number of distinct characters in the username:
- If the number of distinct characters is even, print `CHAT WITH HER!`
- If the number of distinct characters is odd, print `IGNORE HIM!`

## Examples

### Example 1

**Input**
```text
wjmzbmr
```

**Output**
```text
CHAT WITH HER!
```

### Example 2

**Input**
```text
xiaodao
```

**Output**
```text
IGNORE HIM!
```

### Example 3

**Input**
```text
sevenkplus
```

**Output**
```text
CHAT WITH HER!
```

## Explanation

For each username, we need to count only the unique characters.

For `wjmzbmr`, the distinct characters are:
`w`, `j`, `m`, `z`, `b`, and `r`.

There are 6 distinct characters, which is even, so the output is `CHAT WITH HER!`.

## Approach

1. Read the username.
2. Create a `HashSet` to store distinct characters.
3. Traverse the string and add each character to the set.
4. Since a `HashSet` stores only unique characters, its size gives the number of distinct characters.
5. Check whether the size is even or odd.
6. Print `CHAT WITH HER!` if it is even; otherwise, print `IGNORE HIM!`.
