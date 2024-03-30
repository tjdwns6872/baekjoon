package implementation;

import java.util.Scanner;

public class Explanation_1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 0;
		int m = 0;
		for(int i = 0; i < n; i++) {
			int call = sc.nextInt();
			y += ((call/30)+1)*10;
			m += ((call/60)+1)*15;
		}
		if(y == m) {
			System.out.println("Y M "+y);
		}else if(y > m) {
			System.out.println("M "+m);
		}else {
			System.out.println("Y "+y);
		}
		sc.close();
	}
}