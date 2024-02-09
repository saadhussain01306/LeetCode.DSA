class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] str=s.split("");

        String goal="";

        for(int i=str.length-1;i>0;i--){
           goal+=str[i]+" ";
        }

        return goal+str[0];
        
    }
}
