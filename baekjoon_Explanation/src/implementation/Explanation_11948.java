package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> score1 = new ArrayList<Integer>();
		List<Integer> score2 = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < 6; i++) {
			int num = sc.nextInt();
			if(i <= 3) {
				score1.add(num);
			}else {
				score2.add(num);
			}
		}
		int min1 = Collections.min(score1);
		score1.remove(score1.indexOf(min1));
		for(int i = 0; i < 3; i++) {
			sum += score1.get(i);
		}
		sum += Collections.max(score2);
		System.out.println(sum);
		sc.close();
	}
}