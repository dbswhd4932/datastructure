package coding_test.inflearn;

import java.util.Scanner;

// 혼자 풀음
public class T0202 {

    public int solution(int[] intArr) {
        // 맨 처음 학생은 무조건 보임
        int answer = 1;

        int max = intArr[0];
        for (int i = 0; i < intArr.length - 1; i++) {
            if (max < intArr[i + 1]) {
                answer ++;
                max = intArr[i + 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        T0202 t = new T0202();
        System.out.println(t.solution(intArr));
    }

}
