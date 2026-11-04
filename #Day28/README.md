# Day 28 - [Drinks](https://codeforces.com/problemset/problem/200/B)

## Problem Description

Given `n` drinks, each containing a certain percentage of orange juice,
mix equal proportions of all the drinks. Calculate the percentage of
orange juice in the resulting cocktail.

## Examples

**Input**

``` text
3
50 50 100
```

**Output**

``` text
66.666666666667
```

**Input**

``` text
4
0 25 50 75
```

**Output**

``` text
37.5
```

## Approach

Read the number of drinks and then calculate the sum of their orange
juice percentages. Since equal proportions of every drink are mixed, the
final percentage is the average of all the given percentages.

Divide the total sum by `n` and print the result as a `double` to
preserve decimal precision.
