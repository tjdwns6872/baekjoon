package implementation;

import java.util.Scanner;

public class Explanation_1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {			
			String num = sc.next();
			if(num.equals("0")) {
				break;
			}
			int sum = 0;
			for(int i = 0; i < num.length(); i++) {
				if(num.charAt(i) == '1') {
					sum += 2;
				}else if(num.charAt(i) == '0') {
					sum += 4;
				}else {
					sum += 3;
				}
			}
			System.out.println(sum+num.length()+1);
		}
		sc.close();
	}
}