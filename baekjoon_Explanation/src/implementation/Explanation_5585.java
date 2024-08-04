package implementation;

import java.util.Scanner;

public class Explanation_5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int total = 1000-price;
		int count = 0;
		
		count += total/500;
		total = total%500;
		count += total/100;
		total = total%100;
		count += total/50;
		total = total%50;
		count += total/10;
		total = total%10;
		count += total/5;
		total = total%5;
		count += total/1;
		total = total%1;
		System.out.println(count);
		sc.close();
	}

}
