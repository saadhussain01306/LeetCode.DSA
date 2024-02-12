class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int len=hours.length;
        int count=0;
        for(int i=0;i<len;i++){
           if(hours[i]>=target){
               count++;
           } 
           else{
               continue;
           }
        }

        return count;
    }
}
