package implementation;
import java.util.Scanner;
public class Explanation_2530 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int sumSec = sc.nextInt();
		
		min += hour*60;
		sec += min*60;
		sumSec += sec;
		
		System.out.println(sumSec);
		System.out.println(sumSec/60%60);
		System.out.println(sumSec/60/60);
		System.out.println(sumSec%60);
		
		if((sumSec/60/60) >= 24) {
			hour = (sumSec/60/60)-24;
		}else {			
			hour = sumSec/60/60;
		}
		min = sumSec/60%60;
		sec = sumSec%60;
		System.out.println(hour+" "+min+" "+sec);*/
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int plusSec = sc.nextInt();
		
		sec += plusSec;
		min += (sec/60);
		sec = sec % 60;
		hour += (min/60);
		min = min%60;
		hour = hour % 24;
		
		System.out.println(hour+" "+min+" "+sec);
		sc.close();
	}

}

