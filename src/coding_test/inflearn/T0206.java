package coding_test.inflearn;

import java.util.Scanner;

public class T0206 {

    // 소수인지 확인하는 방법 : 2부터 제곱근으로 나누어 지는지
    // num이 소수이면 true, 아니면 false
    // 헬프함수
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String solution(int n,
                          String[] arr) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            String reverse = new StringBuilder(s).reverse().toString();
            int i = Integer.parseInt(reverse);

            boolean isPrime= isPrime(i);
            if (isPrime) {
                stringBuilder.append(i).append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        T0206 t = new T0206();
        System.out.println(t.solution(n, arr));
    }
}
