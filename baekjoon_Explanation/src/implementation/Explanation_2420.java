package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Explanation_2420 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		Long x = Long.parseLong(st.nextToken());
		Long y = Long.parseLong(st.nextToken());
		
		System.out.println(Math.abs(x - y));
	}
}