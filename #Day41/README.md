
# Day 41 - [Presents](https://codeforces.com/problemset/problem/136/A)

## Problem Description

Little Petya received presents from his friends on his birthday. Each friend gave exactly one present to another friend.

You are given an array where the `i-th` element represents the friend who received a present from friend `i`.

Your task is to determine which friend gave a present to each friend.

In other words, for every friend `i`, find the friend who gave them a present.

## Examples

**Input:**
```text
4
2 3 4 1
```

**Output:**
```text
4 1 2 3
```

**Explanation:**

- Friend 1 received a present from friend 4.
- Friend 2 received a present from friend 1.
- Friend 3 received a present from friend 2.
- Friend 4 received a present from friend 3.

Therefore, the answer is `4 1 2 3`.

## Approach

I used an array to reverse the given relationships.

1. First, I read the number of friends `n` and created an array of size `n + 1` to store the results.
2. I iterated through each friend and read the friend number to whom they gave their present.
3. Instead of storing the input at the current index, I stored the current friend's number at the index of the friend who received the present.
4. Finally, I printed the array from index `1` to `n`.

This way, I reversed the given mapping and found out who gave a present to each friend.
