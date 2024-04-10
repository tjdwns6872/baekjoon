package implementation;

import java.util.Scanner;

public class Explanation_9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int sum = 0;
			for(int j = 0; j < t; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}