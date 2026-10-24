# Day 17 - [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)

## Problem

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements in the array.

The answer can be returned in any order.

### Example 1

**Input:**
```text
nums = [1,1,1,2,2,3], k = 2
```

**Output:**
```text
[1,2]
```

### Example 2

**Input:**
```text
nums = [1], k = 1
```

**Output:**
```text
[1]
```

## Approach

First, find the minimum and maximum values in the array to create a frequency array covering the complete range of possible values.

Then, count the occurrences of each number using its offset from the minimum value.

To find the `k` most frequent elements, repeatedly scan the frequency array, select the element with the highest frequency, add it to the result, and mark its frequency as `-1` so it is not selected again.

This process is repeated `k` times.
