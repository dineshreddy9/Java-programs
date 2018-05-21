import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n for n*n matrix");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter elements of the matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Matrix is ");
		printMatrix(matrix);
		if(matrix.length==0)
			System.out.println("There are no elements in the matrix");
		else
			matrixRotate(matrix);
	}

	private static void matrixRotate(int[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		for(int i = 0;i<n/2;i++) {
			int first = i;
			int last = n-1-i;
			for(int j=first;j<last;j++) {
				int offset = j-first;
				int top = matrix[first][j];
				matrix[first][j]=matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[j][last];
				matrix[j][last] = top;
			}
		}
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		for(int[] row: mat)
			System.out.println(Arrays.toString(row));
	}
}
