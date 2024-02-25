class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list= new ArrayList<>();
        String prev="";
        for(String s:words){
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(!str.equals(prev)){
                list.add(s);
                prev=str;
            }
        }

        return list;
    }
}
