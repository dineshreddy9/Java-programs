import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrixConstantSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m,n for m*n matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		System.out.println("Enter elements of the matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Matrix is ");
		printMatrix(matrix);
		if(matrix.length==0)
			System.out.println("There are no elements in the matrix");
		else
			zeroMatrix(matrix,m,n);
	}
	private static void zeroMatrix(int[][] matrix,int m, int n) {
		// TODO Auto-generated method stub
		boolean firstRowZero = false;
		boolean firstColZero = false;
		for(int i=0;i<n;i++) {
			if(matrix[0][i]==0) {
				firstRowZero = true;
			}
		}
		for(int i=0;i<m;i++) {
			if(matrix[i][0]==0) {
				firstColZero=true;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		for(int i=1;i<m;i++) {
			if(matrix[i][0]==0) {
				for(int j=0;j<n;j++) {
					matrix[i][j]=0;
				}
			}
		}
		for(int j=1;j<n;j++) {
			if(matrix[0][j]==0) {
				for(int i=0;i<m;i++) {
					matrix[i][j]=0;
				}
			}
		}
		if(firstRowZero) {
			for(int j=0;j<n;j++)
				matrix[0][j]=0;
		}
		if(firstColZero) {
			for(int i=0;i<m;i++)
				matrix[i][0]=0;
		}
		printMatrix(matrix);
	}
	public static void printMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		for(int[] row: mat)
			System.out.println(Arrays.toString(row));
	}
}
