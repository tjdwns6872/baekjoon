package implementation;

import java.util.Scanner;

public class Explanation_13752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] num = new int[k];
		for(int i = 0; i < k; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < num[i]; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		sc.close();
	}
}
