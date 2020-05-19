package ex;

import java.util.Scanner;

public class ex1012 {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		int Num = N.nextInt();
		int First = Num/10;
		int Second = Num%10;
		int add = 0;
		int count = 0;
		while(true) {
			count ++;
			add = Second;
			Second = (First+Second)%10;
			First = add;
			if(Num == First*10+Second);
				break;
		}
		System.out.println(count);
	}
}
