package review0422;

import java.util.Scanner;

public class HanoiMain {
	int count=0; 
	//전체 횟수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		접시의 수 입력
		
		HanoiMain hanoi = new HanoiMain();
		
		hanoi.moveHanoi("1","2","3",n);
		
	}
	
	public void moveHanoi(String first, String center, String last, int n) {
//		first : 접시가 있던 위치  //center : 중간 // last : 접시 갈 위치
		
		if( n == 1) {
			++count;
			System.out.println(n+" : "+first + "->" +last);
			
		}else {
			moveHanoi(first, last, center, n-1);
//			last를 center자리로 옮기면서 첫번째 탑에 있는 n-1개의 접시를 중간으로 이동
			++count;
			System.out.println(n+" : " + first+ "->"+last);
			moveHanoi(center,first,last,n-1);
//			first를 center자리로 옮기면서 중간 탑에 있는 n-1개의 접시를 마지막으로 이동
		}
	}

}
