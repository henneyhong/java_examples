package review0421;

import java.util.Scanner;

//친화수 구하기

public class RelatedMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt(); 	//a 입력값
		int b = sc.nextInt();	//b 입력값
		int na ;
		int nb ; //나누는 값
		int suma =0;		//약수 합
		int sumb = 0;
		//자신의 수를 제외하기 위해 나누는 값을 a보다 작게 , 1부터 증가시키면서 나누기
		for(na=1; na<a; na++) { 
		if((a%na)==0) {
			System.out.print(na+" ,");
			suma = suma + na;
		}
		}
		System.out.println(a+"자신을 제외한 약수의 합은"+suma);
		
		for(nb=1;nb<b;nb++) {
			if((b%nb)==0) {
				System.out.print(nb+" ,");
				sumb = sumb +nb;
			}
		}
		System.out.println(b+"자신을 제외한 약수의 합은"+sumb);
		//친화수 판별
		if(suma==b||sumb==a) {
			System.out.println("친화수이다");
		}
		else {
			System.out.println("친화수가 아니다");
		}
	}
}
