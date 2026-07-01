package Recurssion;

public class SudokuSolver {
	public static boolean helper(char[][] board,int row , int col) {
		if(row==board.length) {
			return true;
		}
		int nrow=0;
		int ncol=0;
		if(col!=board[0].length-1) {
		nrow =row;
		ncol=col+1;
		}
		else {		
		nrow=row+1;
		ncol=0;
		}
		if(board[row][col]!='.') {
			if(helper(board, nrow, ncol)) {
				return true;
			}
			}else {
				for(int i=1;i<=9;i++) {
					if(isSafe(board,row,col,i)) {
						board[row][col]=(char)(i+'0');
						if(helper(board, nrow, ncol)) {
							return true;
						}else {
							board[row][col]='.';//backtracking
						}
					}
				}
			}
		
		return false;
	}
	
	public static void solveSudoku(char[][] board) {
		helper(board,0,0);
	}
	public static boolean isSafe(char[][] board,int row,int col,int num) {
		for (int i=0;i<board.length;i++) {
			if(board[row][i]==(char) (num+'0')) {
				return false;
			}
			if(board[i][col]==(char)(num+'0')) {
				return false;
			}
		}
		int gr=(row/3)*3;
		int gc=(col/3)*3;
		for(int i=gr;i<(gr+3);i++) {
			for (int j=gc;j<(gc+3);j++) {
				if(board[i][j]==(char)(num+'0')) {
					return false;
				}
			}
		}
		return true;
	}
	public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("-----------------------");
            }
            for (int j = 0; j < board[0].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print(" | ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
	            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
	            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
	        };

	        System.out.println("Original Puzzle:");
	        printBoard(board);
	        
	        System.out.println("\nSolving...\n");
	        
	        solveSudoku(board);
	        
	        System.out.println("Solved Puzzle:");
	        printBoard(board);
	}

}
