class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total_price=prices[0]+prices[1];
       if(total_price<=money){
           return money-total_price;
       }

       return money;
    }
}
