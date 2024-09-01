package implementation;

import java.util.Scanner;

public class Explanation_2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 1){
            System.out.println(n);
        }else{
            long[] num = new long[n+1];
            num[1] = 1;
            for(int i = 2; i <= n; i++){
                num[i] = num[i-2] + num[i-1];
            }
            System.out.println(num[n]);
        }
        sc.close();
    }
}
