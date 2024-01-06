class Solution {
    public int climbStairs(int n) {
    //  except for the starting 0,1,2 all other steps
    //    can be obtained by fibonacci series  
        int n1=1,n2=1,steps=0;
        if(n==0 || n==1 || n==2){
            return n;
        }
        else{
            
            for(int i=2;i<=n;i++){
                steps=n1+n2;
                n1=n2;
                n2=steps;
            }
            return steps;
        }

    }
}
