package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explanation_5717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			
			list.add(m+f);
			if(m == 0 && f == 0) {				
				break;
			}
		}
		for(int i = 0; i <(list.size()-1); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}

}
