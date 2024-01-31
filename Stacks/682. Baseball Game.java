class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();

        for(String s:operations){
            if(s.equals("+")){
                stack.push(stack.peek()+stack.elementAt(stack.size()-2));
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        int goal=0;

        for(int i:stack){
            goal+=i;
        }

        return goal;
    }
}
