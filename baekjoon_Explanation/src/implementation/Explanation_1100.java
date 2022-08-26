package implementation;

import java.util.Scanner;

public class Explanation_1100 {
	public static void main(String[] args) {
		String[][] chess = new String[8][8];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				chess[i][j] = sc.next();
				if(i == 0 || i % 2 == 0) {
					if(j == 0 || j % 2 == 0) {
						//count
					}
				}
			}
		}
	}
}
