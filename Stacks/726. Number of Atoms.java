/*
Given a string formula representing a chemical formula, return the count of each atom.

The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.

One or more digits representing that element's count may follow if the count is greater than 1. If the count is 1, no digits will follow.

For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.
Two formulas are concatenated together to produce another formula.

For example, "H2O2He3Mg4" is also a formula.
A formula placed in parentheses, and a count (optionally added) is also a formula.

For example, "(H2O2)" and "(H2O2)3" are formulas.
Return the count of all elements as a string in the following form: the first name (in sorted order), followed by its count (if that count is more than 1), followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.

The test cases are generated so that all the values in the output fit in a 32-bit integer.

 

Example 1:

Input: formula = "H2O"
Output: "H2O"
Explanation: The count of elements are {'H': 2, 'O': 1}.
Example 2:

Input: formula = "Mg(OH)2"
Output: "H2MgO2"
Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
Example 3:

Input: formula = "K4(ON(SO3)2)2"
Output: "K4N2O14S4"
Explanation: The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
 

Constraints:

1 <= formula.length <= 1000
formula consists of English letters, digits, '(', and ')'.
formula is always valid.
*/

class Solution {
    public String countOfAtoms(String formula) {
        int len=formula.length();
        Stack<HashMap<String,Integer>> stack=new Stack<>();

        //initialize with an empty hashmap

        stack.push(new HashMap<>());
        
        int i=0;
        while(i<len){
            char ch=formula.charAt(i);
            if(ch=='('){
                stack.push(new HashMap<>());
                i++;
            }
            else if(ch==')'){
               HashMap<String,Integer> top=stack.pop();
               //pop all the elemnets in the top of the stack
               
               // do not forget to increment the i pointer
               i++;

               //check if there is any integer after the closing braces
               StringBuilder str=new StringBuilder();
               while(i<len && Character.isDigit(formula.charAt(i))){
                  str.append(formula.charAt(i));
                  i++;
               }
               //now all the integers are added to the string now consider the multiplier
               int multiplier=str.length() >0 ? Integer.parseInt(str.toString()):1;

               //now multiply the top stack elemnts with the multiplier
               for(String key:top.keySet()){
                 int value=top.get(key);//returns the value of the string
                 top.put(key,value*multiplier);
               }
               //now append this to the top of the stack
               for(String key:top.keySet()){
                stack.peek().put(key,stack.peek().getOrDefault(key,0)+top.get(key));
                //getOrDefault checks if that key is already available or not
               }

            }

            else{
                StringBuilder entity=new StringBuilder();
                entity.append(formula.charAt(i++));

                //now check for the small letters that continue the uppercase letter
                while(i<len && Character.isLowerCase(formula.charAt(i))){
                    entity.append(formula.charAt(i));
                    i++;
                }

                //now check the for any integers that leades the entity

                StringBuilder num= new StringBuilder();
                 while(i<len && Character.isDigit(formula.charAt(i))){
                  num.append(formula.charAt(i));
                  i++;
               }

               int count=num.length()>0? Integer.parseInt(num.toString()) : 1;//convert the stringuilder to string always
               
               stack.peek().put(entity.toString(),stack.peek().getOrDefault(entity.toString(),0)+count);
            
            }

        }

        // Note:
        TreeMap<String, Integer> sorted_map = new TreeMap<>(stack.peek());
        //used to store the elements of the map insorted manner
         StringBuilder res= new StringBuilder();
        for(String key:sorted_map.keySet()){
          res.append(key);
          if(sorted_map.get(key)>1){
            res.append(sorted_map.get(key));
          }
        }

        return res.toString();

    }
}
