package first_git.review0413;

public class oddsum {
	public static void main(String[]args) {
	int i;
	int sum= 0; 	//¦�� ��	
	int sum2= 0;	//Ȧ�� ��
	
	for(i=1;i<=100;i++) {
	
	if(i%2==1) {
		sum2+= i;
	}
		else {
			sum+=i;
		}
	}
	System.out.print(sum2);
}
}
