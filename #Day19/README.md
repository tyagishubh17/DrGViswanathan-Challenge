# Day 19 - [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/)

## Problem Description

Given an array of intervals, merge all overlapping intervals and return the non-overlapping intervals that cover all the original intervals.

## Examples

### Example 1

Input
```text
[[1,3],[2,6],[8,10],[15,18]]
```

Output
```text
[[1,6],[8,10],[15,18]]
```

### Example 2

Input
```text
[[1,4],[4,5]]
```

Output
```text
[[1,5]]
```

## Approach

First, sort the intervals based on their starting values.

Then, traverse the sorted intervals:
- If the current interval does not overlap with the last merged interval, add it to the result.
- If they overlap, merge them by updating the ending value to the maximum of both intervals.

Finally, convert the list of merged intervals into a 2D array and return it.
