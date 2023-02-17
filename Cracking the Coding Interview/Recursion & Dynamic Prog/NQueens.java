import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    /**
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> results = new ArrayList<List<String>>();
        String[][] board = new String[n][n];
        int[] columns = new int[n]; // keeping track of the queens in which column

        for(String[] row : board) {
            Arrays.fill(row, ".");
        }
        placeQueens(0, board, columns, results);
        return results;
    }
    void placeQueens(int row, String[][] board, int[] columns, ArrayList<List<String>> results){
        if(row == board.length) {
            ArrayList<String> currentResult = new ArrayList<String>();
            for(String[] rows : board) {
                currentResult.add(String.join("", rows));
            }
            results.add(List.copyOf(currentResult));
        } else {
            for(int col = 0; col < board.length; col++) {
                if(checkValid(columns, row, col)) {
                    board[row][col] = "Q";
                    columns[row] = col;
                    placeQueens(row+1, board, columns, results);
                    board[row][col] = ".";
                    columns[row] = -1;
                }
            }
        }
    }
    boolean checkValid(int[] columns, int row1, int column1) {
        for(int row2=0; row2 < row1; row2++) {
            // position of queen (column number) in row2
            int column2 = columns[row2];

            if(column2 == column1) return false; // two queens in same column

            // check diagonal. if difference between two rows are equal 
            // to difference between two columns, then they are diagonal
            if(Math.abs(column2-column1) == (row1 - row2)) return false;
        }
        return true;
    }
}
