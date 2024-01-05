class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1=num;
        int rev_num1=0;
        int sum1=0;
        while(temp1!=0){
            sum1=temp1%10;
            rev_num1=rev_num1*10+sum1;
            temp1=temp1/10;
        }
        
        int temp2=rev_num1;
        int rev_num2=0;
        int sum2=0;
        while(temp2!=0){
            sum2=temp2%10;
            rev_num2=rev_num2*10+sum2;
            temp2=temp2/10;
        }

        if(rev_num2==num){
            return true;
        }
        else{
            return false;
        }
    }
}
