package implementation;

import java.util.Scanner;

public class Explanation_10156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snack = sc.nextInt();
		int count = sc.nextInt();
		int money = sc.nextInt();
		
		int sum = money - (snack*count) > 0 ? 0:Math.abs(money - (snack*count));
		
		System.out.println(sum);
		sc.close();
	}
}
