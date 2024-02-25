class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map= new HashMap<>();
        
        for(String str:strs){
             String s=get_frequency(str);

             if(map.containsKey(s)){
                 map.get(s).add(str);
             }
             else{
                 List<String> str_list=new ArrayList<>();
                 str_list.add(str);
                 map.put(s,str_list);
             }
        }

        return new ArrayList<>(map.values());
        
    }

    private String get_frequency(String s){
        StringBuilder frequencyString = new StringBuilder("");

        int [] freq=new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        char ch='a';

        for(int f:freq){
            frequencyString.append(ch);
            frequencyString.append(f);
            ch++;
        }

        return frequencyString.toString();

    }
}
