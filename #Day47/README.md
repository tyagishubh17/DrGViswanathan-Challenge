# Day 47 - [Pangram](https://codeforces.com/contest/520/problem/A)

## Problem Description

A word or sentence is called a pangram if it contains every letter of the English alphabet at least once.

Given an integer `n` and a string `s` consisting of uppercase and lowercase English letters, determine whether the string is a pangram.

The string is considered a pangram if it contains all 26 letters of the English alphabet, regardless of their case.

Print `YES` if the string is a pangram; otherwise, print `NO`.

## Examples

**Example 1**

Input:
```text
12
toosmallword
```

Output:
```text
NO
```

**Example 2**

Input:
```text
35
TheQuickBrownFoxJumpsOverTheLazyDog
```

Output:
```text
YES
```

## Approach

1. Read the integer `n` and the input string `s`.
2. Convert the string to lowercase using `toLowerCase()` to handle uppercase and lowercase letters uniformly.
3. Initialize a variable `count` to 0.
4. Iterate through all 26 lowercase English letters, from `'a'` to `'z'`.
5. Use `indexOf()` to check whether each character exists in the string.
6. If a character is found, increment `count` by 1.
7. Finally, check whether `count` equals 26:
   - If yes, print `YES`.
   - Otherwise, print `NO`.