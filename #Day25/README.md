# Day 25 - [Twins](https://codeforces.com/contest/160/problem/A)

## Problem Description

You are given `n` coins, each having a certain value. You need to take
the minimum number of coins such that the total value of your coins is
strictly greater than the total value of the remaining coins.

## Examples

**Input**

``` text
3
2 1 2
```

**Output**

``` text
2
```

## Approach

First, calculate the total value of all the coins and sort the coin
values in ascending order.

Then, start picking coins from the largest value to the smallest. Keep
adding each selected coin to your sum and increase the coin count.

Stop as soon as the value of the selected coins becomes greater than the
value of the remaining coins (`mySum > totalSum - mySum`). The number of
selected coins is the minimum required.
