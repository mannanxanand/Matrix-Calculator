import java.util.Scanner;

public class Matrix {
	int[][] x;
	int rows, columns;
	
	public Matrix(int rows, int columns) {
		Scanner scan = new Scanner(System.in);
		this.x = new int[rows][columns];
		this.rows = rows;
		this.columns = columns;
		
		for (int i = 0; i < rows; i++) {
			System.out.println("Input elements of row " + (i+1) + " from left to right separated by \"Enter\"");
			for (int j = 0; j < columns; j++) {
				x[i][j] = scan.nextInt();
			}
		}
	}
	
	public String scalarMultiplication(int x) {
		String result = "| ";
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				this.x[i][j] = this.x[i][j] * x;
			}
		}
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				result = result + this.x[i][j] + " ";
			}
			result = result + "|\n| ";
		}	
		result = result.substring(0, result.length()-2);
		return result;
	}
	
	public String transpose() {
		String result = "| ";
		for (int j = 0; j < this.columns; j++) {
			for (int i = 0; i < this.rows; i++) {
				result = result + this.x[i][j] + " ";
			}
			result = result + "|\n| ";
		}	
		result = result.substring(0, result.length()-2);
		return result;
	}
	
}
