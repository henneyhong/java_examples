package first_git.review0409;
//while 과 조건을 이용하여 서로 다른 세 정수 만들기
// 1~10 / 랜덤한 세 정수 만들기
public class int_three {
	public static void main(String[]args) {
		 int a1 = (int)(Math.random()*10)+1;
		 int b1 = (int)(Math.random()*10)+1;
		 int c1 = (int)(Math.random()*10)+1;
		 while(true) {
			if(a1==b1) {
				System.out.println("중복된 숫자");
				break;
			}
			else if(b1==c1) {
					System.out.println("중복된 숫자");	
					break;
			}
			else if(a1==c1) {
				System.out.println("중복된 숫자");
				break;
			}
			else {	
			 System.out.println("첫번째 숫자: "+a1);
			 System.out.println("두번째 숫자: "+b1);
			 System.out.println("세번째 숫자: "+c1);
			 break;
			}
		 //while(true) {
		//if(b1==c1) {
			//	System.out.println("중복된 숫자");	
			
			//}
			//else {
			//	 System.out.println("첫번째 숫자: "+a1);
				// System.out.println("두번째 숫자: "+b1);
				// System.out.println("세번째 숫자: "+c1);
				// break;
				 
			}
			
		 }
		 }
	


