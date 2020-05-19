package first_git.review0409;

import java.util.ArrayList;
import java.util.List;

//stream을 이용한 1~100까지의 합과 홀수의 합
public class OddNumSum {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i<=100; i++) {
			ilist.add(i);
		}
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합 : "+s);
		s=0;
		s=ilist.stream().filter(i-> i%2==1).reduce(0,Integer::sum);
		System.out.println("1~100사이의 홀수의 합 : "+s);
		s=ilist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
		System.out.println("1~100사이의 홀수의 합 : "+s);
		s=ilist.stream().filter(i-> i%2==0).reduce(0,Integer::sum);
		System.out.println("1~100사이의 짝수의 합 : "+s);
		s=ilist.stream().filter(i->i%2==0).reduce(0, (x,y)->x+y);
		System.out.println("1~100사이의 짝수의 합 : "+s);
		
	}
	
}
