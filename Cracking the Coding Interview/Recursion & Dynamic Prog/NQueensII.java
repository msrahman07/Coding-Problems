public class NQueensII {
    public int totalNumberOfQueens = 0;
    
    public int totalNQueens(int n) {
        int[] columns = new int[n];
        
        solveTotalNQueens(0, columns);
        return totalNumberOfQueens;
    }

    void solveTotalNQueens(int row, int[] columns) {
        if(row == columns.length) {
            totalNumberOfQueens++;
        }
        for(int col=0; col<columns.length; col++) {
            if(checkValidity(columns, row, col)) {
                columns[row] = col;
                solveTotalNQueens(row+1, columns);
            }
        }
    }

    boolean checkValidity(int[] columns, int row1, int column1) {
        for(int row2=0; row2<row1; row2++) {
            int column2 = columns[row2];

            // check if another queen is in same column
            if(column1 == column2) return false;

            //check diagonal if queen exists if difference of row equals 
            // to col difference
            if(Math.abs(column2-column1) == (row1-row2)) return false;
        }
        return true;
    }
}
