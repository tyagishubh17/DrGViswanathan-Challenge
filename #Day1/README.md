# Day 1 - [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

## Problem

Given an array of integers `nums`, find how many numbers have an **even number of digits**.

Return the total count of numbers that have an even number of digits.

## Examples

### Example 1

**Input:**
```text
nums = [12, 345, 2, 6, 7896]
```

**Output:**
```text
2
```

**Explanation:**

- `12` → 2 digits → Even
- `345` → 3 digits → Odd
- `2` → 1 digit → Odd
- `6` → 1 digit → Odd
- `7896` → 4 digits → Even

Therefore, the answer is `2`.

### Example 2

**Input:**
```text
nums = [555, 901, 482, 1771]
```

**Output:**
```text
1
```

**Explanation:**

- `555` → 3 digits → Odd
- `901` → 3 digits → Odd
- `482` → 3 digits → Odd
- `1771` → 4 digits → Even

Therefore, the answer is `1`.

## Approach

1. Traverse through each number in the array.
2. Convert the number into a `String`.
3. Find the length of the string to get the number of digits.
4. Check if the number of digits is even using `% 2`.
5. If it is even, increase the count.
6. Return the final count.
