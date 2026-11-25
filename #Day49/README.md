# Day 49 - [Vadim's Collection](https://codeforces.com/problemset/problem/2098/A)

## Problem Description

You are given a 10-digit string for each test case. Your task is to rearrange its digits to obtain the lexicographically smallest possible number such that the digit at each position satisfies the required minimum value.

Each digit must be used exactly once.

## Examples

**Input:**
    4
    0123456789
    9876543210
    9876543211
    1234567890

**Output:**
    9876543210
    9876543210
    9876543211
    9876543210

## Approach

1. Read the number of test cases and process each 10-digit string.
2. Create a frequency array of size 10 to count the occurrences of each digit.
3. Traverse the string and update the frequency of each digit.
4. Use a StringBuilder to construct the answer.
5. For each position from 0 to 9, calculate the minimum required digit as 9 - i.
6. Find the smallest available digit that is greater than or equal to the required digit.
7. Append that digit to the answer and decrease its frequency by one.
8. Print the resulting string.

This greedy approach selects the smallest valid available digit at every position, producing the lexicographically smallest valid result.