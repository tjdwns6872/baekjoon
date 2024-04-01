package implementation;

import java.util.Scanner;

public class Explanation_2010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			sum += (p-1);
		}
		System.out.println(sum+1);
		sc.close();
	}
}