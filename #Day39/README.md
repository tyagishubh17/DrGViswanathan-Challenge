
# Day 39 - [Night at the Museum](https://codeforces.com/problemset/problem/731/A)

## Problem Description

Grigoriy is trying to open a book by rotating a circular wheel containing all 26 lowercase English letters (`a` to `z`).

Initially, the pointer is positioned at the letter `a`. He needs to enter a given string by moving the pointer to each character in the string, one by one, from left to right.

The wheel can be rotated in both clockwise and counterclockwise directions. Since the letters are arranged in a circle, the pointer can move from `a` to `z` in one rotation or from `z` to `a` in one rotation.

The task is to find the minimum total number of rotations required to enter the entire string.

## Examples

**Input:**
```text
zeus
```

**Output:**
```text
18
```

**Input:**
```text
codeforces
```

**Output:**
```text
59
```

## Approach

- Initially, set the current character to `a` and initialize the rotation count to `0`.
- Traverse the given string character by character.
- For each character, calculate the absolute difference between its position and the current character's position.
- This difference represents the distance in one direction around the alphabet wheel.
- Calculate the distance in the opposite direction using `26 - diff`.
- Choose the smaller of the two distances and add it to the total rotations.
- Update the current character to the target character before moving to the next character.
- After processing all characters, print the total minimum rotations required.
