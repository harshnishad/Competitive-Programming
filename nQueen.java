package com.pwSkill;

public class nQueeen {
	public static void printSolution(int[][] board,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isSafe(int[][] board,int row ,int col,int n) {
		int i,j;
		
		//check on left Row
		for(i=0;i<col;i++) {
			if(board[row][i] == 1) {
				return false;
			}
		}
		//check for the upper diagonal in left dirn
		for(i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		//check for the lower diagonal in left dirn
		for(i=row,j=col;i<n&&j>=0;i++,j--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	public static boolean solveQueen(int[][] board,int col,int n) {
		/*
		 * baseCase-if you have placed all the queens them return true
		 * */
		if(col>=n) {
			return true;
		}
		//consider this col and try to place all the queens in all the row one by one
		for(int i=0;i<n;i++) {
			//check if it is safe to place or not
			if(isSafe(board,i,col,n)==true) {
				board[i][col]=1;
			
			//recursive call to place all the queens
			if(solveQueen(board,col+1,n)==true) {
				return true;
			}
			//if placing the queen does not lead to sol then backtrack
			board[i][col]=0;
		}
			
			
		}
		//if its is not possible to place all the queen in any row of the given col return false
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board= {{0,0,0,0},
					    {0,0,0,0},
					    {0,0,0,0},
					    {0,0,0,0}};
		if(solveQueen(board,0,board.length)==true) {
			printSolution(board,board.length);
		}
		else {
			System.out.print("solution not Exist");
		}

	}

}
