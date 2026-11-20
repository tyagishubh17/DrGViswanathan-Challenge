# Day 44 - [Anton and Danik](https://codeforces.com/problemset/problem/734/A)

## Problem Description

Anton and Danik played a chess tournament consisting of `n` games. Each game was won by either Anton or Danik.

The results are represented by a string containing:
- `A` if Anton won the game.
- `D` if Danik won the game.

We need to determine who won more games.

Print:
- `Anton` if Anton won more games.
- `Danik` if Danik won more games.
- `Friendship` if both won the same number of games.

## Examples

**Example 1**

Input:
```text
6
ADAAAA
```

Output:
```text
Anton
```

**Example 2**

Input:
```text
7
DDDAADA
```

Output:
```text
Danik
```

**Example 3**

Input:
```text
6
DADADA
```

Output:
```text
Friendship
```

## Approach

1. Read the total number of games `n` and the result string `s`.
2. Initialize two counters, `a` for Anton and `d` for Danik, both starting at zero.
3. Traverse the string character by character:
   - If the character is `A`, increment Anton's counter.
   - Otherwise, increment Danik's counter.
4. Compare the two counters:
   - If `a > d`, print `Anton`.
   - If `d > a`, print `Danik`.
   - Otherwise, print `Friendship`.

This approach counts both players' wins in a single traversal of the string and determines the overall winner.