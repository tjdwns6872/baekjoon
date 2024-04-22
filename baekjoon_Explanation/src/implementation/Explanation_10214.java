package implementation;

import java.util.Scanner;

public class Explanation_10214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int y = 0;
			int k = 0;
			for(int j = 0; j < 9; j++) {
				y += sc.nextInt();
				k += sc.nextInt();
			}
			if(k<y) {
				System.out.println("Yonsei");
			}else if(k>y) {
				System.out.println("Korea");
			}else {
				System.out.println("Draw");
			}
		}
		sc.close();
	}
}
