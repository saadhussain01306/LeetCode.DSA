class Solution {
    public int maxSubArray(int[] n) {
        int max_so_far=n[0];
        int cur_max=n[0];

        for(int i=1;i<n.length;i++){
            cur_max=Math.max(n[i],n[i]+cur_max);

            max_so_far=Math.max(max_so_far,cur_max);
        }

        return max_so_far;
    }
}
