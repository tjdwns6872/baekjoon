package implementation;
/*
영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오. 
 */
import java.util.*;
public class Explanation_2774 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String afterStr = "";
		for(int i = 0; i < str.length(); i++) {
			if((byte)str.charAt(i) <= 90) {
				afterStr += Character.toLowerCase(str.charAt(i));
			}else {
				afterStr += Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(afterStr);
		sc.close();
	}
}