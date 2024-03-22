package implementation;
import java.util.Scanner;
public class Explanation_5524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] name = new String[n];
		for(int i=0; i < name.length; i++) {
			name[i] = sc.next().toLowerCase();
		}
		for(int i=0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		sc.close();
	}
}