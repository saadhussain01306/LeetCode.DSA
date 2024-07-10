class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack s_stack=compute(s);
        Stack t_stack=compute(t);

        return s_stack.equals(t_stack);

    }

    private Stack compute(String str){
        Stack<Character> str_stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='#'){
                if(!str_stack.isEmpty()){
                    str_stack.pop();
                }
            }
            else{
                str_stack.push(c);
            }
        }
        return str_stack;
    }
}
