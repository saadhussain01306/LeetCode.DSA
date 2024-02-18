class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();//trim leading and trailing spaces;
       String[] word = s.split(" ");//split the  string into words

       //check whether the input string s is empty
       if(word.length==0){
           return 0;
       }

       String last_word=word[word.length-1];
       return last_word.length();
       
    }
}
