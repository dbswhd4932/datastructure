package coding_test.inflearn;

import java.util.Scanner;

// 소수(에라토스테네스 체) 알고리즘 사용해야함 -> 밭에 있는 잡초를 뽑는 듯이
public class T0205_2 {

    public int solution(int n) {
        int answer = 0;

        boolean[] ch = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!ch[i]) {
                answer++;

                for (int j = i; j <= n; j = j + i) {
                    ch[j] = true;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T0205_2 t = new T0205_2();
        System.out.println(t.solution(n));
    }

}