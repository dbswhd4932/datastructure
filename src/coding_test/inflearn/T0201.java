package coding_test.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

// 혼자 풀음
public class T0201 {

    public String solution(int[] intArr) {
        ArrayList<Integer> answerArr = new ArrayList<>();

        answerArr.add(intArr[0]);
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i + 1]) {
                answerArr.add(intArr[i + 1]);

            }
        }

        StringBuilder answerBuilder = new StringBuilder();
        for (Integer i : answerArr) {
            answerBuilder.append(i);
            answerBuilder.append(" ");
        }
        return answerBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        T0201 t = new T0201();
        System.out.println(t.solution(intArr));
    }

}
