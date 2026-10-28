# Day 21 - [Stones on the Table](https://codeforces.com/problemset/problem/266/A)

## Problem Description

You are given a row of stones, where each stone has a color represented by a character.

The goal is to remove the minimum number of stones so that no two adjacent stones have the same color.

## Examples

Input
```text
3
RRG
```

Output
```text
1
```

Input
```text
5
RRRRR
```

Output
```text
4
```

Input
```text
4
BRBG
```

Output
```text
0
```

## Approach

Traverse the string from left to right and compare each character with the previous one.

Whenever two adjacent characters are the same, one stone must be removed. Increment the removal count for every such pair.

Finally, print the total number of required removals.
