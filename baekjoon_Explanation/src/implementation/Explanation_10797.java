package implementation;

import java.util.Scanner;

public class Explanation_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int count = 0;
		
		int[] car = new int[5];
		for(int i = 0; i < car.length; i++) {
			car[i] = sc.nextInt();
			if(car[i] == day) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
