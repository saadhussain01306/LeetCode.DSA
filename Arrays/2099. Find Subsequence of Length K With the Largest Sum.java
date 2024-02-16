class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
       List<Integer> v=new ArrayList<>(); 
        for(int x:nums){
            pq.add(x);
            v.add(x);
        }
        
        int[] ans=new int[k];
        
        for(int i=0;i<nums.length-k;i++)
            v.remove(pq.remove());
        
        for(int i=0;i<k;i++)
            ans[i]=v.get(i);
        
        return ans;
    }
}
