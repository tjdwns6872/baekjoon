package implementation;
import java.util.*;
public class Explanation_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int y = sc.nextInt();
		for(int i=0; i < n; i++) {
			if(x[i] == y) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
