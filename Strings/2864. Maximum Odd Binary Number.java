class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        int len=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1'){
                count=count+1;
            }
        }

        if(count==0){
            return "";
        }
       
       for(int i=0;i<count-1;i++){
           res.append(1);
       }

       for(int i=count;i<len;i++){
           res.append(0);
       }

       res.append(1);//last bit should be 1

       return res.toString();
        
    }
}
