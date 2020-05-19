package review0422;

import java.util.Scanner;

public class HanoiMain {
	int count=0; 
	//��ü Ƚ��
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		������ �� �Է�
		
		HanoiMain hanoi = new HanoiMain();
		
		hanoi.moveHanoi("1","2","3",n);
		
	}
	
	public void moveHanoi(String first, String center, String last, int n) {
//		first : ���ð� �ִ� ��ġ  //center : �߰� // last : ���� �� ��ġ
		
		if( n == 1) {
			++count;
			System.out.println(n+" : "+first + "->" +last);
			
		}else {
			moveHanoi(first, last, center, n-1);
//			last�� center�ڸ��� �ű�鼭 ù��° ž�� �ִ� n-1���� ���ø� �߰����� �̵�
			++count;
			System.out.println(n+" : " + first+ "->"+last);
			moveHanoi(center,first,last,n-1);
//			first�� center�ڸ��� �ű�鼭 �߰� ž�� �ִ� n-1���� ���ø� ���������� �̵�
		}
	}

}
