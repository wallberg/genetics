package org.wallberg.genetics;

public class Grid {

	private Square[][] grid = null;
	private int rows;
	private int cols;
	
	public Grid(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		grid = new Square[rows][cols];
		
		for (int row=0; row < rows; row++) {
			for (int col=0; col < cols; col++) {
				 grid[row][col] = new Square();
			}
		}
	}
	
	public Square getSquare(int row, int col) {
		return grid[row][col];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
	
	
}
