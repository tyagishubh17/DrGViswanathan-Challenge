# Day 27 - [Word](https://codeforces.com/problemset/problem/59/A)

## Problem Description

Given a word, change all its letters to uppercase if it contains more
uppercase letters than lowercase letters. Otherwise, change all its
letters to lowercase. If both counts are equal, convert the word to
lowercase.

## Examples

Input

``` text
HoUse
```

Output

``` text
house
```

Input

``` text
ViP
```

Output

``` text
VIP
```

Input

``` text
maTRIx
```

Output

``` text
matrix
```

## Approach

I counted the uppercase and lowercase letters in the word using
`Character.isUpperCase()`.

After counting, I compared both totals: - If the uppercase count is
greater, I converted the entire word to uppercase. - Otherwise, I
converted the entire word to lowercase.

This also handles the case where both counts are equal, as required.
