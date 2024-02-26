class Solution {
    public int convertTime(String current, String correct) {
        // split the string into the string arrays 
        // containing hours at 0th index and minutes at 1th index

        String[] cur=current.split(":");
        String[] cor=correct.split(":");

        int curr=Integer.parseInt(cur[0])*60+Integer.parseInt(cur[1]);
        int corr=Integer.parseInt(cor[0])*60+Integer.parseInt(cor[1]);


        int[] increments = {60, 15, 5, 1};
        int ans = 0;

        for (int i : increments) {
            int diff = corr - curr;
            int operations = diff / i;
            ans += operations;
            curr += operations * i;
        }

        return ans;

        
    }
}
