# Day 50 - [Union of Doubly Linked Lists](https://codeforces.com/problemset/problem/847/A)

## Problem Description

You are given `n` elements representing several doubly linked lists. Each element contains two values:

- `l[i]`: The index of the previous element.
- `r[i]`: The index of the next element.

A value of `0` indicates that there is no previous or next element.

The task is to combine all the separate doubly linked lists into one single doubly linked list while maintaining their original order.

For every element, update its left and right pointers accordingly.

## Examples

**Input:**
```text
7
4 7
5 0
0 0
6 1
0 2
0 4
1 0
```

**Output:**
```text
4 7
5 6
0 5
6 1
3 2
2 4
1 0
```

## Approach

1. Create two arrays, `l` and `r`, to store the previous and next pointers of every element.
2. Maintain a variable `lastEnd` to track the last element of the previously processed list.
3. Traverse all elements and identify the starting elements of individual lists using `l[i] == 0`.
4. If a previous list exists, connect its last element to the current list's starting element:
   - Update `r[lastEnd] = i`.
   - Update `l[i] = lastEnd`.
5. Traverse the current list using the right pointers until its last element is reached (`r[curr] == 0`).
6. Update `lastEnd` to this last element.
7. Finally, print the updated left and right pointers for all elements.