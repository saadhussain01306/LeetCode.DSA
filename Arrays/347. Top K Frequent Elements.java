class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[]=new int[k];
        int count=0;

        for(int index=bucket.length-1;index>=0 && count<k;index--){
            if(bucket[index]!=null){
                for(Integer num:bucket[index]){
                    res[count++]=num;
                }
            }
        }

        return res;

    }
}
