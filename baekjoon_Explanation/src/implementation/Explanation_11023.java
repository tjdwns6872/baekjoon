package implementation;

import java.util.Scanner;

public class Explanation_11023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String[] numList = number.split(" ");
		
		int sum = 0;
		
		for(int i =0; i < numList.length; i++) {
			sum += Integer.parseInt(numList[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}