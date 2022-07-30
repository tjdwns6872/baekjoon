package step_Io;
import java.util.*;
public class explanation3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();
		System.out.println(numA*(numB%10));
		System.out.println(numA*((numB/10)%10));
		System.out.println(numA*(numB/100));
		System.out.println(numA*numB);
	}
}
