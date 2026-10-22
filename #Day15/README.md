# Day 15 – [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

## Problem Description

You are given an array `prices`, where `prices[i]` represents the price of a stock on the `i`th day.

Choose one day to buy the stock and a different day in the future to sell it.

Return the maximum profit that can be achieved. If no profit is possible, return `0`.

### Example

**Input:**
```text
prices = [7,1,5,3,6,4]
```

**Output:**
```text
5
```

**Explanation:** Buy the stock at price `1` and sell it at price `6`, giving a profit of `5`.

Another example:

**Input:**
```text
prices = [7,6,4,3,1]
```

**Output:**
```text
0
```

**Explanation:** The prices keep decreasing, so no profitable transaction is possible.

## Approach

1. Start by considering the first price as the minimum buying price.
2. Traverse the array from the second price onwards.
3. If the current price is lower than the minimum price, update the minimum price.
4. Otherwise, calculate the profit by selling at the current price.
5. Update the maximum profit if the current profit is greater.
6. Return the maximum profit found.
