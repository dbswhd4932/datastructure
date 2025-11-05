package coding_test.inflearn;

import java.util.Scanner;

// 직접 풀음
public class T0204 {
    
    public int[] solution(int n) {

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T0204 t = new T0204();
        int[] answerArr = t.solution(n);
        for (int i : answerArr) {
            System.out.print(i + " ");
        }

    }

}
