class Solution {
    public int maxProfit(int[] prices) {

        //cheapest price
        int minprice = Integer.MAX_VALUE;

        //BEST PROFIT
        int maxprofit = 0;

        //iteratiom
        for(int i=0; i<prices.length; i++){

            //update minvalue
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            //profit
            int profit = prices[i] - minprice;

            //profit update
            if(profit > maxprofit){
                maxprofit = profit;
            }
        } 
        return maxprofit;
    }
}