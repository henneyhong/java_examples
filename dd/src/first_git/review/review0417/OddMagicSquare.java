package review0417;

import java.util.Scanner;

public class OddMagicSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.print("Ȧ�� ������ �Է��ϼ���");
		int n = sc.nextInt();
		int[][]square = new int[n][n];
		int x = 0;				//x��
		int y = n/2;			//y��
		int num = 1;			//����
		while (num <=n*n) {
			square[x][y] = num;
			int x2 = x;				//(x,y)�� �ʱⰪ�� �����ְ� ����
			int y2 = y;
			x--;						//x������ ��ĭ ���� �̵�					
			y--;						//y������ ��ĭ ���� �̵�
			if(x<0) {					//������ ������
				x=n-1;					//n-1�� �̵�
			}
			if(y<0) {					//���� ���� ������
				y=n-1;					//n-1�� �̵�
			}
			if(square[x][y]!=0) {		//�̵��� ��ġ�� ���� �ִٸ� (x,y)�� ���� �� �� xĭ�� �Ʒ��� �̵�
				x=x2+1;
				y=y2;
			}
			num++;						//���� ����
		}
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
}
}
