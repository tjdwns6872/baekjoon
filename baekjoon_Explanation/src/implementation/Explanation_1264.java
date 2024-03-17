package implementation;

import java.util.Scanner;

public class Explanation_1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			int count = 0;
			if(str.equals("#")) {
				break;
			}
			String temp = str.toLowerCase();
			for(int i = 0; i < str.length(); i++) {
				if(temp.charAt(i) == 'a' || temp.charAt(i) =='e' || temp.charAt(i) == 'i' || temp.charAt(i) == 'o' || temp.charAt(i) == 'u') {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}