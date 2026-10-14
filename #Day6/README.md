# Day 6 - Way Too Long Words ([Codeforces Problem 71A](https://codeforces.com/problemset/problem/71/A))

## Problem Description

Sometimes words such as `localization` or `internationalization` are too long to write repeatedly.

For each word:
- If its length is **10 characters or fewer**, print the word as it is.
- If its length is **greater than 10**, abbreviate it by keeping the first and last characters and replacing the characters in between with their count.

For example, `localization` becomes `l10n`.

## Examples

**Input**
```text
4
word
localization
internationalization
pneumonoultramicroscopically
```

**Output**
```text
word
l10n
i18n
p25y
```

## Approach

Read the number of words, then process each word one by one. If a word has more than 10 characters, keep its first character, calculate the number of characters between the first and last characters, and append its last character. Otherwise, print the word unchanged.

