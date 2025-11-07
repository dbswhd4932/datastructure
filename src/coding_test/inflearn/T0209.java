package coding_test.inflearn;

import java.util.Scanner;

public class T0209 {

    static int[][] arr = new int[50][50];

    public int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;

        int width = 0;
        int height = 0;
        int cross = 0;

        // 가로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                width += arr[i][j];
            }
            if (width > max) {
                max = width;
            }
            width = 0;
        }

        // 세로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                height += arr[j][i];
            }
            if (height > max) {
                max = height;
            }
            height = 0;
        }

        // 대각선
        for (int i = 0; i < n; i++) {
            cross += arr[i][i];
        }
        if (cross > max) {
            max = cross;
        }

        cross = 0;
        for (int i = n - 1; i >= 0; i--) {
            cross += arr[i][i];
        }
        if (cross > max) {
            max = cross;
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

        T0209 t = new T0209();
        System.out.println(t.solution(n, arr));

    }
}
