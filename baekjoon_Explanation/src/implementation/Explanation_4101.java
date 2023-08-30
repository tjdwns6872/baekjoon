package implementation;
import java.util.*;
public class Explanation_4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0) {				
				break;
			}else {
				if(x > y) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
		sc.close();
	}
}
