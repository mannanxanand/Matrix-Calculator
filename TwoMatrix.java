import java.util.Scanner;

public class TwoMatrix {
	int[][] x, y;
	int rowsx, columnsx, rowsy, columnsy;
	
	public TwoMatrix(int rows1, int columns1, int rows2, int columns2) {
		Scanner scan = new Scanner(System.in);
		this.x = new int[rows1][columns1];
		this.y = new int[rows2][columns2];
		this.rowsx = rows1;
		this.columnsx = columns1;
		this.rowsy = rows2;
		this.columnsy = columns2;
		
		for (int i = 0; i < rows1; i++) {
			System.out.println("Input elements of row " + (i+1) + " from left to right separated by \"Enter\"");
			for (int j = 0; j < columns1; j++) {
				x[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < rows2; i++) {
			System.out.println("Input elements of row " + (i+1) + " from left to right separated by \"Enter\"");
			for (int j = 0; j < columns2; j++) {
				y[i][j] = scan.nextInt();
			}
		}
	}

	public String multiplication() {
		String result = "";
		int[][] temp = new int[this.rowsx][this.columnsy];
		//a,b are result row,column values
		//i,j are x row,column values
		//k,l are y row,column values
		int a=0, b=0, i=0, j=0, k=0, l=0;
		if (this.rowsx != this.columnsy) {
			result = "Your matrix dimensions do not match. Your first matrix must have the \nsame number of of columns as your second matrix has rows.";
			return result;
		}
		else {
			while (i < this.rowsx) {
				while (l < this.columnsy) {
					while (j < this.columnsx && k < this.rowsy) {
						temp[a][b] = this.x[i][j]*this.y[k][l];
						j++;
						k++;
					}
					j=0;
					k=0;
					l++;
					b++;
				}
				l=0;
				b=0;
				i++;
				a++;
			}	
		}
		result = result + "This is your resulting matrix. If you wish to use it in further \noperations, you will need to enter it again.\n| ";
		for (int s = 0; s < temp.length; s++) {
			for (int t = 0; t < temp[0].length; t++) {
				result = result + temp[s][t] + " ";
			}
			result = result + "|\n| ";
		}	
		result = result.substring(0, result.length()-2);
		return result;
	}

	public String dotProduct() {
		String result = "The dot product of your vectors is ";
		int dotProduct = 0;
		
		int i=0, j=0, k=0, l=0;
		
		while (j < this.columnsx && k < this.rowsy) {
			dotProduct = dotProduct + this.x[i][j]*this.y[k][l];
			j++;
			k++;
		}
		result = result + dotProduct;
		return result;
	}
	
	public String addition() {
		String result = "";
		int[][] temp = new int[this.rowsx][this.columnsx];
		int a=0, b=0, i=0, j=0, k=0, l=0;
		while (i < this.rowsx) {
			while (j < this.columnsx) {
				temp[a][b] = this.x[i][j] + this.y[k][l];
				b++;
				j++;
				l++;
			}
			b=0;
			j=0;
			l=0;
			a++;
			i++;
			k++;
		}
		result = result + "This is your resulting matrix. If you wish to use it in further \noperations, you will need to enter it again.\n| ";
		for (int s = 0; s < temp.length; s++) {
			for (int t = 0; t < temp[0].length; t++) {
				result = result + this.x[s][t] + " ";
			}
			result = result + "|\n| ";
		}	
		result = result.substring(0, result.length()-2);
		return result;
	}

	public String subtraction() {
		String result = "";
		int[][] temp = new int[this.rowsx][this.columnsx];
		int a=0, b=0, i=0, j=0, k=0, l=0;

		while (i < this.rowsx) {
			while (j < this.columnsy) {
				temp[a][b] = this.x[i][j] - this.y[k][l];
				b++;
				j++;
				l++;
			}
			b=0;
			j=0;
			l=0;
			a++;
			i++;
			k++;
		}
		result = result + "This is your resulting matrix. If you wish to use it in further \noperations, you will need to enter it again.\n| ";
		for (int s = 0; s < temp.length; s++) {
			for (int t = 0; t < temp[0].length; t++) {
				result = result + this.x[s][t] + " ";
			}
			result = result + "|\n| ";
		}	
		result = result.substring(0, result.length()-2);
		return result;
	}

}