package test;

public class Ages {
    public static int solution(int age) {
        int year = 2022;
        return year - age + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(40));
    }
}
