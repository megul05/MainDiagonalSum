package MainDiagonalSum;

import java.util.Scanner;

public class MainDiagonalSum {
	
	public static int diagonalSum(int[][] mat,int rows,int cols)
	{
		int sum =0;
		for(int i=0;i<rows;i++)
		{
			sum+= mat[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scan.nextInt();
			}
		}
		int result = diagonalSum(mat,rows,cols);
		System.out.println(result);

	}

}
