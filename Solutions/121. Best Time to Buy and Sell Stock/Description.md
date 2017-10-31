Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```
Example 2:
```
Input: [7, 6, 4, 3, 1]
Output: 0
```
In this case, no transaction is done, i.e. max profit = 0.

`Please explain the problem more clearly!!!`

"If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit."

I misunderstood the above sentence as at most either buy or sell one share of stock on a single day. 
In that case, I buy at a local minimum price and sell it at a local maximum to reach a maximum total profit.

Please consider changing it to something like the following:

`If you were only permitted to complete at most one buy and at most one sell during the whole period of days, 
design an algorithm such that your profit, i.e., sell price minus buy price, is maximized. 
Note that you can only not sell a stock before you buy one.`

`For example:`

`[1,2,3,4] ==> returns 3 (buy at 1 and sell at 4)`

`[4,3,2,1] ==> returns 0 (don't buy)`

`[4,10,25,2,10] ==> returns 21 (buy at 4 and sell at 25)`
