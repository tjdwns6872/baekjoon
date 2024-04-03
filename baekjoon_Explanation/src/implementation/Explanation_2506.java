package implementation;

import java.util.Scanner;

public class Explanation_2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ox = new int[n];
		int combo = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			ox[i] = sc.nextInt();
			if(ox[i] == 1) {
				combo += 1;
				sum += combo;
			}else {
				combo = 0;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}