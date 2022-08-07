package setp_math1;
import java.util.*;
public class explanation2 {
	public static void main(String[] args) {
		//10250번 문제
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //테스트 케이스
		
		for(int test = 1; test <= t; test++) { //입력 받은 테스트 케이스 횟수 만큼 반복
			int h = sc.nextInt(); //호텔의 층
			int w = sc.nextInt(); //호텔의 호
			int n = sc.nextInt(); //호텔에 묵을 사람의 명
			
			if(n % h == 0) { 
				// 사람 % 층 이 0일 경우는 층수와 사람이 배수의 관계일 때 나타납니다.
				//ex : 10층 높이에 호텔에서 10명 째 손님이 묵어야 할 때 10층이 나와야 하지만
				//n % h가 0이므로 0층이 나오게 되기 때문에 이 경우 n%h가 아닌 h에 100을
				//곱하여 층수를 구합니다
				System.out.println((h * 100)+(n/h));
			}else {
				//명 % 층은 층 수를 나타내기 때문에 곱하기 100을 하여 정확한 층수를 구하고
				//명 / 층 수는 호수를 나타내지만 호텔은 0호가 없기 때문에 +1를 합니다
				System.out.println(((n % h)*100)+(n/h+1));
			}
		}
		sc.close();
	}
}