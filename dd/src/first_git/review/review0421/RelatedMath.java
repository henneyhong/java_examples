package review0421;

import java.util.Scanner;

//ģȭ�� ���ϱ�

public class RelatedMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int a = sc.nextInt(); 	//a �Է°�
		int b = sc.nextInt();	//b �Է°�
		int na ;
		int nb ; //������ ��
		int suma =0;		//��� ��
		int sumb = 0;
		//�ڽ��� ���� �����ϱ� ���� ������ ���� a���� �۰� , 1���� ������Ű�鼭 ������
		for(na=1; na<a; na++) { 
		if((a%na)==0) {
			System.out.print(na+" ,");
			suma = suma + na;
		}
		}
		System.out.println(a+"�ڽ��� ������ ����� ����"+suma);
		
		for(nb=1;nb<b;nb++) {
			if((b%nb)==0) {
				System.out.print(nb+" ,");
				sumb = sumb +nb;
			}
		}
		System.out.println(b+"�ڽ��� ������ ����� ����"+sumb);
		//ģȭ�� �Ǻ�
		if(suma==b||sumb==a) {
			System.out.println("ģȭ���̴�");
		}
		else {
			System.out.println("ģȭ���� �ƴϴ�");
		}
	}
}
