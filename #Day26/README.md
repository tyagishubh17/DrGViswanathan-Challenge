# Day 26 - [Soldier and Bananas](https://codeforces.com/problemset/problem/546/A)

## Problem Description

A soldier wants to buy `w` bananas. The first banana costs `k` dollars,
the second costs `2k` dollars, the third costs `3k` dollars, and so on.

Given the soldier's initial amount of money `n`, calculate how much
money he needs to borrow to buy all the bananas. If he already has
enough money, print `0`.

## Examples

Input

``` text
3 17 4
```

Output

``` text
13
```

## Approach

1.  Calculate the total cost of all bananas using the formula
    `k * (w * (w + 1)) / 2`.
2.  Subtract the soldier's available money `n` from the total cost.
3.  If the result is positive, print that amount because it is the money
    he needs to borrow.
4.  Otherwise, print `0` because he has enough money.

The program uses `long` variables to safely store the calculated total
cost.
