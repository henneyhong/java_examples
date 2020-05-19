package ex;
import java.util.Scanner;

public class ex14681 {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int x = sc.nextInt();
		final int y = sc.nextInt();
		if (x > 0) {
			if (y > 0) {
				System.out.print("1");
			} else {
				System.out.print("4");
			}
		} else {
			if (y > 0) {
				System.out.print("2");
			} else {
				System.out.print("3");
			}

		}
	}
}
