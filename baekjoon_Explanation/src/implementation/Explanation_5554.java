package implementation;

import java.util.Scanner;

public class Explanation_5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sec = new int[4];
		int sum = 0;
		for(int i = 0; i < sec.length; i++) {
			sec[i] = sc.nextInt();
			sum += sec[i];
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
		
		sc.close();
	}

}
