package implementation;

import java.util.Scanner;

public class Explanation_5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[4][2];
		int[] sum = new int[2];
		for(int i = 0; i < score[0].length; i++) {
			for(int j = 0; j < score.length; j++) {
				score[j][i] = sc.nextInt();
				sum[i] += score[j][i];
			}
		}
		if(sum[0] < sum[1]) {
			System.out.println(sum[1]);
		}else {
			System.out.println(sum[0]);
		}
		sc.close();
	}
}