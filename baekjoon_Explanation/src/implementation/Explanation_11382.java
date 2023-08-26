package implementation;

import java.util.*;

public class Explanation_11382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = sc.nextLong() + x;
		long z = sc.nextLong() + y;
		sc.close();
		System.out.println(z);
	}
}