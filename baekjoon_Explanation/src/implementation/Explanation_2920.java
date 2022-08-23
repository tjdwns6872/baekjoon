package implementation;

import java.util.Scanner;
public class Explanation_2920 {
	public static void main(String[] args) {
		int[] num = new int[8];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 1; i < num.length; i++) {
			for(int j = i-1; j < num.length; j++) {
				if(num[0] == 1 && num[j] == num[i]-1) {
					count++;
				}else if(num[0] == 8 && num[j] == num[i]+1) {
					count1++;
				}
			}
		}
		if(count == 7) {
			System.out.println("ascending");
		}else if(count1 == 7) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		sc.close();
	}
}
