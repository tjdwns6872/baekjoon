package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();
		int x;
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			x = sc.nextInt();
			if(x%2 == 1) {
				num.add(x);
				sum += x;
			}
		}
		sc.close();
		if(num.size() > 0) {
			System.out.println(sum);
			System.out.println(Collections.min(num));
		}else {
			System.out.println(-1);
		}
	}

}
