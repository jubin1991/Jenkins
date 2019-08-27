package Practice;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		
		int m,n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns");
		m = scan.nextInt();
		n = scan.nextInt();
		
		int first[][] = new int [m][n];
		int second[][] = new int [m][n];
		int sum[][] = new int [m][n];
		
		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				first[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix");
		for(int x=0;x<m;x++) {
			for(int y=0;y<n;y++) {
				second[x][y] = scan.nextInt();
			}
		}
		
		for(int r=0;r<m;r++) {
			for(int s=0;s<n;s++) {
				sum[r][s] = first[r][s] + second[r][s];
			}
		}
		
		for(int a=0;a<m;a++) {
			for(int b=0;b<n;b++) {
				System.out.println(sum[a][b]+"\t");
			}
		}
		
		
		
	}
	

}
