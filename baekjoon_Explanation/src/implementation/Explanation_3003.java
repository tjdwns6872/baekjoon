package implementation;
import java.util.*;
public class Explanation_3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int entire[] = {1, 1, 2, 2, 2, 8};
		int[] possession = new int[6];
		for(int i = 0; i < entire.length; i++) {
			possession[i] = sc.nextInt();
			entire[i] = entire[i] - possession[i];
		}
		sc.close();
		for(int i = 0; i < entire.length; i++) {
			System.out.print(entire[i]+" ");
		}
	}
}
