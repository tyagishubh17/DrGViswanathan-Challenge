# Day 11 – [String Task](https://codeforces.com/problemset/problem/118/A)

## Problem Description

Given a string, convert it to lowercase and remove all vowels. For every remaining consonant, add a `.` before it.

The vowels are `a`, `e`, `i`, `o`, `u`, and `y`.

## Examples

### Example 1
**Input:**
```text
tour
```

**Output:**
```text
.t.r
```

### Example 2
**Input:**
```text
Codeforces
```

**Output:**
```text
.c.d.f.r.c.s
```

### Example 3
**Input:**
```text
aBAcAba
```

**Output:**
```text
.b.c.b
```

## Approach

1. Read the input string.
2. Convert the string to lowercase.
3. Traverse each character.
4. Skip the character if it is a vowel.
5. Otherwise, append `.` followed by the character to the result.
6. Print the final result.
