
# Day 40 - [Kefa and First Steps](https://codeforces.com/problemset/problem/580/A)

## Problem Description

Kefa has recently learned about the stock market. He wants to know the maximum number of consecutive days during which the stock prices were non-decreasing.

You are given an array of `n` integers representing the stock prices for `n` consecutive days.

Your task is to find the maximum length of a continuous segment in which every element is greater than or equal to the previous element.

## Examples

**Input:**
```text
6
1 2 2 3 1 4
```

**Output:**
```text
4
```

**Explanation:**

The longest non-decreasing continuous segment is `1 2 2 3`, which has a length of `4`.

## Approach

I used two variables, `currentLen` and `maxLen`, to track the length of the current non-decreasing segment and the maximum length found so far.

- Initialize both variables to `1`, since a single element itself forms a valid segment.
- Read the first element and store it in `prev`.
- Traverse the remaining elements one by one.
- If the current element is greater than or equal to the previous element, increment `currentLen`.
- Otherwise, reset `currentLen` to `1` because a new non-decreasing segment starts.
- Update `maxLen` whenever the current segment becomes longer than the previous maximum.
- Finally, print `maxLen`.

This approach checks every element exactly once and finds the longest non-decreasing continuous segment.
