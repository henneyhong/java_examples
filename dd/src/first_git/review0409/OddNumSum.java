package first_git.review0409;

import java.util.ArrayList;
import java.util.List;

//stream�� �̿��� 1~100������ �հ� Ȧ���� ��
public class OddNumSum {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i<=100; i++) {
			ilist.add(i);
		}
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~100�� �� : "+s);
		s=0;
		s=ilist.stream().filter(i-> i%2==1).reduce(0,Integer::sum);
		System.out.println("1~100������ Ȧ���� �� : "+s);
		s=ilist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
		System.out.println("1~100������ Ȧ���� �� : "+s);
		s=ilist.stream().filter(i-> i%2==0).reduce(0,Integer::sum);
		System.out.println("1~100������ ¦���� �� : "+s);
		s=ilist.stream().filter(i->i%2==0).reduce(0, (x,y)->x+y);
		System.out.println("1~100������ ¦���� �� : "+s);
		
	}
	
}
