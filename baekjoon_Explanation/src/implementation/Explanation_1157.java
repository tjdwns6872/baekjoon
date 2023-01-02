package implementation;

import java.util.*;
public class Explanation_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.next().toUpperCase();
		sc.close();
		int max=0;
		char str = 0;
		for(int i = 0; i < message.length(); i++) {
			int count = 1;
			for(int j = i+1; j < message.length(); j++) {
				if(message.charAt(i) == message.charAt(j)) {
					count++;
				}
				if(max < count) {
					str = message.charAt(i);
				}else if(max == count) {
					System.out.println("?");
					return;
				}
			}
		}
		System.out.println(str);
	}
}
