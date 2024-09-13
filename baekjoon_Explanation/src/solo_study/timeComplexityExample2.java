package solo_study;

public class timeComplexityExample2 {
    // 시간 복잡도 판별 원리
    public static void main(String[] args) {
        System.out.println(one(100000));//n
        System.out.println(two(100000));//n
        System.out.println(three(100000));//n^2
    }

    public static int one(int n){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            cnt++;
        }
        return cnt;
    }

    public static int two(int n){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            cnt++;
        }
        for(int i = 0; i < n; i++){
            cnt++;
        }
        for(int i = 0; i < n; i++){
            cnt++;
        }
        return cnt;
    }

    public static int three(int n){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cnt++;
            }
        }
        return cnt;
    }
}
