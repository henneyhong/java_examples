package review0417;

import java.util.Scanner;

public class OddmabanjinMain {
	public static void main(String[] args) {
	Scanner scann = new Scanner(System.in);
	System.out.println("홀수 정수를 입력하세요");
	int n=scann.nextInt();
	oddMabangjin odd= new oddMabangjin(n);
	odd.make();
	odd.print();
}
}
