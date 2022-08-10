package repeat;
import java.util.*;
public class Explanation1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = sum+(a*b);
		}
		sc.close();
		if(sum == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
