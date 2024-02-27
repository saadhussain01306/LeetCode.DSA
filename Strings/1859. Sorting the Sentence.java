class Solution {
    public String sortSentence(String s) {
        Map<Integer,String>map=new HashMap<>();

        for(String str:s.split(" ")){
            int last_index=str.length()-1;
            int number=str.charAt(last_index)-'0';
            String actual_string=str.substring(0,last_index);

            map.put(number,actual_string);
        }
        

        // return the new string 

        StringBuilder ori_string = new StringBuilder();
       for (Map.Entry<Integer, String> word : map.entrySet()) {
      ori_string.append(word.getValue());
      ori_string.append(" ");
    }

    return ori_string.toString().trim();
    }
}
