package DSA.skills.Backtracking;

class Solution{

    public boolean isSafe(char[][] board, int row, int col, char dig){
        //horizontal
        for(int j = 0; j < 9; j++){
            if(board[row][j] == dig) return false;
        }

        //vertical
        for(int i = 0; i < 9; i++){
            if(board[i][col] == dig) return false;
        }

        //Grid
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for(int i = srow; i <= srow + 2; i++){
            for(int j = scol; j <= scol + 2; j++){
                if(board[i][j] == dig) return false;
            }
        }

        return true;
    }


    public boolean helper(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9){
            nextRow = row + 1;
            nextCol = 0;
        }

        //if char exists
        if(board[row][col] != '.'){
            return helper(board, nextRow, nextCol);
        }

        //place digit

        for(char dig = '1'; dig <= '9'; dig++){
            if(isSafe(board, row, col, dig)){
                board[row][col] = dig;
                if(helper(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }
    public void sudokuSolver(char[][] board){
        helper(board, 0, 0);
    }
}

public class SudokuSolver {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        sol.sudokuSolver(board);

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
   }
}
