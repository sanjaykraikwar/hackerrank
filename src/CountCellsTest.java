import java.util.Scanner;

public class CountCellsTest {
	
	
	/*
	 * 
	 * 5
5
1 0 1 1 0
0 1 0 0 1
1 0 1 1 0
1 0 1 1 0
0 1 0 0 1
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int row,col;
		
		row=scan.nextInt();
		col=scan.nextInt();
		
		int a[][] = new int[row][col];
		
	

	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
	/*	System.out.println("groups");

		int groups = scan.nextInt();
		
		
		int gArr[] = new int[groups];
		for (int i = 0; i < groups; i++) {
			gArr[i] = scan.nextInt();

		}*/


	int count=	countCells(a,row,col);
	
	System.out.println(count);
		
	}
	
	private static int countCells(int [][] matrix,int i,int j) {
		
		if(i<0||j<0||i>=matrix.length||j>=matrix[0].length) {
			return 0;
		}
		if(matrix[i][j]==0)return 0;
		
		int count = matrix[i][j]--;
		count += countCells(matrix,i+1,j) ;
		count += countCells(matrix,i-1,j) ;
		count += countCells(matrix,i,j+1) ;
		count += countCells(matrix,i,j-1) ;
		count += countCells(matrix,i+1,j+1) ;
		count += countCells(matrix,i-1,j-1) ;
		count += countCells(matrix,i-1,j+1) ;
		count += countCells(matrix,i+1,j-1) ;
		return count;
	}

}
