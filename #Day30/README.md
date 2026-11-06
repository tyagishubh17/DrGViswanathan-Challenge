# Day 30 - [Young Physicist](https://codeforces.com/problemset/problem/69/A)

## Problem Description

You are given `n` force vectors acting on a body in three-dimensional space. Each vector contains three integer components: `x`, `y`, and `z`.

The body is in equilibrium when the net force acting on it is zero. Determine whether the sum of all force components is zero in all three directions.

Print `YES` if the body is in equilibrium; otherwise, print `NO`.

## Examples

**Example 1**

Input:
```text
3
4 1 7
-2 4 -1
1 -5 -3
```

Output:
```text
NO
```

**Example 2**

Input:
```text
3
3 -1 7
-5 2 -4
2 -1 -3
```

Output:
```text
YES
```

## Approach

I used three variables, `sumX`, `sumY`, and `sumZ`, to keep track of the total force in each direction.

I read the three components of every force vector and added them to their respective sums. After processing all the vectors, I checked whether all three sums were equal to zero.

- If `sumX`, `sumY`, and `sumZ` are all zero, the net force is zero, so I print `YES`.
- Otherwise, the body is not in equilibrium, so I print `NO`.
