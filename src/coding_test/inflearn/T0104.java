package coding_test.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class T0104 {

    public ArrayList<String> solution(int n,
                                      String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            answer.add(new StringBuilder(s).reverse().toString());
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        T0104 t = new T0104();
        for (String x : t.solution(n, str)) {
            System.out.println(x);
        }
    }
}
