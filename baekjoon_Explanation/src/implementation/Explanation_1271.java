package implementation;
import java.math.BigInteger;
import java.util.*;
public class Explanation_1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger money = sc.nextBigInteger();
		BigInteger men = sc.nextBigInteger();
		System.out.println(money.divide(men));
		System.out.println(money.remainder(men));
		sc.close();
	}
}