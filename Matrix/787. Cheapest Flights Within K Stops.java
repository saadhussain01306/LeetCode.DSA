class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = new int[n];
            temp = Arrays.copyOf(prices, prices.length);

            for (int j = 0; j < flights.length; j++) {
                int s = flights[j][0]; 
                int d = flights[j][1]; 
                int p = flights[j][2]; 

                if (prices[s] != Integer.MAX_VALUE && prices[s] + p < temp[d]) {
                    temp[d] = prices[s] + p;
                }
            }
            prices = temp;
        }
        if (prices[dst] != Integer.MAX_VALUE) {
            return prices[dst];
        }

        return -1;
    }
}
