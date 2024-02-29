class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int count[] = new int[3];
        
        for (int i : nums) {
            count[i]++;
        }
        
        int index = 0;
        
        for (int i = 0; i < 3; i++) {
            while (count[i] > 0) {
                nums[index++] = i;
                count[i]--;
            }
        }
    }
}

--------------------------------------------------------------------------------------------------------------
// in place solution

class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;

        int start=0,end=len-1,mid=0;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                swap(nums,mid,start);
                start++;
                mid++;
                break;

                case 1:
                mid++;
                break;


                case 2:
                swap(nums,mid,end);
                end--;
                break;
            }
        }
    }

    private void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}
