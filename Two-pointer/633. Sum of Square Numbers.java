class Solution {
    public boolean judgeSquareSum(int c) {

        if(c<0){
            return false;
        }
        long right=(int)Math.sqrt(c);
        long left=0;

        while(left<=right){
            long sum=(left*left)+(right*right);

            if(sum==c){
                return true;
            }
            else if(sum>c){
                right--;
            }
            else{
                left++;
            }
        }

        return false;

    }
}
