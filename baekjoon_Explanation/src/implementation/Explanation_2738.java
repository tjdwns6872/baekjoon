package implementation;

import java.util.*;
public class Explanation_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] number = new int[y*2][x];
		for(int i = 0;  i < number.length; i++) {
			for(int j = 0; j < x; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print(number[i][j]+number[i+y][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
