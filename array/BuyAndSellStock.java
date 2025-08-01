class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit=0;

        for(int price : prices){
            if(price<minprice){
                minprice=price;
            }
            else{
                int profit =price-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}