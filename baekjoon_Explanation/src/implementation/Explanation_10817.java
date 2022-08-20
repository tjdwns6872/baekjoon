package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explanation_10817 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.sort(null);
		System.out.println(list.get(1));
		
	}
}
