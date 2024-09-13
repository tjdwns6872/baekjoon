package solo_study;

public class timeComplexityExample1 {
    public static void main(String[] args) {
        // 시간 복잡도 예제
        int findNumber = (int)(Math.random() * 100);
        for(int i = 0; i < 100; i++){
            if(i == findNumber){
                System.out.println(i);
                break;
            }
        }
    }
}
