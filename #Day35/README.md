
# Day 35 - [Park Lighting](https://codeforces.com/problemset/problem/1358/A)

## Problem Description

You are given a rectangular park consisting of `n` rows and `m` columns. Each square in the park needs to be illuminated.

A lantern can illuminate either one or two adjacent squares. Your task is to find the minimum number of lanterns required to illuminate the entire park.

## Examples

**Input**
```text
2
2 3
3 3
```

**Output**
```text
3
5
```

## Approach

The total number of squares in the park is `n * m`.

Since one lantern can illuminate at most two squares, we need half the total number of squares, rounded up, to illuminate the entire park.

We can calculate this using the formula:

`(n * m + 1) / 2`

In Java, integer division automatically removes the decimal part, so adding `1` before dividing by `2` handles both even and odd totals correctly.

We repeat this calculation for each test case and print the minimum number of lanterns required.
