class Solution {
    public int maxFrequencyElements(int[] nums) {
       int max=0;
       int count=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
           map.put(n,map.getOrDefault(n,0)+1);
       } 
       
       for(int n:map.values()){
          max=Math.max(n,max);
       }
       

       for(int freq:map.values()){
           if(freq==max){
               count+=freq;
           }
       }

       return count;
    }
}
