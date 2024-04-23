package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> score = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			score.add(sc.nextInt());
		}
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score.get((k-1)));
		sc.close();
	}

}
