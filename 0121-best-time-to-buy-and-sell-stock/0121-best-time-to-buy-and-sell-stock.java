class Solution {
    public int maxProfit(int[] prices) {

        //intialize
        int minprice = prices[0];
        int maxprofit = 0;

        //outer loop
        for(int i=0; i<prices.length; i++){

            //formula
            if(prices[i] < minprice){
                minprice = prices[i];
            }else{
                maxprofit = Math.max(maxprofit, prices[i] - minprice);
            }
        }
        return maxprofit;
    }
}