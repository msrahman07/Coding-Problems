package programming.problems;

public class TicTacToe {
    public String tictactoe3x3(int[][] moves) {
        char[][] board = new char[3][3];
        for(int i=0; i<moves.length; i++) {
            if(i%2==0) {
                board[moves[i][0]][moves[i][1]] = 'A';
            } else {
                board[moves[i][0]][moves[i][1]] = 'B';
            }
        }
        for(int i=0; i<board.length; i++) {
            // check horizontal
            if(checkBoard3x3(board[i][0], board[i][1], board[i][2])) {
                return String.valueOf(board[i][0]);
            }
            // check vertical
            if(checkBoard3x3(board[0][i], board[1][i], board[2][i])) {
                return String.valueOf(board[0][i]);
            }
            // check diagonal
            if(checkBoard3x3(board[0][0], board[1][1], board[2][2])) {
                return String.valueOf(board[1][1]);
            }
            if(checkBoard3x3(board[0][2], board[1][1], board[2][0])) {
                return String.valueOf(board[1][1]);
            }
        }
        return moves.length==9 ? "Draw" : "Pending";
    }
    private boolean checkBoard3x3(char p1, char p2, char p3) {
        if(p1 != 'A' && p1 != 'B') {
            return false;
        }
        return p1 == p2 && p2 == p3;
    }
}
