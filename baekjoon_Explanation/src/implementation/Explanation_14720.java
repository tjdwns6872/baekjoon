package implementation;

import java.util.Scanner;

public class Explanation_14720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int combo = 0;
		
		for(int i = 0; i < n; i++) {
			int milk = sc.nextInt();
			if(combo > 2) {
				combo = 0;
			}
			if(milk == combo) {
				sum += 1;
				combo++;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}