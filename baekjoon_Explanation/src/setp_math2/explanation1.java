package setp_math2;
import java.util.*;
public class explanation1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			int sum = 0;
			int number = sc.nextInt();
			for(int j = 1; j <= number; j++) {
				if(number % j == 0) {
					sum++;
				}
			}
			if(sum == 2) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}