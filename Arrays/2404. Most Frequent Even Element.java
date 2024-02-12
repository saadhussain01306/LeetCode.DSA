class Solution {
    public int mostFrequentEven(int[] nums) {
        int freq[]=new int[1000001];
        int len=nums.length;
        for(int i:nums){
            freq[i]++;
        }
        int ans=-1;
        int frequency=0
        for(int i=0;i<freq.length;i++){
            if(i%2==0 && frequency<freq[i]){
                frequency=freq[i];
                ans=i;
            }
        }

        return ans;
    }
}
