package implementation;

import java.util.*;
public class Explanation_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];

		for(int i=0; i < 28; i++) {
			int score = sc.nextInt();
			student[score] = 1;
		}
		sc.close();
		for(int i = 1; i < student.length; i++) {
			if(student[i] != 1) {
				System.out.println(i);
			}
		}
	}

}
