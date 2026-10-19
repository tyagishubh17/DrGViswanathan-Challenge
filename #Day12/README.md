# Day 12 – [Next Round](https://codeforces.com/problemset/problem/158/A)

## Problem

Given the scores of `n` participants and an integer `k`, determine how many participants advance to the next round.

A participant advances if:
- Their score is at least the score of the participant in position `k`.
- Their score is greater than `0`.

## Example

### Input
```text
8 5
10 9 8 7 7 7 5 5
```

### Output
```text
6
```

## Approach

1. Read `n` and `k`.
2. Store the scores of all participants in an array.
3. Find the score of the participant at position `k` using `scores[k - 1]`.
4. Traverse all scores.
5. Count a participant if their score is:
   - greater than or equal to the `k`-th score, and
   - greater than `0`.
6. Print the final count.
