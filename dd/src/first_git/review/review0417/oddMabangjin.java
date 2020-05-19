package review0417;

//������ (0,n/2)���� �����Ѵ�. n�� 3�϶� (0,1)
//���� �帧��(x,y)���� (x-1,y-1)�� �̵��Ѵ�
//������ ������(x-1<0)�عٴ�(n-1)���� �̵��Ѵ�. 
//n=3�϶� �عٴ��� x=2�̴�
//���� ���� ������(y-1)���� ������ (n-1)���� �̵��Ѵ� n=3�϶� ���� �������� y=2�̴�
//���� �帧����(x,y)����() �� �̵������� ()��ġ�� �̹� ���� �ִٸ� 
public class oddMabangjin {
	int n;
	int[][] square;

	public oddMabangjin(int n) {
		this.n = n;
		this.square = new int[n][n];
	}

	public void make() {
		// TODO Auto-generated method stub

		int a = 0; // ��
		int b = 0; // ��
		b = (n - 1) / 2;
		int num = 1;
		square[a][b] = num;

		for (int i = 1; i < n * n; i++) {
			if ((i + 1) % n == 1) {
				a++;
				if (a == n) 
					a = 0;
					square[a][b] = i + 1;
				
			} else {
				a--;
				if (a == -1) 
					a = n - 1;
					b--;
				if (b == -1) 
					b = n - 1;
					square[a][b] = i + 1;
			
			}
		}
}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//	//if(val%n==0) 
////		row++;
////	if(row==n) 
////		row=0;
////		square[row][col] = val+1;
////	}else {
////		row--; 
////		if( row== -1)
////			row = n-1;
////		
////		col--;
////		if(col == -1)
////			col = n-1;
////		square[row][col] = val+1;
////	
////	}
//	
//	void make() {
//		int square[][];
//		int val = 1;
//		int n = 0;
//		int row = 0;
//		int col = 0;
//		
//		col = n/2;
//		square = new int [n][n];
//		while (val <= n*n ) {
//			square[row][col] = val;
//			
//			if(val%n==0) {
//				row++;
//			}else {
//				
//				row--;
//				col++;
//			}
//			
//			if(row <0)
//				row = n-1;
//			if(row >= n)
//				row = 0;
//			if(col <0)
//				col = n-1;
//			if(col >= n)
//				col = 0;
//			val++;
//			}
//
//
//	for( int i = 0; i < n ; i++) {
//		for (int j = 0; j < n; j++) {
//		System.out.print(square[i][j]+" ");
//	}
//		System.out.println();
//	
//		}	
//	}
//}
//	