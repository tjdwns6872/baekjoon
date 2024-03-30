package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum = 0;
			for(int j = 0; j < 4; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			result.add(sum);
		}
		int max = Collections.max(result);
		System.out.println((result.indexOf(max)+1)+" "+max);
		sc.close();
	}
}