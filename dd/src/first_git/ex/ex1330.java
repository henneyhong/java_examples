package first_git.ex;

import java.util.Scanner;

public class ex1330 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		
		if(A>B) {
			System.out.print(">");
		}
		else if(A<B) {
			System.out.print("<");
		}
		else {
			System.out.print("=");
		}
	}
}
