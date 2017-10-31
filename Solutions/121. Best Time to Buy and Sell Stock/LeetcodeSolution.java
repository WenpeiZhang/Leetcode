/*
We need to find out the maximum difference (which will be the maximum profit) between two numbers in the given array. 
Also, the second number (selling price) must be larger than the first one (buying price).

In formal terms, we need to find max(prices[j]-prices[i]), for every i and j such that j > i.
*/
//Approach #1 (Brute Force) [Time Limit Exceeded]
//See My_Solution.java

/*
Complexity Analysis

Time complexity : 
O(n^2). Loop runs n(n−1)/2 times.
Space complexity : 
O(1). Only two variables - maxprofit and profit are used.
*/

//Approach #2 (One Pass) [Accepted]
/*Say the given array is:

[7, 1, 5, 3, 6, 4]

If we plot the numbers of the given array on a graph, we get:
https://leetcode.com/media/original_images/121_profit_graph.png 

The points of interest are the peaks and valleys in the given graph. 
We need to find the largest peak following the smallest valley. 
We can maintain two variables - minprice and maxprofit corresponding to the smallest
valley and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.

*/
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];//minprice so far, namely the smallest valley so far 
            else if (prices[i] - minprice > maxprofit)//find the largest peak following the smallest valley
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
/*
Complexity Analysis

Time complexity : 
O(n). Only a single pass is needed.

Space complexity : 
O(1). Only two variables are used.
*/

//Analysis written by: @vinod23
