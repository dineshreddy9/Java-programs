import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrixTwoArrays {
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
		boolean[] row = new boolean[m];
		boolean[] col = new boolean[n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i=0;i<m;i++) {
				if(row[i]==true) {
					for(int k=0;k<n;k++)
						matrix[i][k]=0;
				}
		}
		for(int j=0;j<n;j++) {
				if(col[j]==true) {
					for(int k=0;k<m;k++)
						matrix[k][j]=0;
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
