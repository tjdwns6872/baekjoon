package setp_math2;
import java.util.*;
public class explanation2 {
	//2581번 소수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //객체 생성
		int numStart =sc.nextInt(); //시작 번호
		int numStop=sc.nextInt(); //종료 번호
		int min = numStop; //종료 번호 min변수에 저장
		int sum = 0; //소수 합 변수 생성
		sc.close();
		for(int i = numStart; i<=numStop; i++) { //시작 번호부터 종료 번호까지 반복
			int count = 0;	//소수인지 확인 하기 위해 나누어 떨어지는 횟수 계산
			for(int j = 1; j <= i; j++) { //1~부터 i까지 반복
				if(i % j == 0) { //i % j == 0일때 count+1
					count++;
				}
			}
			if(count == 2) { //count가 2일 때 sum에 i 더하기
				sum += i;
				if(min >= i ) { //소수 일때 i가 min보다 작을 때 min에 i대입
					min = i;
				}
			}
		}
		if(sum >= 1) { // sum이 1이상 일 때 sum, min 출력
			System.out.println(sum);
			System.out.println(min);
		}else { //sum이 1보다 작을 때 -1출력
			System.out.println(-1);
		}
	}
}
