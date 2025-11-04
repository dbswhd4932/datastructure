package coding_test.inflearn;

import java.util.Scanner;

public class T0110 {

    public String solution(String str, char c) {
        int n = str.length();
        int[] answer = new int[n];
        int distance = 100;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == c) {
                distance = 0;
            } else {
                distance ++;
            }
            answer[i] = distance;
        }

        distance = 100;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                distance = 0;
            } else {
                distance ++;
            }
            answer[i] = Math.min(answer[i], distance);
        }

        // 배열을 공백으로 구분된 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]);
            if (i < n - 1) { // 마지막 숫자가 아니면 공백 추가
                sb.append(" ");
            }
        }
        return sb.toString();


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        String str = parts[0];
        char c = parts[1].charAt(0);

        T0110 t = new T0110();
        System.out.println(t.solution(str, c));
    }

}
