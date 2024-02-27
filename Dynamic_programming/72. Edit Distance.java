class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int[][] edit =new int[m+1][n+1];

        // initialize edit matrix
        for(int i=0;i<=m;i++){
             edit[i][0]=i;
             //edit row of first row
        }

        for(int j=0;j<=n;j++){
            edit[0][j]=j;
            //edit first column
        }

    
         // now fill the matrix by comparing the min values between left,top & top_left;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    edit[i][j]=edit[i-1][j-1];
                    //copy from the top left
                }
                else{
                    int left=edit[i][j-1];
                    int top=edit[i-1][j];
                    int top_left=edit[i-1][j-1];

                    edit [i][j]=Math.min(left,Math.min(top_left,top))+1;//minmum between the three
                }
            }
        }
       return edit[m][n];    
    }


}
