class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>ans=new ArrayList<>();
        int len=candies.length;
        int max=0;
        for(int i=0;i<len;i++){
            max=Math.max(max,candies[i]);
        }
        int sum=0;
        for(int i=0;i<len;i++){
            sum=candies[i]+extraCandies;
            if(sum>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}
