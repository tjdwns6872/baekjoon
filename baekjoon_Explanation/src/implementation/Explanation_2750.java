package implementation;
import java.util.*;
public class Explanation_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i] > a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
