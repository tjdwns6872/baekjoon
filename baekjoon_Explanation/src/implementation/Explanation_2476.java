package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> dice = new ArrayList<>();
		List<Integer> money = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				dice.add(sc.nextInt());
			}
			if(dice.get(0).equals(dice.get(1)) && dice.get(0).equals(dice.get(2))) {
				money.add(10000+(dice.get(0)*1000));
			}else if(!dice.get(0).equals(dice.get(1)) && !dice.get(0).equals(dice.get(2)) && !dice.get(1).equals(dice.get(2))) {
				money.add(Collections.max(dice)*100);
			}else {
				int num = 0;
				if(dice.get(0).equals(dice.get(1)) || dice.get(0).equals(dice.get(2))) {
					num = dice.get(0);
				}else {
					num = dice.get(1);
				}
				money.add(1000+(num*100));
			}
			dice.clear();
		}
		System.out.println(Collections.max(money));
		sc.close();
	}

}
