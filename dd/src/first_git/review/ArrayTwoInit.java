package first_git.review;

import java.util.Arrays;

public class ArrayTwoInit {
	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법1");
		int [][] a= new int [4][3];
			int a1[][]= {
				{1,2,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
			for(int i=0;i<a1.length;i++) {
				System.out.println();
			
				for(int j=0;j<a1[i].length;j++)
			System.out.print(a1[i][j]);
			}
			System.out.println();
			System.out.println("//2차원 배열 방법2");
		int [][] b = {
				{0,0,0,0},
				{0,0,0,0,0},
				{0,0,0}
		};
		for(int q=0;q<b.length;q++) {
			System.out.println();
			for(int p=0;p<b[q].length;p++)
				System.out.print(b[q][p]);
		}
		System.out.println();
		System.out.println("//2차원 배열 방법3");
		int [][]c1 = new int[3][5];
		int [][]c = {
				{1,2,3,4,5},
				{2,3,4,5,6},
				{6,7,8,9,0}
				};
		for(int f=0;f<c.length;f++) {
			System.out.println();
			for(int h=0;h<c[f].length;h++)
				System.out.print(c[f][h]);
		}
		System.out.println();
		System.out.println("copy1");
		int[][]d= Arrays.copyOf(c,c.length);
			for(int f=0;f<d.length;f++) {
			System.out.println();
			for(int h=0;h<d[f].length;h++)
				System.out.print(d[f][h]);
		}
			System.out.println();
			System.out.println("///////////");
		int [][]e = new int[3][5];
			for(int i=0;i<e.length;i++) {
				for( int j=0;j<e[i].length;j++)
				e[i][j]=c[i][j];
			}
	
			for(int i=0;i<e.length;i++) {
				System.out.println();
				for(int j=0;j<e[i].length;j++)
					System.out.print(e[i][j]);
			}		
		
	
	
			}
		}
	
	

