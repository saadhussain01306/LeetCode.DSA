class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int len=grid.length;
        int ans[]=new int[2];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                int k=grid[i][j];
                if(set.contains(k)){
                    ans[0]=k;
                }
               set.add(k);
            }
        }

        for(int i=1;i<=len*len;i++){
            if(!set.contains(i)){
                ans[1]=i;
                break;
            }
        }

        return ans;
    }
}
