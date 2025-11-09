package coding_test.inflearn;

import java.awt.*;
import java.util.Scanner;

public class T0210 {

    // 상,하,좌,우 방향 설정
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                boolean result = true; // 봉우리 체크

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (arr[i][j] <= arr[nx][ny]) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T0210 t = new T0210();
        System.out.println(t.solution(n, arr));
    }
}
