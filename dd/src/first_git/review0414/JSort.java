package first_git.review0414;

public class JSort {
	public static void BubbleSort(int[]n) {
		for(int i=0; i<n.length;i++) {
			for(int j=0;j<n.length-1-i;j++) {
				if (n[j] > n[j+1]){
					 int temp = n[j+1];
					 n[j+1] = n[j];
					 n[j] = temp;
				}
			}
		}
	}
	
	public static void print(int[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}
