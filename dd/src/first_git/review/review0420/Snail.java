package review0420;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		int[][]snail= new int[n][n];
		int num = 1;
		int lastNum = n*n;
		int i = 0;
		int j = 0;
		int width = n;
		int length = n-1;
		
		while(num<=lastNum){
			for(int a = 0;a<width;a++) {
			snail[i][j] = num;
			j++;num++;
			}width--;i++;j--;
			for(int a = 0; a<length; a++) {
				snail[i][j] = num;
				i++; num++;
			}length--;i--;j--;
			for( int a = 0; a<width; a++) {
				snail[i][j] = num;
				j--; num++;
			}width--;i--;j++;
			for(int a  = 0; a<length; a++) {
				snail[i][j] = num;
				i--; num++;
			}length--;i++;j++;
		}
		for(i=0; i<snail.length;i++) {
			for(j=0; j<snail[i].length; j++) {
				System.out.printf("%3d",snail[i][j]);
			}
			System.out.println();
		}
	}
}