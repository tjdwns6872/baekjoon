package implementation;

import java.util.Scanner;

public class Explanation_17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		String str = null;
		sc.close();
		if((s+k+h) < 100) {
			if(s < k && s < h) {
				str = "Soongsil";
			}else if(k < s && k < h) {
				str = "Korea"; 
			}else {
				str = "Hanyang";
			}
		}else {
			str = "OK";
		}
		System.out.println(str);
	}
}