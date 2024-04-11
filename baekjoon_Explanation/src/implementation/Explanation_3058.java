package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_3058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < t; i++) {
			String num = sc.nextLine();
			String[] array = num.split(" ");
			List<Integer> even = new ArrayList<>();
			int sum = 0;
			for(int j = 0; j < array.length; j++) {
				int number = Integer.parseInt(array[j]);
				if(number%2 == 0) {
					sum += number;
					even.add(number);
				}
			}
			System.out.println(sum+" "+Collections.min(even));
		}
		sc.close();
	}
}