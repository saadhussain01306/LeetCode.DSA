class Solution {
    public double averageWaitingTime(int[][] customers) {
        double total_wait=0;
        int available_at=0;
        for(int[] cust:customers){
            int arrive=cust[0];
            int make_time=cust[1];
            available_at=Math.max(arrive,available_at)+make_time;
            total_wait+=available_at-arrive;
        }
        return total_wait/customers.length;
    }
}
