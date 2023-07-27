package implementation;

import java.util.*;
public class Explanation1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x;
		int y;
		Integer[] number = new Integer[t];
		for(int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for(int z = 0; z < y; z++) {
				x *= y;
			}
			System.out.println("x:"+x);
			System.out.println("Integer.toString(x) : "+Integer.toString(x));
			System.out.println("Integer.toString(x).charAt(Integer.toString(x).length()-1):"+Integer.toString(x).charAt(Integer.toString(x).length()-1));
			System.out.println(Integer.valueOf(Integer.toString(x).charAt(Integer.toString(x).length()-1)));
			number[i] = Integer.valueOf(Integer.toString(x).charAt(Integer.toString(x).length()-1));
			System.out.println(number[i]);
		}
	}

}
