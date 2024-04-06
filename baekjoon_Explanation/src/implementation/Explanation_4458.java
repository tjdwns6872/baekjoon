package implementation;

import java.util.Scanner;

public class Explanation_4458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1));
		}
		
		sc.close();
	}
}