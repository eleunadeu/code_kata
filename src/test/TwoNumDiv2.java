package test;

public class TwoNumDiv2 {
    public static int solution(int num1, int num2) {
        double div = (double) num1 / num2;
        return (int) (div * 1000);
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
    }
}
