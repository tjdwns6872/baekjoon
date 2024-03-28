package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> max = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			int minus = sc.nextInt();
			int plus = sc.nextInt();
			
			sum += plus;
			sum -= minus;
			max.add(sum);
		}
		System.out.println(Collections.max(max));
		sc.close();
	}
}