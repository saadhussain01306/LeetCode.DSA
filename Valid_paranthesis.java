public class Solution {
   public boolean isValid(String s) {
      int len=s.length(); 
      char [] a= s.toCharArray();
      if(len==0) return true; 
      Stack<Character> st=new Stack<Character>(); 
      for(int i=0; i<len; i++)
      {
        if(a[i]=='(' || a[i]=='{' || a[i]=='[' )
        {
          st.push(a[i]);
        }
        if(a[i]==')' ||a[i]=='}' || a[i]==']')
        {
          if(st.isEmpty()) return false; 
          char temp=st.pop(); 
          if((temp=='(' && a[i]==')' ) || (temp=='{' && a[i]=='}' ) ||(temp=='[' && a[i]==']' )  )
          {
              continue;
          }else
          {
              return false; 
          }
        }
      }
      if(!st.isEmpty()) return false; 
      return true;        
    }
}
