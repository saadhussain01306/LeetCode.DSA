class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
         int len=salary.length;
        for(int i=0;i<len;i++){
            if(max<salary[i]){
                max=salary[i];
            }
            if(min>salary[i]){
                min=salary[i];
            }
        }

        double count=0,sum=0;
        for(int i=0;i<len;i++){
            if(salary[i]!=max && salary[i]!=min){
                sum+=salary[i];
                count=count+1;
            }
        }
        return (sum/count);
    }
}
