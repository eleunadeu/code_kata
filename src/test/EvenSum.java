package test;

public class EvenSum {
    public static int solution(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
