# Day 3

Today, I solved two problems as part of the **Dr G Viswanathan Challenge**.

## 1. Two Sum

**Problem:** [Two Sum – LeetCode](https://leetcode.com/problems/two-sum/description/)

### Problem Description
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers whose sum equals `target`.

You may assume that each input has exactly one solution, and you cannot use the same element twice.

### Examples

**Example 1**
- Input: `nums = [2,7,11,15]`, `target = 9`
- Output: `[0,1]`
- Explanation: `nums[0] + nums[1] = 2 + 7 = 9`.

**Example 2**
- Input: `nums = [3,2,4]`, `target = 6`
- Output: `[1,2]`

**Example 3**
- Input: `nums = [3,3]`, `target = 6`
- Output: `[0,1]`

### Approach

I explored two approaches to solve this problem:

- **Solution 1 – Nested loops:** Compare each number with the numbers that come after it. When a pair adds up to the target, return their indices.
- **Solution 2 – HashMap:** Store each number and its index in a HashMap. For every number, calculate its complement (`target - nums[i]`) and check whether that complement has already been stored. If it has, return both indices.

The HashMap approach avoids checking every possible pair, making it more efficient for larger arrays.

## 2. Roman to Integer

**Problem:** [Roman to Integer – LeetCode](https://leetcode.com/problems/roman-to-integer/description/)

### Problem Description
Given a Roman numeral string `s`, convert it into an integer.

Roman numerals use the following symbols:

| Symbol | Value |
|---|---:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Usually, values are added together. However, when a smaller value appears before a larger value, the smaller value is subtracted.

### Examples

**Example 1**
- Input: `s = "III"`
- Output: `3`
- Explanation: `1 + 1 + 1 = 3`.

**Example 2**
- Input: `s = "LVIII"`
- Output: `58`
- Explanation: `50 + 5 + 1 + 1 + 1 = 58`.

**Example 3**
- Input: `s = "MCMXCIV"`
- Output: `1994`
- Explanation: `1000 + 900 + 90 + 4 = 1994`.

### Approach

I used a HashMap to store the value of each Roman numeral symbol. Then, I traversed the string and compared each symbol with the one immediately after it:

- If the current symbol's value is smaller than the next symbol's value, subtract the current value.
- Otherwise, add the current value.
- Finally, add the value of the last symbol.

This handles subtraction cases such as `IV` (4), `IX` (9), `XL` (40), and `CM` (900).

---

## What I Learned

- A **HashMap** can improve lookup efficiency and help avoid repeatedly checking every possible pair.
- The **Two Sum** problem can be solved using both brute force and a more efficient HashMap-based approach.
- Roman numeral conversion depends on comparing adjacent symbol values to decide whether to add or subtract.
