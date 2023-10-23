package implementation;
import java.util.*;
public class Explanation_5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hamburger = new int[3];
		int[] drink = new int[2];
		int set = 0;
		
		for(int i = 0; i < hamburger.length; i++) {
			hamburger[i] = sc.nextInt();
		}
		for(int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		set = hamburger[0];
		for(int i = 0; i < hamburger.length; i++) {
			if(set > hamburger[i]) {
				set = hamburger[i];
			}
		}
		set = drink[0] < drink[1] ? set+drink[0] : set+drink[1];
		System.out.println(set-50);
		sc.close();
	}
}