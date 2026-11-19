
# Day 43 - [Football](https://codeforces.com/problemset/problem/96/A)

## Problem Description
Petya is watching a football match and wants to determine whether the current situation on the field is dangerous.

A situation is considered dangerous if at least 7 consecutive players from the same team are standing next to each other.

You are given a string consisting of `0` and `1`, representing players from two different teams. Print `YES` if there are at least 7 consecutive identical characters; otherwise, print `NO`.

## Examples

**Input:**
```text
001001
```

**Output:**
```text
NO
```

**Input:**
```text
1000000001
```

**Output:**
```text
YES
```

## Approach
I used Java's built-in `contains()` method to check whether the string contains seven consecutive `0`s or seven consecutive `1`s.

If either `"0000000"` or `"1111111"` is present, print `YES`. Otherwise, print `NO`.

This approach directly checks the dangerous condition without requiring loops or additional variables.