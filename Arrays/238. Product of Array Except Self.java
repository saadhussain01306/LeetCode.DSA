class Solution {
    public int[] productExceptSelf(int[] nums) {
      int len=nums.length;
      int ans[] = new int[len];
      int right[] = new int[len];
      int left[] = new int[len];
      left[0]=1;
      right[len-1]=1;

      //calculate the left sum;

      for(int i=1;i<len;i++){
          left[i]=left[i-1]*nums[i-1];
      }

      for(int i=len-2;i>=0;i--){
          right[i]=right[i+1]*nums[i+1];
      }

      for(int i=0;i<len;i++){
          ans[i]=left[i]*right[i];
      }

      return ans;
    }
}
