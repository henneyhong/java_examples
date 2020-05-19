package review0417;

import java.util.Scanner;

public class OddMagicSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.print("홀수 정수를 입력하세요");
		int n = sc.nextInt();
		int[][]square = new int[n][n];
		int x = 0;				//x축
		int y = n/2;			//y축
		int num = 1;			//숫자
		while (num <=n*n) {
			square[x][y] = num;
			int x2 = x;				//(x,y)로 초기값을 돌려주고 저장
			int y2 = y;
			x--;						//x축으로 한칸 위로 이동					
			y--;						//y축으로 한칸 왼쪽 이동
			if(x<0) {					//윗벽을 넘으면
				x=n-1;					//n-1로 이동
			}
			if(y<0) {					//왼쪽 벽을 넘으면
				y=n-1;					//n-1로 이동
			}
			if(square[x][y]!=0) {		//이동한 위치에 값이 있다면 (x,y)로 돌아 온 후 x칸만 아래로 이동
				x=x2+1;
				y=y2;
			}
			num++;						//숫자 증가
		}
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
}
}
