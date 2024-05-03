package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explanation_10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        while(str != null) {
            int s = 0;
            int x = 0;
            int n = 0;
            int z = 0;
            
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') s++;
                else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') x++;
                else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') n++;
                else z++;
            }
            
            System.out.println(s+" "+x+" "+n+" "+z);
            str = br.readLine();
        }
	}

}