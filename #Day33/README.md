# Day 33 - [George and Accommodation](https://codeforces.com/problemset/problem/467/A)

## Problem Description

Petya lives in a dormitory where there are `n` rooms. For each room, two
integers are given:

-   `p`: the number of people currently living in the room.
-   `q`: the total number of people the room can accommodate.

A room is considered available for Petya if it has space for at least
two more people. Your task is to count how many rooms satisfy this
condition.

## Examples

**Input**

``` text
3
1 1
2 2
3 5
```

**Output**

``` text
1
```

**Explanation**

Only the third room has space for at least two additional people because
`5 - 3 = 2`.

## Approach

I read the number of rooms, `n`, and initialize a counter to zero. Then,
for each room, I read the current number of occupants (`p`) and the
room's capacity (`q`).

I calculate the available space by subtracting `p` from `q`. If `q - p`
is at least `2`, the room can accommodate Petya, so I increment the
counter.

After checking all rooms, I print the counter, which gives the total
number of suitable rooms.
