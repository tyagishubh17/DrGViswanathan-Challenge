# Day 31 - [Perfect Number](https://leetcode.com/problems/perfect-number/description/)

## Problem Description

A **perfect number** is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

Given an integer `num`, return `true` if `num` is a perfect number; otherwise, return `false`.

## Examples

**Example 1:**

```text
Input: num = 28
Output: true
Explanation: The divisors of 28, excluding 28, are 1, 2, 4, 7, and 14.
Their sum is 1 + 2 + 4 + 7 + 14 = 28.
```

**Example 2:**

```text
Input: num = 7
Output: false
```

**Example 3:**

```text
Input: num = 1
Output: false
```

## Approach

First, handle numbers less than or equal to `1`, since they cannot be perfect numbers. For any larger number, initialize the divisor sum to `1`, because `1` is always a proper divisor.

Then, iterate from `2` while `i * i` is less than or equal to `num`. Whenever `i` divides `num` evenly, add both `i` and its paired divisor `num / i` to the sum. If `i * i == num`, add the divisor only once because both values are the same.

Finally, compare the sum of all proper divisors with `num`. If they are equal, the number is perfect.
