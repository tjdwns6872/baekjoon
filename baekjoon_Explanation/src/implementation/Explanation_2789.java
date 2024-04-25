package implementation;

import java.util.Scanner;

public class Explanation_2789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		String[] strArr = msg.split("C|A|M|B|R|I|D|G|E");
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
		sc.close();
	}
}
