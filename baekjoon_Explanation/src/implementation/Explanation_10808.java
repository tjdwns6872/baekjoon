package implementation;
import java.util.*;
public class Explanation_10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] sp = new int[26];
		for(int i = 0; i < str.length(); i++) {
			sp[(int)str.charAt(i)-97] += 1;
		}
		for(int i = 0; i < sp.length; i++) {
			System.out.print(sp[i]+" ");
		}
		sc.close();
	}
}