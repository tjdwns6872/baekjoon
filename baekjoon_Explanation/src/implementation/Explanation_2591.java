package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explanation_2591 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		if(list.size()<k) {
			System.out.println(0);
		}else {
			System.out.println(list.get((k-1)));
		}
		sc.close();
	}
}