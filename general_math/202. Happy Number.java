class Solution {
    public boolean isHappy(int n) {
        int result = n;  
          
        while(result != 1 && result != 4){  
            result = happy_check(result);  
        }   
        if(result==1){
            return true;
        }
        else{
            return false;
        }
    }

    int happy_check(int n){
     int rem = 0, sum = 0;  
        while(n != 0){  
            rem = n%10;  
            sum = sum + (rem*rem);  
            n = n/10;  
        }  
        return sum; 
}
}
