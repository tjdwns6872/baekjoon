package implementation;

import java.util.*;
public class Explanation1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x;
		int y;
		int sum = 1;
		int[] number = new int[t];
		for(int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for(int z = 0; z < y; z++) {
				System.out.println("x:"+x);
				sum = sum*x;
				System.out.println("sum"+sum);
			}
			int num = Character.getNumericValue(Integer.toString(sum).charAt(Integer.toString(x).length()-1));
			if(num == 0) {
				num = 10;
			}
			number[i] = num;
			sum = 1;
		}
		for(int i = 0; i < t; i++) {
			System.out.println(number[i]);
		}
	}

}
