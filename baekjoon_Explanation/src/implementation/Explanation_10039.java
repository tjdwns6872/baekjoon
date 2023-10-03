package implementation;
import java.util.*;
public class Explanation_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int ave = 0;
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(score[i] < 40) {
				score[i] = 40;
			}
			ave += score[i];
		}
		System.out.println(ave/score.length);
		
		sc.close();
	}
}