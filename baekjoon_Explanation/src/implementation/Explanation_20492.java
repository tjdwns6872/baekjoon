package implementation;
import java.util.*;
public class Explanation_20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long money = sc.nextLong();
		int tax = 22;
		long if1 = money - (money*tax/100);
		long if2 = money*20/100;
		if2 = money - (if2*tax/100);
		System.out.println(if1+" "+if2);
		sc.close();
	}
}