package coding_test.inflearn;

import java.util.Scanner;

public class T0211 {

    public int solution(int n,
                        int[][] arr) {

        int answer = 0;
        int max = Integer.MIN_VALUE;

        // 기준 학생 i = n명 , 비교 학생 j = n명 , 학년 K
        for (int i = 0; i < n; i++) {

            // i 학생 마다 겹친 수 초기화
            int count = 0;

            // 비교
            for (int j = 0; j < n; j++) {

                // 같은 학생은 패스
                if (i == j) {
                    continue;
                }

                // k학년 돌아가면서 비교
                for (int k = 0; k < 5; k++) {
                    // i학생의 K학년 == j학생의 k학년
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }

                if (max < count) {
                    max = count;
                    answer = i + 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][5]; // 세로, 가로

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T0211 t = new T0211();
        System.out.println(t.solution(n, arr));
    }

}
