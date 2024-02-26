class Solution {
    public void setZeroes(int[][] matrix) {
        // we will first mark the first row and first column
        // to get whether they have zeroes

        // later we will look into the inner matrix

        boolean first_row=false,first_col=false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   if(i==0){
                       first_row=true;
                   }
                   if(j==0){
                       first_col=true;
                   }
                   matrix[0][j]=0;
                   matrix[i][0]=0;
                }
            }
        }

        // look into the inner matrix

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        } 

        // we are only left out with the first and second column
        if(first_row){
            //make all columnns in the row to zero
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
       
       if(first_col){
            //make all rows in the col to zero
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}
