/*Time Limit Exceeded:
TLE means all output matches the expected output up to the last
executed test case. If the last excuted test case is large, your 
algorithm may be correct but not efficent enough.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; int temp = 0;
        if(prices.length < 2)
            return 0;
        for(int i = 0; i < prices.length-1; i++)
            for(int j = i; j < prices.length; j++)
            {
                if(prices[j] > prices[i])
                {
                    temp = prices[j] - prices[i];
                    if(temp > max)
                        max = temp;
                }
                    
            }
        return max;
    }
}
