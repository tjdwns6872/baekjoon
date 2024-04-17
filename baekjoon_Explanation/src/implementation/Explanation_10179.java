package implementation;

import java.util.Scanner;

public class Explanation_10179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			double money = sc.nextDouble();
			double result = money-(money*0.2);
			System.out.println(String.format("$%.2f", result));
		}
		sc.close();
	}
}