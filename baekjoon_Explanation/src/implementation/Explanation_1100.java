package implementation;

import java.util.Scanner;

public class Explanation_1100 {
	public static void main(String[] args) {
//		char[][] chess = new char[8][8];
//		Scanner sc = new Scanner(System.in);
//		int ck=0;
//		
//		for(int i = 0; i < chess.length; i++) {
//			for(int j = 0; j < chess[0].length; j++) {
//				chess[i][j] = sc.next().charAt(0);
//			}
//		}
//		for(int i = 0; i < chess.length; i++) {
//			for(int j = 0; j < chess[0].length; j++) {
//				if((i == 0 || i % 2 == 0)&&(j == 0 || j % 2 == 0)) {
//					if(chess[i][j] == 'F') {
//						ck++;
//					}
//				}else if ((i % 2 != 0)&&(j % 2 != 0)) {
//					if(chess[i][j] == 'F') {
//						ck++;
//					}
//				}
//			}
//		}
//		System.out.println(ck);
		String[] chess = new String[8];
		Scanner sc = new Scanner(System.in);
		int ck = 0;
		for(int i = 0; i < chess.length; i++) {
			for(int j = 0; j < chess[0].length(); j++) {
				chess[i] = sc.next();
			}
			System.out.println(chess[i]);
		}
	}
}






