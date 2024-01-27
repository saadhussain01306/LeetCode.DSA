class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
      for(int i =1;i<=n;i++){
            int cur = i;
            int count = 0 ;
            while(cur != 0){ 
                cur = cur & (cur-1);
                count++;
            }
            ans[i] = count;
        }
        

        return ans;
    }
}
