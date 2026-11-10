# Day 34 - [Tavas and SaDDas](https://codeforces.com/problemset/problem/535/B)

## Problem Description

A lucky number is a positive integer whose decimal representation
contains only the digits `4` and `7`.

You are given a lucky number `n`. Find its position in the sequence of
all lucky numbers when they are arranged in increasing order.

For example, the sequence begins with `4, 7, 44, 47, 74, 77, ...`.

## Examples

**Input**

``` text
47
```

**Output**

``` text
4
```

## Approach

First, count how many lucky numbers have fewer digits than the given
number. For every length `i`, there are `2^i` lucky numbers. Therefore,
the number of lucky numbers with fewer digits is:

`2^1 + 2^2 + ... + 2^(len - 1) = 2^len - 2`

Next, find the position of the given number among lucky numbers of the
same length. Treat each `4` as `0` and each `7` as `1`. The resulting
binary value gives a zero-based offset within that group.

Add `1` to convert that offset into a one-based position, then add the
count of all shorter lucky numbers.

The final formula is:

`answer = (2^len - 2) + binaryValue + 1`
