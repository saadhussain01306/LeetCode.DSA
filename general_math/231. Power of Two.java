
//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        if(n<=0) return false;
        else if((n & (n-1)) == 0){
            
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
