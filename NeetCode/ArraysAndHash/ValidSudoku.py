"""
LeetCode: 36. Valid Sudoku
NeetCode: 7/150

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
"""

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        columns = defaultdict(set)
        sub_boxes = defaultdict(set)
        
        for r in range(9):
            for c in range(9):
                if(board[r][c] == "."):
                    continue
                if(board[r][c] in rows[r] or
                  board[r][c] in columns[c] or
                  board[r][c] in sub_boxes[(r//3, c//3)]):
                    return False
                rows[r].add(board[r][c])
                columns[c].add(board[r][c])
                sub_boxes[(r//3, c//3)].add(board[r][c])
                
        return True
