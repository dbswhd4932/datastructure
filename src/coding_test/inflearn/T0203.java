package coding_test.inflearn;

import java.util.Scanner;

public class T0203 {

    public String[] solution(int[] arrA,
                             int[] arrB) {
        // 1 가위 2 바위 3 보
        String[] answerArr = new String[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            int diff = arrA[i] - arrB[i];

            // 1. A가 이기는 경우 (1, -2)
            if (diff == 1 || diff == -2) {
                answerArr[i] = "A";
            }
            // 2. 비기는 경우
            else if (diff == 0) {
                answerArr[i] = "D";
            }
            // 3. 나머지는 모두 B가 이기는 경우
            else {
                answerArr[i] = "B";
            }
        }

        return answerArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        T0203 t = new T0203();
        String[] answerArr = t.solution(arrA, arrB);
        for (String s : answerArr) {
            System.out.println(s);
        }
    }
}
