package implementation;

import java.util.Scanner;

public class Explanation_7567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int sum = 10;
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i-1) == str.charAt(i)) {
				sum += 5;
			}else {
				sum += 10;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}