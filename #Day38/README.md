
# Day 38 - [Soft Drinking](https://codeforces.com/problemset/problem/151/A)

## Problem Description

N friends want to make a toast. They have `k` bottles of a drink, each containing `l` milliliters. Each friend needs `nl` milliliters of the drink for one toast.

They also have `c` limes, each of which can be cut into `d` slices. Each friend needs one lime slice for every toast.

Additionally, they have `p` grams of salt, and each friend needs `np` grams of salt for one toast.

Find the maximum number of toasts each friend can make, assuming all friends share the available resources equally.

## Examples

**Input:**
```text
3 4 5 10 8 100 3 1
```

**Output:**
```text
2
```

**Input:**
```text
5 3 10 4 2 1000 2 1
```

**Output:**
```text
3
```

**Input:**
```text
10 1000 1000 25 23 1 50 1
```

**Output:**
```text
0
```

## Approach

1. Calculate the total available drink by multiplying the number of bottles by the amount of drink in each bottle (`k * l`).
2. Divide the total drink by the amount required for one toast (`nl`) to find the possible toasts using the drink.
3. Calculate the total lime slices by multiplying the number of limes by the slices obtained from each lime (`c * d`).
4. Divide the available salt by the amount required for one toast (`p / np`) to find the possible toasts using salt.
5. Use `Math.min()` to find the minimum number of toasts possible among the three resources.
6. Divide this minimum by the number of friends (`n`) to get the maximum number of toasts each friend can make.
7. Print the final answer.
