class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        
        for (int i = 0; i < prices.length-1; i++){
            int result = prices[i+1] - prices[i];
            if(result > 0)
            {
                profit = profit + result;
            }
        }
        
        return profit;
        
    }
}