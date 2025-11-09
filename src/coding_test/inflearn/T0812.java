package coding_test.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point_T0812 {

    int x;
    int y;

    public Point_T0812(int x,
                       int y) {
        this.x = x;
        this.y = y;
    }
}

public class T0812 {

    static int m; // 가로
    static int n; // 세로
    static int[][] box, day;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point_T0812> q = new LinkedList<>();
    static int maxDay = 0;

    public int solution() {
        // BFS 시작
        while (!q.isEmpty()) {
            Point_T0812 current = q.poll();
            // 상,하,좌,우 체크
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                // 조건에 맞으면
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && box[ny][nx] == 0) {
                    // 익힘(1)
                    box[ny][nx] = 1;
                    // 날짜 기록
                    day[ny][nx] = day[current.y][current.x] + 1;
                    // 큐에 담기
                    q.offer(new Point_T0812(nx, ny));
                }
            }
        }

        // BFS 종료 후
        maxDay = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 토마토가 모두 익지는 못하는 상황이면
                if (box[i][j] == 0) {
                    return -1;
                }
                maxDay = Math.max(maxDay, day[i][j]);
            }
        }

        return maxDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt(); // 가로
        n = sc.nextInt(); // 세로
        box = new int[n][m];
        day = new int[n][m];

        int unripeCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();

                if (box[i][j] == 1) {
                    q.offer(new Point_T0812(j, i));
                } else if (box[i][j] == 0) {
                    unripeCount++;
                }
            }
        }

        // 처음부터 익지 않은 토마토가 없을 경우
        if (unripeCount == 0) {
            System.out.println(0);
        } else {
            T0812 t = new T0812();
            System.out.println(t.solution());
        }
    }
}
