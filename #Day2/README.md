# Day 2 

## 1. [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/description/)

### Problem Description
Given an integer `n`, return a list of strings from `1` to `n`, following these rules:

- If a number is divisible by both `3` and `5`, add `"FizzBuzz"`.
- If it is divisible by `3` only, add `"Fizz"`.
- If it is divisible by `5` only, add `"Buzz"`.
- Otherwise, add the number as a string.

### Example
**Input:** `n = 5`

**Output:** `["1", "2", "Fizz", "4", "Buzz"]`

### Approach
Loop through every number from `1` to `n`. Check divisibility by both `3` and `5` first, then check divisibility by `3`, and then by `5`. If none of these conditions apply, add the number as a string. Return the resulting list.

---

## 2. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)

### Problem Description
Given a string `s`, determine whether it is a palindrome after converting all uppercase letters to lowercase and removing every character that is not a letter or digit. A palindrome reads the same forward and backward.

### Example
**Input:** `s = "A man, a plan, a canal: Panama"`

**Output:** `true`

**Explanation:** After removing non-alphanumeric characters and converting to lowercase, the string becomes `"amanaplanacanalpanama"`, which reads the same forward and backward.

### Approach
First, remove all characters except letters and digits, and convert the remaining string to lowercase. Reverse the cleaned string and compare it with the original cleaned string. If both strings are equal, return `true`; otherwise, return `false`.
