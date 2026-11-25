class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minP){
                minP=prices[i];
            }
            int profit=prices[i]-minP;
            max=Math.max(profit,max);
        }
        return max;

    }
}