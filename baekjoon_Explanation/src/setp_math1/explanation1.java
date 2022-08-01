package setp_math1;
import java.util.*;
public class explanation1 {
	public static void main(String[] args) { 
	//2869 달팽이는 올라가고 싶다
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //올라가는 미터
		int b = sc.nextInt(); //미끄러지는 미터
		int v = sc.nextInt(); //나무 막대 미터
		int total = 0;
		int day = 0;
		while(true) {
			day++;
			total += a;
			if(total >= v) {
				break;
			}
			total -= b;
		}
		sc.close();
		System.out.println(day);
	}
}
