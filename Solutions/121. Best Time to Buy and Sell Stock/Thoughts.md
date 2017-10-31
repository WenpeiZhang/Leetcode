I tried brute force algorithm at first, theoretically it would work but definitely not efficient enough.

The top 1 solution is absolutely brilliant! The key is:
Convert the problem of to buy and sell at the best timing to considering finding a subarray with maximum sum.

EX.:
array:
`1  3  5  4  7`

coordinate:
`1  2  3  4  5  6  7`
```
 --+2-->--+2->
          <--1
          ---+3---->
 -------+6--------->
```


It might sound confusing at first sight, but this is the core of the problem:
Finding max(prices[j]-prices[i]) such that j > i.

