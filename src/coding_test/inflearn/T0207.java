package coding_test.inflearn;

import java.util.Scanner;

// 혼자풀음
public class T0207 {

    public int solution(int[] arr) {

        int answer = 0;
        int[] answerArr = new int[arr.length];

        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                score = score + 1;
                answerArr[i] = score;
            } else {
                answerArr[i] = 0;
                score = 0;
            }
        }

        for (int i : answerArr) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T0207 t = new T0207();
        System.out.println(t.solution(arr));
    }

}
