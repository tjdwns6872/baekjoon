package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explanation_1453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> seat = new ArrayList<>();
		int customer = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < customer; i++) {
			int x = sc.nextInt();
			if(seat.contains(x)) {
				sum += 1;
			}else {
				seat.add(x);
			}
		}
		System.out.println(sum);
		sc.close();
	}
}