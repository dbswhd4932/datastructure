package coding_test.inflearn;

import java.util.Scanner;

public class T0208 {

    public String solution(int[] arr) {

        int[] answerArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
                answerArr[i] = rank;
            }
        }

        StringBuilder answerBuilder = new StringBuilder();
        for (int i : answerArr) {
            answerBuilder.append(i).append(" ");
        }

        return answerBuilder.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T0208 t = new T0208();
        System.out.println(t.solution(arr));
    }

}
