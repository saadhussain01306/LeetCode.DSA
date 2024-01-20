class Solution {
    public int numberOfMatches(int n) {
        int goal=0;
        while(n!=1){
            if(n%2==0){
                goal+=n/2;
                n=n/2;
            }

            else{
                goal+=(n-1)/2;
                n=(n - 1) / 2 + 1;
            }
        }
        return goal;
    }
}
