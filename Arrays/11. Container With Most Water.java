class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int max_area=Integer.MIN_VALUE;

        // area = height*width;

        while(left<right){
          int area=Math.min(height[right],height[left])*(right-left);
          max_area=Math.max(max_area,area);

          if(height[left]>height[right]){
              // if left height is larger than left move right one point left
              right--;
          }
          else{
              // if right height is larger than left move right one point right
              left++;
          }

        }

        return max_area;
    }
}
