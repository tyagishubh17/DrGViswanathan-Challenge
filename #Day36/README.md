
# Day 36 - [Cheap Travel](https://codeforces.com/problemset/problem/466/A)

## Problem Description

Ann needs to make exactly `n` subway rides. She can buy either:

- A single-ride ticket for `a` rubles.
- A special ticket that covers `m` rides for `b` rubles.

Find the minimum amount of money required to make all `n` rides.

## Examples

### Example 1

**Input**
```text
6 2 1 2
```

**Output**
```text
6
```

### Example 2

**Input**
```text
5 2 2 3
```

**Output**
```text
8
```

## Approach

1. First, compare the cost of `m` single-ride tickets (`m * a`) with the special `m`-ride ticket (`b`).
2. If `m * a <= b`, buying single-ride tickets is no more expensive. So, buy `n` single-ride tickets and print `n * a`.
3. Otherwise, calculate:
   - Complete special tickets using `n / m`.
   - Remaining rides using `n % m`.
4. Calculate the cost of complete special tickets and compare the remaining individual rides' cost (`remainder * a`) with the cost of one additional special ticket (`b`).
5. Add the smaller remaining cost and print the total minimum cost.

This approach also handles cases where buying one extra special ticket is cheaper than paying individually for the remaining rides, even if some rides covered by that ticket are unused.
