//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
       
        if(n==0) return 0;
        
        int position=1;
        while((n & 1)!=1){
            n=n>>1;
            position++;
        }
        return position;
    }
}
