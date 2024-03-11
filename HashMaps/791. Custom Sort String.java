class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c:order.toCharArray()){
            if(map.containsKey(c)){
                int freq=map.get(c);
                while(freq>0){
                    res.append(c);
                    freq--;
                }
                map.remove(c);
            }
        }

        //append remaining entries

        for(HashMap.Entry<Character,Integer> entry: map.entrySet()){
            char ch=entry.getKey();
            int freq1=entry.getValue();
           
           while(freq1>0){
                    res.append(ch);
                    freq1--;
                    }
                    // the loop will end when all the entries in the table are done
        }
       return res.toString();
    }
}
