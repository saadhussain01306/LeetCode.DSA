class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int ans []=new int[nums.length+1];
       List<Integer> a=new ArrayList<Integer> ();
       for(int i=0;i<nums.length;i++){
           ans[nums[i]]=1;
       }
        for(int j=1;j<ans.length;j++){
            if(ans[j]==0){
                a.add(j);
            }

    }
    return a;
}
}
