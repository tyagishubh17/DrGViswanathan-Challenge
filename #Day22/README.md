# Day 22 - [Bit++](https://codeforces.com/problemset/problem/282/A)

## Problem Description

You are given a program containing `n` statements that operate on a single variable `x`.

Initially, `x = 0`.

Each statement either:
- Increases `x` by 1 using `++`
- Decreases `x` by 1 using `--`

Find the final value of `x` after executing all statements.

## Examples

### Input

```text
1
++X
```

### Output

```text
1
```

### Input

```text
2
X++
--X
```

### Output

```text
0
```

## Approach

Start with `x = 0` and process each statement one by one.

- If the statement contains `+`, increment `x` by 1.
- Otherwise, decrement `x` by 1.

After processing all statements, print the final value of `x`.
