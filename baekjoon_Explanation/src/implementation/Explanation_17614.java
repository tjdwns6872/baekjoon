package implementation;

import java.util.Scanner;

public class Explanation_17614 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			String str = Integer.toString(i);
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				for(int j = 0; j < str.length(); j++) {
					if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9') {
						sum+=1;
					}
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}