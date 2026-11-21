# Day 45 - [Magnets](https://codeforces.com/problemset/problem/344/A)

## Problem Description

Petya has a collection of magnets, each having one of two possible orientations: `01` or `10`.

When magnets are placed next to each other, magnets with the same orientation form a group. A new group is formed whenever the orientation changes.

The task is to determine the total number of groups formed after arranging all the magnets in a row.

## Examples

**Example 1:**

Input:
```text
6
10
10
10
01
10
10
```

Output:
```text
3
```

**Example 2:**

Input:
```text
4
01
01
10
10
```

Output:
```text
2
```

## Approach

1. Read the total number of magnets `n`.
2. Read the first magnet's orientation and store it in `prev`.
3. Initialize a counter `c = 1` because the first magnet always starts a group.
4. Iterate through the remaining magnets:
   - Read the current magnet's orientation into `curr`.
   - Compare `curr` with `prev` using `.equals()`.
   - If they are different, increment the group counter.
   - Update `prev` to the current magnet's orientation.
5. Print the final value of `c`.

By counting every change in magnet orientation, we can determine the total number of groups.