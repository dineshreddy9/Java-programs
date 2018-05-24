package zeromatrix;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrix {
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
		int[][] matrix2 = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix2[i][j]=1;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					for(int k=0;k<n;k++)
						matrix2[i][k]=0;
					for(int k=0;k<m;k++)
						matrix2[k][j]=0;
				}
				else if(matrix2[i][j]!=0){
					matrix2[i][j]=matrix[i][j];
				}
			}
		}
		printMatrix(matrix2);
	}
	public static void printMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		for(int[] row: mat)
			System.out.println(Arrays.toString(row));
	}
}
