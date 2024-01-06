class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n1=cost[0],n2=cost[1];
        int n3=0,len=cost.length;
        //if the stairs are less than two tehn return the minimum cost between 0th and the 1st stair.
        if (len <= 2) {
            return Math.min(cost[0], cost[1]);
        }
        
        for(int i=2;i<len;i++){
            n3=cost[i]+Math.min(n1,n2);
            n1=n2;
            n2=n3;
        }
        // n1 = n2; n2 = n3;: Update n1 and n2 for the next iteration. n1 now represents the minimum cost to reach the current step, and n2 represents the minimum cost to reach the next step.
        return Math.min(n1,n2);
        // return Math.min(n1, n2);: After the loop, return the minimum cost among the last two steps, as these represent the minimum cost to reach the top of the staircase.
    }
}
