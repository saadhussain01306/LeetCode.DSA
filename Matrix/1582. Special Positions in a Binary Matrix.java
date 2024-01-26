class Solution {
    public int numSpecial(int[][] mat) {
       int row_len=mat.length;
       int col_len=mat[0].length;

       int row_sum[] = new int[row_len];
       int col_sum[] = new int[col_len];

       for(int i=0;i<row_len;i++){
           for(int j=0;j<col_len;j++){
               row_sum[i]+=mat[i][j];
           }
       } 

       for(int j=0;j<col_len;j++){
           for(int i=0;i<row_len;i++){
               col_sum[j]+=mat[i][j];
           }
       }
       
       int count=0;
       for(int i=0;i<row_len;i++){
           for(int j=0;j<col_len;j++){
               if(mat[i][j]==1 && row_sum[i]==1 && col_sum[j]==1){
                   count++;
               }
           }
       } 

       return count;
      
    }
}
