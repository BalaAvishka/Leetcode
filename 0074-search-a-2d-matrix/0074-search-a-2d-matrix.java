class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {        int norows=matrix.length;
        int nocols=matrix[0].length;
        for(int row=0;row<norows;row++)
        {
              for(int col=0;col<nocols;col++)
              {
                if(matrix[row][col]==target)
                return true;
              }
        }
        return false;
    }
}