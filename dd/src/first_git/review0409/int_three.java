package first_git.review0409;
//while �� ������ �̿��Ͽ� ���� �ٸ� �� ���� �����
// 1~10 / ������ �� ���� �����
public class int_three {
	public static void main(String[]args) {
		 int a1 = (int)(Math.random()*10)+1;
		 int b1 = (int)(Math.random()*10)+1;
		 int c1 = (int)(Math.random()*10)+1;
		 while(true) {
			if(a1==b1) {
				System.out.println("�ߺ��� ����");
				break;
			}
			else if(b1==c1) {
					System.out.println("�ߺ��� ����");	
					break;
			}
			else if(a1==c1) {
				System.out.println("�ߺ��� ����");
				break;
			}
			else {	
			 System.out.println("ù��° ����: "+a1);
			 System.out.println("�ι�° ����: "+b1);
			 System.out.println("����° ����: "+c1);
			 break;
			}
		 //while(true) {
		//if(b1==c1) {
			//	System.out.println("�ߺ��� ����");	
			
			//}
			//else {
			//	 System.out.println("ù��° ����: "+a1);
				// System.out.println("�ι�° ����: "+b1);
				// System.out.println("����° ����: "+c1);
				// break;
				 
			}
			
		 }
		 }
	


