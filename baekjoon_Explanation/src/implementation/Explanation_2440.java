package implementation;

import java.util.Scanner;

public class Explanation_2440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
