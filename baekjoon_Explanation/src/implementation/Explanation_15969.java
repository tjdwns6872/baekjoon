package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		List<Integer> score = new ArrayList<Integer>();
		
		for(int i = 0; i < student; i++) {
			score.add(sc.nextInt());
		}
		System.out.println(Collections.max(score)-Collections.min(score));
		
		sc.close();
	}

}
