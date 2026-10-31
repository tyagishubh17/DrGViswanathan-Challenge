# Day 24 - [Translation](https://codeforces.com/problemset/problem/41/A)

## Problem Description

Given two strings `s` and `t`, determine whether `t` is the reverse of `s`.

Print `YES` if `t` is exactly the reverse of `s`. Otherwise, print `NO`.

## Examples

**Input**
```text
code
edoc
```

**Output**
```text
YES
```

**Input**
```text
abb
aba
```

**Output**
```text
NO
```

## Approach

Reverse the first string `s` using `StringBuilder` and compare it with the second string `t`. If both strings are equal, print `YES`; otherwise, print `NO`.
