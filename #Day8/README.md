# Day 8 - [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/description/)

## Problem Description

Given the head of a linked list and an integer `val`, remove all the nodes from the linked list whose value is equal to `val`.

Return the head of the modified linked list.

## Example 1

**Input:**  
`head = [1,2,6,3,4,5,6]`  
`val = 6`

**Output:**  
`[1,2,3,4,5]`

## Example 2

**Input:**  
`head = []`  
`val = 1`

**Output:**  
`[]`

## Example 3

**Input:**  
`head = [7,7,7,7]`  
`val = 7`

**Output:**  
`[]`

## Approach

A dummy node is created before the head of the linked list to make removing the first node easier.

Two pointers are used:

- `prev` keeps track of the previous node.
- `curr` is used to traverse the linked list.

If `curr.val` is equal to `val`, the current node is skipped by connecting `prev` directly to `curr.next`.

Otherwise, `prev` is moved to the current node.

The process continues until the entire linked list is traversed. Finally, the modified list starting from `removal.next` is returned.
