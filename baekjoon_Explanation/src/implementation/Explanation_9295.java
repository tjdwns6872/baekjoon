package implementation;

import java.util.Scanner;

public class Explanation_9295 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			int sum = 0;
			for(int j = 0; j < 2; j++) {
				int dice = sc.nextInt();
				sum += dice;
			}
			System.out.println("Case "+i+": "+sum);
		}
		sc.close();
	}
}