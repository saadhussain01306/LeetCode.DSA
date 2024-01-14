class Solution {
    public int countSegments(String s) {

        s=s.trim();
        
         String[] str=s.split(" ");
         int count=0;

         for(String st:str){
              if(!st.isEmpty()){
                  count++;
              }
         }

         return count;


    }
}
