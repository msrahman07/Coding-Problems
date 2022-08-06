class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length;i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            currProfit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}
