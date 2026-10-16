# Day 9 - [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)

## Problem Description

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

The subarray must contain at least one element.

### Example 1

**Input:**
```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output:**
```text
6
```

**Explanation:** The subarray `[4,-1,2,1]` has the largest sum, which is `6`.

### Example 2

**Input:**
```text
nums = [1]
```

**Output:**
```text
1
```

### Example 3

**Input:**
```text
nums = [5,4,-1,7,8]
```

**Output:**
```text
23
```

## Approach

Keep track of two values while traversing the array:

- `currentSum` — the maximum sum of a subarray ending at the current position.
- `maxSum` — the maximum subarray sum found so far.

For each element, decide whether to start a new subarray from that element or continue the existing subarray. Then update `maxSum` if the current sum is larger.

This approach is based on **Kadane's Algorithm**.
