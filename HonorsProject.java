import java.util.Scanner;

public class HonorsProject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = "";
		boolean end = true;
		int rows1, columns1, rows2, columns2;
		mainMenu();
		choice = scan.next();
		do {

			switch (choice) {
			case "a": {
				System.out.println("How many rows in your matrix?");
				rows1 = scan.nextInt();
				System.out.println("How many columns in your matrix?");
				columns1 = scan.nextInt();
				Matrix a = new Matrix(rows1, columns1);
				System.out.println("Enter an integer scalar to multiply your matrix by:");
				int scalar = scan.nextInt();
				System.out.println("This is your resulting matrix. If you wish to use it in further \noperations, you will need to enter it again.");
				System.out.println(a.scalarMultiplication(scalar));
				mainMenu();
				choice = scan.next();
				break;
			}
			
			case "b": {
				System.out.println("How many rows in your matrix?");
				rows1 = scan.nextInt();
				System.out.println("How many columns in your matrix?");
				columns1 = scan.nextInt();
				Matrix b = new Matrix(rows1, columns1);
				System.out.println("This is your resulting matrix. If you wish to use it in further \noperations, you will need to enter it again.");
				System.out.println(b.transpose());
				mainMenu();
				choice = scan.next();
				break;
			}
			
			case "c": {
				System.out.println("This function is currently not availabe. Please check back later.");
				mainMenu();
				choice = scan.next();
				break;
			}
			
			case "d": {
				System.out.println("How many rows in your matrices?");
				rows1 = scan.nextInt();
				System.out.println("How many columns in your matrices?");
				columns1 = scan.nextInt();
				TwoMatrix d = new TwoMatrix(rows1, columns1, rows1, columns1);
				System.out.println(d.addition());
				mainMenu();
				choice = scan.next();
				break;
			}
		
			case "e": {
				System.out.println("How many rows in your matrices?");
				rows1 = scan.nextInt();
				System.out.println("How many columns in your matrices?");
				columns1 = scan.nextInt();
				TwoMatrix e = new TwoMatrix(rows1, columns1, rows1, columns1);
				System.out.println(e.subtraction());
				mainMenu();
				choice = scan.next();
				break;
			}
		
			case "f": {
				System.out.println("How many rows in your first matrix?");
				rows1 = scan.nextInt();
				System.out.println("How many columns in your first matrix?");
				columns1 = scan.nextInt();
				System.out.println("How many rows in your second matrix?");
				rows2 = scan.nextInt();
				System.out.println("How many columns in your second matrix?");
				columns2 = scan.nextInt();
				TwoMatrix f = new TwoMatrix(rows1, columns1, rows2, columns2);
				System.out.println(f.multiplication());
				mainMenu();
				choice = scan.next();
				break;
			}
			
			case "g": {
				System.out.println("How many elements are in the dot product vectors?");
				int elements = scan.nextInt();
				TwoMatrix g = new TwoMatrix(1, elements, elements, 1);
				System.out.println(g.dotProduct());
				mainMenu();
				choice = scan.next();
				break;
			}
		
			case "q": {
				System.out.println("Thank you for using the matrix calculator, and have a nice day!");
				end = false;
				break;
			}
			
			default: {
				System.out.println("Please enter a valid menu option.\n");
				mainMenu();
				choice = scan.next();
				break;
			}
			}
			
		} while (end);
		
		
		//scan.close();
	}		

	
	
public static void mainMenu() {
		System.out.println("Welcome to the matrix calculator.");
		System.out.println("Please select a one-matrix operation or a two-matrix operation.");
		System.out.println();
		System.out.println("One-matrix operations:");
		System.out.println("a: scalar multiplication (form n * [A])");
		System.out.println("b: matrix transpose");
		System.out.println("c: determinant (a work in progress)");
		System.out.println();
		System.out.println("Two-matrix operations:");
		System.out.println("d: matrix addition (form [A] + [B])");
		System.out.println("e: matrix subtraction (form [A] - [B])");
		System.out.println("f: matrix multiplication (form [A] * [B])");
		System.out.println("g: vector dot product");
		System.out.println();
		System.out.println("q: quit the program");
		
	}
}	