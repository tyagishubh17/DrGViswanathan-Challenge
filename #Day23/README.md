# Day 23 - [Almost Lucky](https://codeforces.com/problemset/problem/110/A)

## Problem Description

A number is called *lucky* if all its digits are either `4` or `7`.

You are given a number. Count how many lucky digits (`4` and `7`) it contains. If this count is itself a lucky number (equal to `4` or `7`), print `YES`. Otherwise, print `NO`.

## Examples

**Input**
```text
47
```

**Output**
```text
YES
```

**Input**
```text
1000000000000000000
```

**Output**
```text
NO
```

**Input**
```text
447474
```

**Output**
```text
YES
```

## Approach

1. Read the number as a string so that each digit can be checked easily.
2. Initialize a counter `luckyCount` to `0`.
3. Traverse every character in the string.
4. If the character is `4` or `7`, increase `luckyCount`.
5. After checking all digits, print `YES` if `luckyCount` is `4` or `7`; otherwise, print `NO`.
