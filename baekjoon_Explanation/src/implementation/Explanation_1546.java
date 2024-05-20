package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> score = new ArrayList<Integer>();
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			score.add(sc.nextInt());
		}
		for(int i = 0; i < score.size(); i++) {
			double temp = ((double)score.get(i)/Collections.max(score))*100;
			sum += temp;
		}
		System.out.println(sum/n);
		sc.close();
	}

}