class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int profit=0;
        int maxprofit=0;
       for(int right=1;right<prices.length;right++){
            if(prices[right]>prices[left]){
                profit=prices[right]-prices[left];
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                left=right;
            }
       }
       return maxprofit;
    }
}