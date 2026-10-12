# Day 5 - Watermelon ([Codeforces Problem 4A](https://codeforces.com/problemset/problem/4/A))

## Problem Description

Watermelon is a problem where you are given the weight of a watermelon
in kilograms. Determine whether it can be divided into two parts such
that **both parts have a positive even weight**.

Print `YES` if it is possible; otherwise, print `NO`.

## Examples

**Example 1**

Input:

``` text
8
```

Output:

``` text
YES
```

Explanation: The watermelon can be divided into two parts weighing 2 kg
and 6 kg.

**Example 2**

Input:

``` text
3
```

Output:

``` text
NO
```

Explanation: An odd total weight cannot be split into two even parts.

## Approach

Check whether the weight is greater than 2 and divisible by 2. If both
conditions are true, print `YES`; otherwise, print `NO`.
