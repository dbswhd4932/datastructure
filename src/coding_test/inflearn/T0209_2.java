package coding_test.inflearn;

import java.util.Scanner;

public class T0209_2 {

    static int[][] arr = new int[50][50];

    public int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        int cross1 = 0; // (\) 합계
        int cross2 = 0; // (/) 합계

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                // 가로 합
                rowSum += arr[i][j];

                // 세로 합
                colSum += arr[j][i];
            }

            max = Math.max(max, rowSum);
            max = Math.max(max, colSum);

            // 대각선 합
            cross1 += arr[i][i];
            cross2 += arr[i][n - i - 1];

            max = Math.max(max, cross1);
            max = Math.max(max, cross2);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T0209_2 t = new T0209_2();
        System.out.println(t.solution(n, arr));
    }

}
