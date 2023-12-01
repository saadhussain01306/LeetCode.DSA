class Solution {
    public String largestOddNumber(String num) {
       int l=num.length();
       for(int i=l-1;i>=0;i--){
           char c=num.charAt(i);
           int dig=c -'0';
           if(dig%2!=0){
               return num.substring(0,i+1);
               /*(i+1) cuz substring excludes the 
               terminating character i.e  iterates only upto
               i*/
           }
       }
       return ""; 
    }
}
