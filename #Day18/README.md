# Day 18 - [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)

## Problem Description

Given the head of a singly linked list, reverse the linked list and return the new head of the reversed list.

## Examples

### Example 1

**Input:**  
`head = [1,2,3,4,5]`

**Output:**  
`[5,4,3,2,1]`

### Example 2

**Input:**  
`head = [1,2]`

**Output:**  
`[2,1]`

### Example 3

**Input:**  
`head = []`

**Output:**  
`[]`

## Explanation

The linked list needs to be reversed so that each node points to the previous node instead of the next node.

For example:

`1 → 2 → 3 → 4 → 5`

becomes:

`5 → 4 → 3 → 2 → 1`

The reversal is performed by changing the direction of each `next` pointer while traversing the list.

## Approach

Use three pointers: `prev`, `curr`, and `nextTemp`.

Start with `prev` as `null` and `curr` at the head of the list. For every node, first store the next node, then reverse the current node's pointer to point to `prev`. Move `prev` and `curr` forward and continue until the end of the list is reached.

Finally, `prev` becomes the new head of the reversed linked list.
