package implementation;

import java.util.Scanner;

public class Explanation_10768 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		String message = null;
		if(m < 2) {
			message = "Before";
		}else if(m > 2) {
			message = "After";
		}else {
			if(d < 18) {
				message = "Before";
			}else if(d > 18) {
				message = "After";
			}else {
				message = "Special";
			}
		}
		System.out.println(message);
		sc.close();
	}
}
