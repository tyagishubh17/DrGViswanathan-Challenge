# Day 4: [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)

## Problem Description

Given a string containing the characters `(`, `)`, `{`, `}`, `[` and `]`, determine whether the brackets are valid.

A string is valid when:
- Every opening bracket has a matching closing bracket of the same type.
- Brackets close in the correct order.
- Every closing bracket has a corresponding opening bracket.

## Examples

**Example 1**

- Input: `s = "()"`
- Output: `true`

**Example 2**

- Input: `s = "()[]{}"`
- Output: `true`

**Example 3**

- Input: `s = "(]"`
- Output: `false`

**Example 4**

- Input: `s = "([])"`
- Output: `true`

## Approach

I used a **stack** to keep track of opening brackets.

1. When an opening bracket (`(`, `{`, or `[`) appears, push it onto the stack.
2. When a closing bracket appears, check whether the stack is empty. If it is, the string is invalid.
3. Otherwise, check the top opening bracket. If it matches the closing bracket, remove it from the stack; if it does not match, return `false`.
4. After processing the whole string, the string is valid only if the stack is empty.

## What I Learned

This problem helped me practise using a stack to match brackets and verify that they are closed in the correct order.
