class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        int pivot = 0;
        
        while(row < matrix.length && col >= 0){
            pivot = matrix[row][col];
            if(target == pivot){
                return true;
            }else if(target > pivot){
                
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}
