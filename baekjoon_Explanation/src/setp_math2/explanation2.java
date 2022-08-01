package setp_math2;
import java.util.*;
public class explanation2 {
	//2581번 소수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numStart =sc.nextInt();
		int numStop=sc.nextInt();
		int min = numStop;
		int sum = 0;
		sc.close();
		for(int i = numStart; i<=numStop; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				sum += i;
				if(min >= i ) {
					min = i;
				}
			}
		}
		if(sum >= 1) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
	}
}
