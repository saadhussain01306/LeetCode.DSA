class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ans[]=new int[2];
        int m=mat.length;
        int n=mat[0].length;

        int count=0;
        int max=0;

        for(int i=0;i<m;i++){
            count=0;
            for(int j=0;j<n;j++){
               if(mat[i][j]==1){
                   count++;
               } 
            }

            if(count>max){
                max=count;
                ans[0]=i;
                ans[1]=max;
            }
        }

        return ans;

    }
}
