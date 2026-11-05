# Day 29 - [Petya and Countryside](https://codeforces.com/problemset/problem/66/B)

## Problem Description

Petya wants to find the maximum number of consecutive sections of countryside he can observe from a chosen section.

Starting from a section, he can move to the adjacent section on either side as long as the next section is not higher than the current one. He can continue moving independently in both directions.

Given the heights of all sections, find the maximum total number of sections Petya can observe from any starting position.

## Examples

**Input**
```text
7
1 2 3 2 1 2 1
```

**Output**
```text
5
```

## Approach

For every section, consider it as the starting position and count it as one observed section.

- Move left while the section to the left is less than or equal to the current section's height.
- Move right while the section to the right is less than or equal to the current section's height.
- Add the sections counted in both directions to the starting section.
- Keep track of the maximum count obtained for any starting position.

The maximum count is the answer.
