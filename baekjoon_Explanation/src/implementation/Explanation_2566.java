package implementation;

import java.util.*;
public class Explanation_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] number = new int[9][9];
		int max = 0;
		int col = 0, row = 0;
		
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j < number[i].length; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j < number[i].length; j++) {
				if(max < number[i][j]) {
					max = number[i][j];
					col = i;
					row = j;
				}
			}
		}
		System.out.println(max);
		System.out.print(col+1);
		System.out.print(" ");
		System.out.print(row+1);
	}

}
