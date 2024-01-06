class Solution {
    public int fib(int n) {
      // we need to return the fibonacci number that wil occur at position 'n'
        int n1=0,n2=1,fibo=0;
        if(n==0 || n==1 ){
            return n;
        }
        else{
            
            for(int i=2;i<=n;i++){
                fibo=n1+n2;
                n1=n2;
                n2=fibo;
            }
            return fibo;
        }
    }
}
