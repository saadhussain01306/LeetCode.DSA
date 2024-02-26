class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=search_potential_row_index(matrix,target);
        if(row!=-1){
            return search_in_potential_row(matrix,target,row);
        }
        else{
            return false;
        }
    }

    private int search_potential_row_index(int[][]matrix,int target){
        int low=0;
        int high=matrix.length-1;
        int col=matrix[0].length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[mid][0]<=target && target<=matrix[mid][col]){
             return mid;

            } 

            else if(target>matrix[mid][0]){
                low=mid+1;
            }

            else if(target<matrix[mid][0]){
                 high=mid-1;
            }
            
       }

       return -1;
    }

    private boolean search_in_potential_row(int[][] matrix,int target,int row){
        int low=0;
        int high=matrix[row].length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==matrix[row][mid]){
                return true;
            }
            else if(target>matrix[row][mid]){
                low=mid+1;
            }
             else if(target<matrix[row][mid]){
                 high=mid-1;
            }

        }

        return false;
    }
}
