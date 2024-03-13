package implementation;

import java.util.Scanner;

public class Explanation_2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
		int area = sc.nextInt();
		int sum = person*area;
		int temp = 0;
		int[] newspaper = new int[5];
		
		for(int i=0; i < newspaper.length; i++) {
			temp = sc.nextInt();
			newspaper[i] = temp - sum;
		}
		for(int i = 0; i < newspaper.length; i++) {
			System.out.print(newspaper[i]+" ");
		}
		sc.close();
	}
}