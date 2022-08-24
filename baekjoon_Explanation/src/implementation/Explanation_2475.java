package implementation;

import java.util.Scanner;
public class Explanation_2475 {
	public static void main(String[] args) {
		int[] num = new int[5];
		int total = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			total += (num[i] * num[i]); 
		}
		System.out.println(total%10);
		sc.close();
	}
}
