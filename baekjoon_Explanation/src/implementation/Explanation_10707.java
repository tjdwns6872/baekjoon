package implementation;

import java.util.Scanner;

public class Explanation_10707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		
		int x = 0, y = b;
		x = p*a;
		if(p > c) {
			y += (p-c)*d;
		}
		System.out.println(x>y?y:x);
		sc.close();
	}
}