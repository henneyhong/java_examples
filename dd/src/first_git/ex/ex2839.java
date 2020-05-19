package first_git.ex;

import java.util.Scanner;

public class ex2839 {
public static void main(String[] args) {
	int a=3;
	int b=5;
	
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
	if(N%5==0) {
		System.out.println(N/5);
		return;
	}
	else { 
		int b1 = N/5;
		for( int i = b1; i>0; i--) {
			int Nthree = N-(5*i);
			if(Nthree %3 ==0) {
				System.out.println(i+(Nthree/3));
				return;
			}
	}

}
	if(N%3==0) {
		System.out.println(N/3);
	}
	else {
		System.out.println(-1);
	}
}
}