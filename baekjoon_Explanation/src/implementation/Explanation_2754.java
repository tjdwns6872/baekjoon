package implementation;
/*
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
A+: 4.3, A0: 4.0, A-: 3.7
B+: 3.3, B0: 3.0, B-: 2.7
C+: 2.3, C0: 2.0, C-: 1.7
D+: 1.3, D0: 1.0, D-: 0.7
F: 0.0
*/
import java.util.*;
public class Explanation_2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rating = sc.next();
		double score;
		if(rating.length() == 1) {
			score = 0.0;
		}else {
			if((byte)rating.charAt(0) == 65) {
				score = 4;
			}else if((byte)rating.charAt(0) == 66) {
				score = 3;
			}else if((byte)rating.charAt(0) == 67) {
				score = 2;
			}else {
				score = 1;
			}
			
			if(rating.charAt(1) == '+') {
				score += 0.3;
			}else if(rating.charAt(1) == '-') {
				score -= 0.3;
			}
		}
		System.out.println(score);
		sc.close();
	}

}
