package implementation;
/*
동규는 세수를 하다가 정렬이 하고 싶어졌다.

정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.

정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
*/
import java.util.*;
public class Explanation_2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		System.out.println(number[0]+" "+number[1]+" "+number[2]);
		sc.close();
		
	}

}
