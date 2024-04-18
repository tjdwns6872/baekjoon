package implementation;

import java.util.Scanner;

public class Explanation_5523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			int[] score = new int[2];
			for(int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
			}
			if(score[0] > score[1]) {
				a += 1;
			}else if(score[0] < score[1]){
				b += 1;
			}
		}
		System.out.println(a+" "+b);
		sc.close();
	}
}