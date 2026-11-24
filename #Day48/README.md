# Day 48 - [Anton and Letters](https://codeforces.com/problemset/problem/785/A)

## Problem Description

Anton has a collection of geometric figures, each having a specific number of faces.

You are given `n` figures. Your task is to calculate the total number of faces across all the given figures.

The figures and their corresponding number of faces are:

- Tetrahedron – 4 faces
- Cube – 6 faces
- Octahedron – 8 faces
- Dodecahedron – 12 faces
- Icosahedron – 20 faces

Read the names of all `n` figures and print the total number of faces.

## Examples

**Input:**
```text
4
Icosahedron
Cube
Tetrahedron
Dodecahedron
```

**Output:**
```text
42
```

**Explanation:**

The total number of faces is:

20 + 6 + 4 + 12 = 42

## Approach

1. Read the integer `n`, representing the number of geometric figures.
2. Initialize a variable `total` to 0 to store the total number of faces.
3. Run a loop `n` times to read the name of each figure.
4. Use `if-else if` conditional statements to identify each figure and add its corresponding number of faces to `total`.
5. After processing all figures, print the final value of `total`.